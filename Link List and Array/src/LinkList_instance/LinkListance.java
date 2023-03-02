package LinkList_instance;

import java.util.Iterator;
import java.util.LinkedList;

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
/**
 * 链表调用(LinkedList)
 * 1、insert、add、delete、show、getLength
 * */

public class LinkListance {
    private LinkedList<Integer> linkedList = new LinkedList<>() ;

    private int Length ;

    /**
     * 空参构造函数
     * */
    public LinkListance(){

    }

    /**
     * 含参数的构造器
     * */
    public LinkListance(int length){
        this.Length = length ;
    }

    /**
     *作用 ------向表中顺组增加函数
     * 返回值类型:void
     * 函数原型:public void addLinkedList(int num)
     * */
    public void addLinkedList(int num){
        this.linkedList.add( num ) ;
    }

    /**
     * 作用-----获取链表的长度
     * 返回值类型: int
     * 函数原型: public int getLinkedListLength()
     * */
    public int getLinkedListLength(){
        return this.linkedList.size() ;
    }

    /**
     * 作用-----获取初始值Length
     * 返回值类型: int
     * 函数原型: public int getLength()
     * */
    public int getLength(){
        return this.Length ;
    }

    /**
     * 作用-----向链表中指定位置插入数据
     * 返回值类型: boolean
     * 函数原型: public boolean insertLinkedList(int num , int loc)
     * */
    public boolean insertLinkedList(int num , int loc){
        //Length == 0
        if (this.Length == 0){
            if (loc <= this.linkedList.size()){
                this.linkedList.add(loc - 1 , num);
                return true ;
            }
        }else {
            if ( loc > 0 && loc <= this.linkedList.size() && this.linkedList.size() < this.Length){
                this.linkedList.add(loc -1 , num);
                return true ;
            }
        }
        return false ;
    }

    /**
     * 作用-----删除指定位置的数据
     * 返回值类型: boolean
     * 函数原型: public boolean deleteLinkedList(int loc)
     * */
    public boolean deleteLinkedList(int loc){
        if (this.Length == 0){
            if ( loc <= this.linkedList.size() && loc >0 ){
                this.linkedList.remove(loc-1) ;
                return true ;
            }
        }else {
            if ( loc <= this.linkedList.size() && loc >0 && this.linkedList.size() <= this.Length){
                this.linkedList.remove(loc - 1) ;
                return true ;
            }
        }
        return false ;
    }

    /**
     * 作用------输出表中的数据
     * 返回值类型: void
     * 函数原型: public void showLinkedList()
     * */
    public void showLinkedList(){
        Iterator iterator = this.linkedList.iterator() ;
        while (iterator.hasNext()){
            System.out.printf("%d " , iterator.next());
        }
        System.out.println();
    }

    /**
     * 作用-----查找某个元素
     * 返回值类型: int
     * 函数原型: public int SearchLinkedList(int num)
     * */
    public int SearchLinkedList(int num){
        for (int i = 0 ; i < this.linkedList.size() ; ++i){
            if (this.linkedList.indexOf( i ) == num ){
                return ( i + 1 ) ;
            }
        }
        return -1 ;
    }


    /**
     * 作用-----更改元素
     * 返回值类型: boolean
     * 函数原型: public boolean changeArray(int loc , int num)
     * */
    public boolean changeArray(int loc , int num){
        if (this.Length == 0){
            if ( loc <= this.linkedList.size() && loc > 0){
                this.linkedList.set(loc-1 , num) ;
                return true ;
            }
        }else {
            if ( loc >0 && loc <= this.linkedList.size() && this.linkedList.size() <= this.Length){
                this.linkedList.set(loc-1, num) ;
                return true ;
            }
        }
        return false ;
    }
}
