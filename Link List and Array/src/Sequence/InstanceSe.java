package Sequence;

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
public class InstanceSe {

    public static void main(String[] args) {

        // 创建一个线性表
        Sequence sequence = new Sequence(20) ;

        int length = sequence.getLength() ;


        Random random = new Random() ;

        for (int i = 0 ; i < 10 ; ++ i){
            sequence.addArray( random.nextInt(100) );
        }


        sequence.showArray();


        if ( sequence.insertArray(100 , 10) == true ) {
            System.out.println("insert succeed");
        }else{
            System.out.println("insert failed");
        }

        sequence.showArray();

        if ( sequence.deleteArray(10) == true ) {
            System.out.println("delete succeed");
        }else{
            System.out.println("delete failed");
        }

        sequence.showArray();

        int loc = sequence.SearchArray(130) ;

        if (loc == -1){
            System.out.println("Fail to find");
        }else {
            System.out.println("Location of the num is " + loc);
        }

        sequence.showArray();


        if (sequence.changeArray(89 , 10)  == true){
            System.out.println("Change Succeed");
        }else {
            System.out.println("Fail to change");
        }
        sequence.showArray();
    }
}
