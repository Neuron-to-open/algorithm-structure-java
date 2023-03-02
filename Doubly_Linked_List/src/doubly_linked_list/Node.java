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
public class Node {
    private String sname ;
    private int sage ;
    private String sno ;

    private Node front ;

    private Node next ;

    /**
     * 不含参数的构造器
     * */
    public Node(){

    }

    /**
     * 含参数的构造器
     * */
    public Node(String sname, int sage, String sno) {
        this.sname = sname;
        this.sage = sage;
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "sname='" + sname + '\'' +
                ", sage=" + sage +
                ", sno='" + sno + '\'' +
                '}';
    }
}
