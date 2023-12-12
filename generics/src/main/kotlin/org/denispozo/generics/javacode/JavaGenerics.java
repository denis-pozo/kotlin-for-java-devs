package org.denispozo.generics.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.get(0).toUpperCase();

        List list1 = new ArrayList();
        list.add("Goodbye");
    }

}
