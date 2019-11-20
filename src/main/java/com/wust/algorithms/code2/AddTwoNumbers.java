package com.wust.algorithms.code2;

/**
 * @author wxl
 * @date 2019/11/20
 * @description
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int shang = 0;
        int count = 0;
        ListNode l = new ListNode(0);
        ListNode result = null;

        while( (l1 != null || l2 != null) ){

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            count = shang + x + y ;
            int yushu = count % 10;
            if(count >= 10){
                shang = 1;
            }else{
                shang = 0;
            }

            if(result == null ){
                result = new ListNode(yushu);
                result.next = null;
                l.next = result;
            }else{
                ListNode zhongjian = new ListNode(yushu);
                zhongjian.next = null;
                result.next = zhongjian;
                result = result.next;
            }

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
        }

        if (shang > 0) {
            result.next = new ListNode(shang);
        }

        return l.next;
    }

    public static void main(String[] args) {

        ListNode test1 = new ListNode(2);
        ListNode test11 = new ListNode(4);
        ListNode test111 = new ListNode(3);
        test11.next = test111;
        test1.next = test11;

        ListNode test2 = new ListNode(5);
        ListNode test22 = new ListNode(6);
        ListNode test222 = new ListNode(4);
        test22.next = test222;
        test2.next = test22;

        ListNode listNode = addTwoNumbers(test1, test2);
        while(listNode != null){

            System.out.print(listNode.val);
            if(listNode.next != null){
                System.out.print(" -> ");
            }

            listNode = listNode.next;
        }
    }
}
