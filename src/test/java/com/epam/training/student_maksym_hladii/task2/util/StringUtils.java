package com.epam.training.student_maksym_hladii.task2.util;

import java.util.List;

public class StringUtils {

    public static String findElementInList(List<String> list, String element) {
        return list.stream().filter(str -> str.contains(element)).toList().get(0);
    }

}
