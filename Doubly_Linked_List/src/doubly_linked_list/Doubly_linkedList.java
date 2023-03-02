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
public class Doubly_linkedList {

    /**
     * 每个双向链表的头结点，不存储数据，只是用来表明位置
     * */
    private Node Head = new Node();

    private Node Tail = new Node() ;

    /**
     * 给每个双向列表设置长度length
     * */
    private int length = 0 ;

    private int countLength = 0 ;

    /**
     * 空参构造器-----增加程序的可扩展性
     * */
    public Doubly_linkedList(){
        this.Head.setNext( this.Tail );
        this.Head.setFront( null );
        this.Head.setSage( -1 );
        this.Head.setSno( null );
        this.Head.setSname( null );
        this.Tail.setFront( this.Head );
        this.Tail.setNext( null );
    }

    /**
     * 作用-----可以给函数的头结点添加信息，使其功能更丰富
     * 返回值: 构造器
     * 函数原型: public Doubly_linkedList(Node node)
     * */
    public Doubly_linkedList(Node head){
        this.Head = head ;
        this.Head.setNext( this.Tail );
        this.Head.setFront( null );
        this.Head.setSage( -1 );
        this.Head.setSno( null );
        this.Head.setSname( null );
        this.Tail.setFront( this.Head );
        this.Tail.setNext( null );
    }


    public Doubly_linkedList(int length) {
        this.length = length;
        this.Head.setNext( this.Tail );
        this.Head.setFront( null );
        this.Head.setSage( -1 );
        this.Head.setSno( null );
        this.Head.setSname( null );
        this.Tail.setFront( this.Head );
        this.Tail.setNext( null );
    }

    public Doubly_linkedList(Node head , int length){
        this.length = length ;
        this.Head.setNext( this.Tail );
        this.Head.setFront( null );
        this.Head.setSage( -1 );
        this.Head.setSno( null );
        this.Head.setSname( null );
        this.Tail.setFront( this.Head );
        this.Tail.setNext( null );
    }
    /**
     * 作用-----取得该双向链表的头指针
     * 返回值: Node
     * 函数原型: public Node getHead()
     * */
    public Node getHead() {
        return Head;
    }

    /**
     * 作用-----向列表中添加结点Node
     * 返回值类型: boolean
     * 函数原型: public boolean addDoublyLinkedList(Node node)
     * 特殊说明: 采取的是头插法插入结点
     * */
    public boolean addDoublyLinkedListByHead(Node node){
        if (length == 0){
            //先将插入结点的右指针指向头结点的右指针
            node.setNext( this.Head.getNext() );
            //头结点的右指针所指的结点的左指针指向新结点
            this.Head.getNext().setFront( node );
            //再将头结点的右指针指向新的结点
            this.Head.setNext( node );
            //新结点的左指针指向头结点
            node.setFront( this.Head ) ;
            this.countLength ++ ;
            return true ;
        }else {
            if (this.countLength <= this.length ){
                //先将插入结点的右指针指向头结点的右指针
                node.setNext( this.Head.getNext() );
                //头结点的右指针所指的结点的左指针指向新结点
                this.Head.getNext().setFront( node );
                //再将头结点的右指针指向新的结点
                this.Head.setNext( node );
                //新结点的左指针指向头结点
                node.setFront( this.Head ) ;
                this.countLength ++ ;
                return true ;
            }
        }

        return false ;
    }

    /**
     * 作用-----向列表中添加结点Node
     * 返回值类型: boolean
     * 函数原型: public boolean addDoublyLinkedListByTail(Node node)
     * 特殊说明: 采取的是尾插法插入结点
     * */
    public boolean addDoublyLinkedListByTail(Node node){
        Node temp= this.Head ;
        while (temp.getNext().getNext() != null){
            temp = temp.getNext() ;
        }
        if (length == 0){
            node.setNext( temp.getNext() ) ;
            temp.getNext().setFront( node );
            node.setFront( temp );
            temp.setNext( node );
            this.countLength ++ ;
            return true ;
        }else {
            if (this.countLength < this.length ){
                node.setNext( temp.getNext() ) ;
                temp.getNext().setFront( node );
                node.setFront( temp );
                temp.setNext( node );
                this.countLength ++ ;
                return true ;
            }
        }

        return false ;
    }

    /**
     * 作用-----倒序遍历该双向指针
     * 返回值类型: void
     * 函数原型: public void ShowDoublyLinkedListByDESC()
     * 特殊说明: 此处只是针对于头插法是倒序，如果是尾插法则是正序
     * */
    public void ShowDoublyLinkedListByDESC(){
        Node temp = this.Head.getNext() ;
        while ( temp.getNext() != null ){
            System.out.println( temp );
            temp = temp.getNext() ;
        }
    }


    /**
     * 作用-----正序遍历该双向指针
     * 返回值类型: void
     * 函数原型: public void ShowDoublyLinkedListByORDER()
     * 特殊说明: 此处只是针对于头插法是正序，如果是尾插法则是倒序
     * */
    public void ShowDoublyLinkedListByORDER(){
        Node temp = this.Tail.getFront() ;
        while ( temp.getFront()!= null ){
            System.out.println( temp );
            temp = temp.getFront() ;
        }
    }

    /**
     * 作用-----向双向链表插入数据
     * 返回值类型: boolean
     * 函数原型: public boolean insertDoublyLinkedList(int loc)
     * 特殊说明: 此处是按照头插法位置插入，可以按照Node结点其他属性进行插值
     * */
    public boolean insertDoublyLinkedList(int loc , Node node){
        int count = 1 ;
        Node temp = this.Head;
        while (count != loc && temp.getNext().getNext() != null ){
            count ++ ;
            temp = temp.getNext() ;
        }
        if ( count == loc ){
            node.setNext( temp.getNext() ) ;
            temp.getNext().setFront( node );
            node.setFront( temp );
            temp.setNext( node );
            this.countLength ++ ;
            return true ;
        }
        return false ;
    }

    /**
     * 作用-----删除指针
     * 返回值类型: boolean
     * 函数原型: public boolean deleteDoublyLinkedList(int loc)
     * 特殊说明: 此处是按照头插法位置删除，可以按照Node结点的其他属性进行删除
     * */
    public boolean deleteDoublyLinkedList(int loc){
        int count = 1 ;
        Node temp = this.Head ;
        while ( count != loc &&temp.getNext().getNext() != null){
            count ++ ;
            temp = temp.getNext() ;
        }

        if (count == loc ){
            temp.getNext().getNext().setFront(temp);
            temp.setNext( temp.getNext().getNext());
            this.countLength -- ;
        }
        return false ;
    }


    /**
     * 作用-----改变特定位置的结点属性
     * 返回值类型: boolean
     * 函数原型: public boolean changeDoublyLinkedList(int loc , Node node )
     * 特殊说明: 此处是按照头插法位置改变，同时可以按照Node结点的其他属性进行改变
     * */
    public boolean changeDoublyLinkedList(int loc , Node node ){
        int count = 1 ;
        Node temp = this.Head ;
        while ( count != loc &&temp.getNext().getNext() != null){
            count ++ ;
            temp = temp.getNext() ;
        }

        if (count == loc ){
            temp.getNext().setSname( node.getSname() );
            temp.getNext().setSage( node.getSage() );
            temp.getNext().setSno( node.getSno() );
            return true ;
        }
        return false ;
    }



}
