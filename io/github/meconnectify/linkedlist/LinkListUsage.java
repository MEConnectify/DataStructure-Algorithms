package io.github.meconnectify.linkedlist;

import java.util.List;

public class LinkListUsage {

    public static void main(String[] arg) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<String> list = new java.util.LinkedList<>();


        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.size());
    }
}
