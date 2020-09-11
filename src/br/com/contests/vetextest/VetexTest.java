package br.com.contests.vetextest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VetexTest {

    public static void initTest() {
        HashMap<Integer, String> entry = new HashMap<>();

        fillUser(1, 'A', entry);
        fillUser(2, 'B', entry);
        fillUser(1, 'C', entry);
        fillUser(2, 'A', entry);
        fillUser(2, 'C', entry);
        fillUser(1, 'D', entry);
        fillUser(2, 'D', entry);
        fillUser(1, 'B', entry);

        for (String str : getMostThreeVisitedPages(entry)) {
            System.out.println(str);
        }
    }

    private static void fillUser(int i, char d, HashMap<Integer, String> entryUserMap) {
        var value = entryUserMap.get(i);
        entryUserMap.put(i, value == null ? String.valueOf(d) : value.concat(String.valueOf(d)));
    }

    private static List<String> getMostThreeVisitedPages(HashMap<Integer, String> entryUserMap) {
        ArrayList<ArrayList<String>> mostVisitedPages = getUserMostVisitedPages(entryUserMap);

        HashMap<String, Integer> solution = countUserVisitedPages(mostVisitedPages);

        var mostVisitedPagesOrdered = solution.entrySet()
                                              .stream()
                                              .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                              .collect(Collectors.toList());

        return mostVisitedPagesOrdered.stream()
                                      .filter(m -> m.getValue()
                                                    .equals(mostVisitedPagesOrdered.get(0)
                                                                                   .getValue()))
                                      .map(Map.Entry::getKey)
                                      .collect(Collectors.toList());
    }

    private static HashMap<String, Integer> countUserVisitedPages(ArrayList<ArrayList<String>> mostVisitedPages) {
        var solution = new HashMap<String, Integer>();

        for (ArrayList<String> mostVisitedPage : mostVisitedPages) {
            for (String visitedPages : mostVisitedPage) {
                var count = solution.get(visitedPages);
                solution.put(visitedPages, count == null ? 1 : count + 1);
            }
        }
        return solution;
    }

    private static ArrayList<ArrayList<String>> getUserMostVisitedPages(HashMap<Integer, String> entryUserMap) {
        var userMostVisitedPages = new ArrayList<ArrayList<String>>();

        var userIds = entryUserMap.keySet();

        userIds.forEach(user -> {
            var historic = entryUserMap.get(user);

            var setLastUserPages = new ArrayList<String>();

            for (int i = 0; i < historic.length() - 2; i++) {
                setLastUserPages.add(historic.substring(i, i + 3));
            }

            userMostVisitedPages.add(setLastUserPages);
        });

        return userMostVisitedPages;
    }
}
