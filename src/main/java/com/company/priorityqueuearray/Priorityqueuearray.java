/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.priorityqueuearray;

/**
 *
 * @author kamau
 */
public class Priorityqueuearray {
    //the most prioritized element is always at the end
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.insert(12);
        q.insert(7);
        q.insert(10);
        q.insert(1);
        q.insert(8);
        
        q.printPriorityQueue();
        System.out.println();
        System.out.println(q.remove()+" removed");
        q.printPriorityQueue();
    }
}
