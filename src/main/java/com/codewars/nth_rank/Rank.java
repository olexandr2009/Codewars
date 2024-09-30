package com.codewars.nth_rank;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rank {
    public static String nthRank(String st, Integer[] we, int n) {
        if (st.isEmpty()) {
            return "No participants";
        }
        String[] split = st.split(",");
        if (n > split.length) {
            return "Not enough participants";
        }

        for (int i = 0; i < split.length; i++) {
            String name = split[i];
            countNameRank(name);
        }
        // your code
        return "";
    }

    private static int countNameRank(String name) {
        return name.toUpperCase().chars().boxed().reduce(0, (a,b) -> a+b-64);
    }

    public static void main(String[] args) {
        System.out.println(countNameRank("NAME"));
        System.out.println("Fixed Tests");
        String st = "";
        Integer[] we = new Integer[]{4, 2, 1, 4, 3, 1, 2};
        assertEquals("No participants", Rank.nthRank(st, we, 4));
        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[]{4, 2, 1, 4, 3, 1, 2};
        assertEquals("Not enough participants", Rank.nthRank(st, we, 8));
        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[]{4, 2, 1, 4, 3, 1, 2};
        assertEquals("Benjamin", Rank.nthRank(st, we, 4));
        st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        we = new Integer[]{1, 3, 5, 5, 3, 6};
        assertEquals("Matthew", Rank.nthRank(st, we, 2));
    }
}
