package com.codewars.four_kyu.mix_str;

import java.nio.CharBuffer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StrMixer {
    public static String mix(String s1, String s2) {
      if (s1.equals(s2)) {
        return "";
    }

    Map<Character, Long> charactersFromS1 = calculateCharacterFrequency(s1);
    Map<Character, Long> charactersFromS2 = calculateCharacterFrequency(s2);
    List<Character> allCharacters = new ArrayList<>(charactersFromS1.keySet());
    allCharacters.addAll(charactersFromS2.keySet());
    allCharacters = allCharacters.stream().distinct().toList();

    List<String> result = new ArrayList<>();

    for (int i = 0; i < allCharacters.size(); i++) {
        StringBuilder sb = new StringBuilder();
        char current = allCharacters.get(i);
        long frequency_1 = charactersFromS1.getOrDefault(current, 0L);
        long frequency_2 = charactersFromS2.getOrDefault(current, 0L);
        long frequency = Math.max(frequency_1, frequency_2);

        if (frequency_1 == frequency_2) {
            sb.append('=');
        } else {
            sb.append(frequency_1 > frequency_2 ? '1' : '2');
        }
        sb.append(':');

        for (int j = 0; j < frequency; j++) {
            sb.append(current);
        }

        result.add(sb.toString());
    }

        return result.stream()
                .sorted(Comparator.comparing(String::length)
                        .reversed()
                        .thenComparing(s -> s.isEmpty() ? -1 : s.charAt(0))
                        .thenComparing(Function.identity())
                )
            .collect(Collectors.joining("/"));
}

    private static Map<Character, Long> calculateCharacterFrequency(String s) {
        return CharBuffer.wrap(s.toCharArray())
                .chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isAlphabetic)
                .filter(c -> Character.toUpperCase(c) != c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
