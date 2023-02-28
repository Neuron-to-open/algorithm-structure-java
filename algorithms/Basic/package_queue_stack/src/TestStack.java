/**
 * DATE: 2022/9/18
 * Author: yjy --- BUPT
 */
public class TestStack {
    public static void main(String[] args) {
        Mystack stack = new Mystack() ;
        boolean F = stack.EmptyStack() ;
        System.out.println("当前栈是否为空 ：" ) ;
        if (F == true)
        {
            System.out.println("为空");
        }else{
            System.out.println("不为空");
        }

        stack.push_stack(9);
        stack.push_stack(89) ;
        stack.push_stack(90) ;

        int size = stack.getSize() ;

        F = stack.EmptyStack() ;
        System.out.println("当前栈是否为空 ：" ) ;
        if (F == true)
        {
            System.out.println("为空");
        }else{
            System.out.println("不为空");
        }
        System.out.println(size);
    }
}
