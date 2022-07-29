package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortingMapReverese_BasedOnValues {

	public static Map<String, Integer> sortByValue(Map<String, Integer> wordCounts) {

		return wordCounts.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("USA", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);
		wordCounts.put("USA", 100);

		Map<String, Integer> sortedByCount = sortByValue(wordCounts);

		System.out.println(sortedByCount);
	}
}
