/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.priorityqueuearray;

/**
 *
 * @author kamau
 */
public class PriorityQueue {

    private int MAX;
    private int arr[];
    private int nitems;

    public PriorityQueue() {
        MAX = 10;
        arr = new int[MAX];
        nitems = 0;
    }

    public void insert(int val) {
        int i;
        if (nitems == 0) {
            arr[0] = val;
            nitems++;
            return;
        }
        for (i = nitems - 1; i >= 0; i--) {
            if (val > arr[i]) {
                arr[i + 1] = arr[i];
            } else {
                break;
            }

        }
        arr[i + 1] = val;
        nitems++;
    }

    public void printPriorityQueue() {
        for (int i = 0; i < nitems; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int remove() {
        return arr[--nitems];
    }

    public boolean isEmpty() {
        return nitems == 0;
    }

    public int peek() {
        return arr[nitems - 1];
    }

    public boolean isFulll() {
        return nitems == MAX;
    }
}
