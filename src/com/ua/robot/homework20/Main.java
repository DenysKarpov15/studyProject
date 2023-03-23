package com.ua.robot.homework20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> ukrIntDict = new HashMap<>();
        ukrIntDict.put("велике", List.of("great", "大きい", "großartig"));
        ukrIntDict.put("мистецтво", List.of("art", "美術", "mystik"));
        ukrIntDict.put("навчитися", List.of("to learn", "学ぶために", "lernen"));
        ukrIntDict.put("багато", List.of("many", "多くの", "reich"));
        ukrIntDict.put("це", List.of("it", "それ", "es"));
        ukrIntDict.put("братися", List.of("take up", "取り上げる", "aufheben"));
        ukrIntDict.put("відразу", List.of("at once", "一気に", "auf einmal"));
        ukrIntDict.put("за", List.of("by", "に", "von"));
        ukrIntDict.put("небагато", List.of("little", "少し", "ein bisschen"));
        ukrIntDict.put("Джон Лок", List.of("John Locke", "ジョン・ロック", "John Locke"));

        printTranslation(ukrIntDict, "мистецтво");
        printTranslation(ukrIntDict, "багато");

    }

    public static void printTranslation(Map<String, List<String>> dict, String word) {
        System.out.println(dict.get(word));
    }
}
