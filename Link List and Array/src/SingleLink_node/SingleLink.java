package SingleLink_node;

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
public class SingleLink {
    private Node head = new Node();
    private Node tail = new Node();

    private int length = 0;

    private int count = 0;

    public SingleLink(){
        this.head.setNext( this.tail);
        this.head.setFront( null );
        this.tail.setFront( this.head );
        this.tail.setNext( null );
    }

    public SingleLink(int i) {
        this.length = i ;
        this.head.setNext( this.tail);
        this.head.setFront( null );
        this.tail.setFront( this.head );
        this.tail.setNext( null );
    }

    /**
     * 作用-----想链表添加数据
     * 返回值: boolean
     *  函数原型: public boolean addLinked(Node node)
     * */
    public boolean addLinked(Node node){
        if (this.length == 0){
            this.head.getNext().setFront( node );
            node.setNext( this.head.getNext() );
            this.head.setNext( node );
            node.setFront( this.head );
            this.count ++ ;
            return true ;
        }else {
            if ( this.count < this.length ){
                this.head.getNext().setFront( node );
                node.setNext( this.head.getNext() );
                this.head.setNext( node );
                node.setFront( this.head );
                this.count ++ ;
                return true ;
            }
        }
        return false ;
    }

    /**
     * 作用-----遍历该链表
     * 返回值类型: void
     * 函数原型: public void ShowArray()
     * 特殊说明: 头插法实现的逆序输出
     * */
    public void ShowArray(){
        Node temp = this.head.getNext() ;
        while ( temp.getNext() != null ){
            System.out.println( temp );
            temp = temp.getNext() ;
        }
    }


    /**
     * 作用-----遍历该链表
     * 返回值类型: void
     * 函数原型: public void ShowArrayBYORDER()
     * 特殊说明: 头插法实现的顺序输出
     * */
    public void ShowArrayBYORDER(){
        Node temp = this.tail.getFront() ;
        while ( temp.getFront() != null ){
            System.out.println( temp );
            temp = temp.getFront() ;
        }
    }


    /**
     * 作用-----改变某个位置的值
     * 返回值类型: boolean
     * 函数原型: public boolean changeArray( int loc , Node node )
     * 特殊说明: 头插法实现的逆序输出
     * */
    public boolean changeArray(int loc , Node node){
        if (loc <= this.count ){
            int c = 0 ;
            Node temp = this.head ;
            while (temp.getNext() != null && c != loc){
                c ++ ;
                temp = temp.getNext() ;
            }

            temp.setScore( node.getScore() );
            return true ;
        }

        return false ;
    }

    /**
     * 作用-----向某个位置插入数据
     * 返回值类型: boolean
     * 函数原型: public boolean insertSingleLinked(int loc , Node node )
     * */
    public boolean insertSingleLinked(int loc , Node node ){
        int c = 0 ;
        Node temp = this.head ;
        while ( temp.getNext() != null && c != loc){
            c ++ ;
            temp = temp.getNext() ;
        }
        if (c == loc){
            node.setNext( temp.getNext() );
            node.setFront( temp );
            temp.getNext().setFront( node );
            temp.setNext( node );
            return true ;
        }
        return false ;
    }


    /**
     * 作用-----查找单链表某个元素
     * 返回值类型: int
     * 函数原型: public int SearchSingleLinkedList(int num)
     * 特殊说明: 头插法实现的逆序输出
     * */
    public int SearchSingleLinkedList(int num){
        Node temp = this.head.getNext() ;
        int c = 0 ;
        while (temp.getNext()!= null){
            c ++ ;
            if ( temp.getScore() == num){
                return c ;
            }
            temp = temp.getNext() ;
        }
        return -1 ;
    }
}
