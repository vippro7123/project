/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sopvn.demosingleton.model.db;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khiemle
 */
public class MyList<T> {

    class Node<T> {

        T val;

        public Node() {
        }

        public Node(T newVal) {
            val = newVal;
        }
        Node<T> next = null;
    }
    private Node<T> root = null;

    public void Add(T item) {
        Node<T> newNode = new Node();
        if (root == null) {
            root = new Node(item);
        } else {
            root.next = newNode;
        }
    }
}
