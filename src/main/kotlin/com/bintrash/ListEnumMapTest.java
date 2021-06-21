package com.bintrash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class ListEnumMapTest {

    public static void main(String[] args) {
        HashMap<String, List<Status>> stringListHashMap = new HashMap<>();

        stringListHashMap.put("asd", Arrays.asList(Status.NEW, Status.OLD));

        System.out.println(stringListHashMap.get("asd").contains("NEW"));
    }
}
