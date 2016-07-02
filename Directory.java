package com.third_module.first_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory {


    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        files.add("audio");
        files.add("image");
        files.add("text");

        Iterator<String> iterator =files.iterator();

        if (files == null) {
            iterator.remove();
        }
    }
}
