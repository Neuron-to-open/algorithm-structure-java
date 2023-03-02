package SingleLink_node;

import java.util.Random;

/****************************************************************************
 * Author: Jiayi.Yi
 * Date: 2023/3/2
 * jdk version: java 17.0.3.1 2022-04-22 LTS
 * 系统版本： Windows 11 家庭版 20H2
 * IDE: IntelliJ IDEA
 * 编程语言: Java
 * =========== ====== ===== ==============================================
 * @Copyright (C) Yijiayi All Rights reserved
 *****************************************************************************/
public class Instance {
    public static void main(String[] args) {
        SingleLink singleLink = new SingleLink(10) ;
        Random random = new Random() ;

        for (int i = 0 ; i < 5 ; ++i){
            Node node = new Node( random.nextInt(100) ) ;
            singleLink.addLinked( node ) ;
            System.out.printf("%d " , node.getScore());
        }

        System.out.println("----------*****----------");
        singleLink.ShowArray();
        System.out.println("  ");

        System.out.println("------------******--------");
        singleLink.insertSingleLinked(5 , new Node(59)) ;
        singleLink.ShowArray();

        if ( singleLink.SearchSingleLinkedList(9) != -1){
            System.out.println("Succeed");
        }else {
            System.out.println("Fail");
        }
    }
}
