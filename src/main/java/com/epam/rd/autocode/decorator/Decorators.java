package com.epam.rd.autocode.decorator;

import java.util.ArrayList;
import java.util.List;

public class Decorators {
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i += 2)
            list.add(sourceList.get(i));
        return list;
    }


}
