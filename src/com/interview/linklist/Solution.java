package com.interview.linklist;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * <p>
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 *
 * @author Jerry
 * @create 2020-07-12 15:28
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToList(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        //存储结果的list
        ArrayList<Integer> list = new ArrayList<>();
        //借助栈
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            //入栈
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            //出栈
            list.add(stack.pop().val);
        }
        return list;
    }

    public ListNode findKthToTail(ListNode head,int k){
        if(head==null || k<=0){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        //假如 链表长度n寻找倒数第k个结点,即找到第n-k个结点即可
        // fast先走k步,slow再开始走n-k步即可
        while(k-->1){
            if(fast.next!=null){
                fast=fast.next;
            }else {
                return null;
            }
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }


}
