package doubly_linked_list;

/****************************************************************************
 * Author: Jiayi.Yi
 * Date: 2023/3/1
 * jdk version: java 17.0.3.1 2022-04-22 LTS
 * 系统版本： Windows 11 家庭版 20H2
 * IDE: IntelliJ IDEA
 * 编程语言: Java
 * =========== ====== ===== ==============================================
 * @Copyright (C) Yijiayi All Rights reserved
 *****************************************************************************/
public class Instance {
    public static void main(String[] args) {
        Doubly_linkedList doubly_linkedList =  new Doubly_linkedList();

        doubly_linkedList.addDoublyLinkedListByHead( new Node("八重神子" , 300 , "80187")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("神里绫华" , 20 , "24224")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("钟离" , 5000 , "5090")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("夜兰" , 25 , "79188")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("纳西妲" , 3000 , "44157")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("雷电将军" , 300 , "60137")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("艾尔海森" , 26 , "57170")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("胡桃" , 18 , "37217")) ;
        doubly_linkedList.addDoublyLinkedListByHead( new Node("迪卢克" , 30 , "60140")) ;
        doubly_linkedList.addDoublyLinkedListByHead(new Node("刻晴" , 20 , "60200"));
        doubly_linkedList.ShowDoublyLinkedListByDESC();

        System.out.println("-----------***-----------");

        doubly_linkedList.ShowDoublyLinkedListByORDER();

        System.out.println("-----------***-----------");

        doubly_linkedList.insertDoublyLinkedList(10 , new Node("琴", 31 , "53130")) ;

        doubly_linkedList.ShowDoublyLinkedListByDESC();

        System.out.println("-----------***-----------");

        doubly_linkedList.ShowDoublyLinkedListByORDER();

        System.out.println("-----------***-----------");

        doubly_linkedList.deleteDoublyLinkedList(11) ;

        doubly_linkedList.ShowDoublyLinkedListByDESC();

        System.out.println("-----------***-----------");

        doubly_linkedList.ShowDoublyLinkedListByORDER();

        System.out.println("-----------***-----------");

        doubly_linkedList.changeDoublyLinkedList(4 , new Node("七七", 0 , "00000")) ;

        doubly_linkedList.ShowDoublyLinkedListByORDER();


    }
}
