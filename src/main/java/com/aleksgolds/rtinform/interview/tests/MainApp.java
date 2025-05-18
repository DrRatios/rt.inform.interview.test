package com.aleksgolds.rtinform.interview.tests;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<Object> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(i);
        }
        for (int i = 0; i < 5; i++) {
            testList.add(1);
            testList.add(5);
            testList.add(9);
        }

        System.out.println(checkNumberOfDuplicate(testList));
    }

    public static Map<Object, Integer> checkNumberOfDuplicate(List<Object> list){
        return list.stream().collect(Collectors.toMap(o->o,o->1,Integer::sum));
    }
}
