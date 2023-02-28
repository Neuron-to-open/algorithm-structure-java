package LinkList_instance;

import java.util.Random;

/****************************************************************************
 * Author: Jiayi.Yi
 * Date: 2023/2/28
 * jdk version: java 17.0.3.1 2022-04-22 LTS
 * 系统版本： Windows 11 家庭版 20H2
 * IDE: IntelliJ IDEA
 * 编程语言: Java
 * =========== ====== ===== ==============================================
 * @Copyright (C) Yijiayi All Rights reserved
 *****************************************************************************/
public class Instance {
    public static void main(String[] args) {
        LinkListance linkListance = new LinkListance(20) ;

        int length = linkListance.getLength() ;

        Random random = new Random() ;

        linkListance.showLinkedList();

        for (int i = 0 ; i < 10 ; ++i) {
            linkListance.addLinkedList( random.nextInt( 100) );
        }

        linkListance.showLinkedList();

        linkListance.insertLinkedList(100 , 10) ;

        linkListance.showLinkedList() ;

        System.out.println("length " + linkListance.getLinkedListLength());

        if (linkListance.deleteLinkedList(11)){
            System.out.println("Insert succeed");
        }else {
            System.out.println("Insert Failed");
        }

        linkListance.showLinkedList();

        if ( linkListance.SearchLinkedList(989) != -1){
            System.out.println("Search Succeed");
        }else {
            System.out.println("Search Failed");
        }

        linkListance.showLinkedList();

        if (linkListance.changeArray(789, 7)){
            System.out.println("Change Succeed");
        }else {
            System.out.println("Change Failed");
        }

        linkListance.showLinkedList();
    }


}
