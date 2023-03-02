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
public class Node {
    int score ;

    Node next ;
    Node front ;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node(){

    }

    public Node (int num){
        this.score = num ;
    }

    @Override
    public String toString() {
        return "Node{" +
                "score=" + score +
                '}';
    }
}
