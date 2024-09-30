package com.codewars.two_sorted_lists;

public class Solution {
    static ListNode head;
    static ListNode last;

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                addLast(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                addLast(list1.val);
                list1 = list1.next;
            } else {
                int value = compareValue(list1, list2);
                addLast(value);

                if (value == list1.val) {
                    list1 = list1.next;
                } else {
                    list2 = list2.next;
                }
            }
        }

        return head;
    }

    private static void addLast(int value) {
        ListNode l = last;
        ListNode newNode = new ListNode(value, null);
        last = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
    }

    private static int compareValue(ListNode list1, ListNode list2) {
        return Math.min(list1.val, list2.val);
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            if (next != null) {
                return val + next.toString();
            }
            return val + "";
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, null)));

        System.out.println(mergeTwoLists(list1, list2));
    }
}
