package Sequence;

import java.util.ArrayList;
import java.util.Iterator;

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
 * 顺序表调用(ArrayList)
 *1、insert、add、delete、show 、getLength
 *2、Search、change
 * */
public class Sequence {
    private int length = 0  ;
    private ArrayList<Integer> arrayList = new ArrayList<>() ;
    /**
     * 空参构造函数
     * * */
    public Sequence(){

    }

    /**
     * 作用-----含初始化长度的构造函数
     * 这个长度用来监测该线性表----用户允许的长度
     * */
    public Sequence(int length){
        this.length = length ;
    }

    public int getLength() {
        return this.length;
    }

    /**
     * 作用-----获取当前表的长度
     * 返回值类型: int
     * 函数原型: public int getArrayListLength
     * */
    public int getArrayListLength(){
        return this.arrayList.size() ;
    }

    /**
     * 作用----=向表中顺序增加数据
     * 返回值类型: void
     * 函数原型: public void addArray(int num)
     * */
    public void addArray( int num ){

        this.arrayList.add(num) ;
    }

    /**
     * 作用-----向表中指定位置插入数据
     * 返回值类型: boolean
     * 函数原型: public boolean insertArray(int num , int loc )
     * */
    public boolean insertArray(int num , int loc ){
        // length == 0 说明没有指定表的长度
        if ( this.length == 0){
            if ( loc <= this.arrayList.size() && loc > 0 ){
                this.arrayList.add(loc -1 , num);
                return true ;
            }
        }else {
            if ( loc > 0 && loc <= this.arrayList.size() && this.arrayList.size() < this.length){
                this.arrayList.add(loc -1 , num);
                return true ;
            }
        }

        return false ;
    }

    /**
     * 作用-----删除指定位置的数据
     * 返回值类型: boolean
     * 函数原型: public boolean deleteArray(int num , int index)
     * */
    public boolean deleteArray( int loc ){
        if ( this.length == 0 ){
            if ( loc <= this.arrayList.size() && loc > 0 ){
                this.arrayList.remove(loc-1) ;
                return true ;
            }
        }else {
            if ( loc > 0 && loc <= this.arrayList.size() && this.arrayList.size() < this.length){
                this.arrayList.remove( loc -1 ) ;
                return true ;
            }
        }

        return false ;
    }


    /**
     * 作用-----输出表中有的数据
     * 返回值类型: void
     * 函数原型: public void showArray()
     * */
    public void showArray(){
        Iterator iterator = this.arrayList.iterator() ;
        while (iterator.hasNext()){
            System.out.printf("%d " , iterator.next());
        }
        System.out.println();
    }


    /**
     * 作用------查找某个元素
     * 返回值类型: int
     * 函数原型: public int SearchArray(int num)
     * */
    public int SearchArray(int num){
        for (int i = 0 ; i < this.arrayList.size() ; ++ i){
            if ( this.arrayList.indexOf(i) == num){
                return ( i+1 );
            }
        }
        return -1 ;
    }

    /**
     * 作用-----更改元素
     * 返回值类型: boolean
     * 函数原型: public boolean changeArray(int loc , int num)
     * */
    public boolean changeArray(int num , int loc ){
        if ( this.length == 0){
            if ( loc <= this.arrayList.size() && loc > 0 ){
                this.arrayList.set(loc-1 , num) ;
                return true ;
            }
        }else {
            if ( loc > 0 && loc <= this.arrayList.size() && this.arrayList.size() < this.length){
                this.arrayList.set(loc-1 , num) ;
                return true ;
            }
        }

        return false ;
    }

}
