package io.github.meconnectify.linkedlist;

import java.util.ArrayList;
import java.util.List;

//TODO: add removeDataByIndex and removeDataByData

public class LinkedList<M> {

    Node<M> head;

    void add(M data) {
        if (isEmpty()) {
            head = new Node<>(data);
            return;
        }
        Node<M> p = head;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node<>(data);
    }

    M getByIndex(int index) {
        if (isEmpty()) throw new NullPointerException();
        if (head.next == null) return null;

        int counter = 0;
        Node<M> p = head;

        while (counter != index) {
            if (p.next == null) return null;
            counter++;
            p = p.next;
        }
        return p.data;
    }

    M getByData(M data) {
        if (isEmpty()) throw new NullPointerException();
        if (head.next == null) return null;

        Node<M> p = head;

        while (p.data != data) {
            if (p.next == null) return null;
            p = p.next;
        }
        return p.data;
    }

    List<M> asList() {
        if (isEmpty()) throw new NullPointerException();

        List<M> list = new ArrayList<>();
        Node<M> p = head;

        while (p.next != null) {
            list.add(p.data);
            p = p.next;
        }
        return list;
    }

    boolean contains(M data) {
        if (isEmpty()) throw new NullPointerException();
        Node<M> p = head;

        while (p.next != null) {
            if (p.data == data) return true;
            p = p.next;
        }
        return false;
    }

    int size() {
        if (isEmpty()) return 0;

        Node<M> p = head;
        int amount = 1;

        while (p.next != null) {
            amount++;
            p = p.next;
        }
        return amount;
    }

    boolean isEmpty() {
        return head == null;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }
}
