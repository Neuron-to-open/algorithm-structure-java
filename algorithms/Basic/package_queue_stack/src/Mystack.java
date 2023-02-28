import javax.swing.*;
import java.util.Stack;

/**
 * DATE: 2022/9/18
 * Author: yjy --- BUPT
 */
public class Mystack {
   private Stack<Integer> stack = new Stack<>() ;

   //入栈
   public void push_stack(int num)
   {
      stack.push(num) ;
   }

   //出栈
   public int pop_stack()
   {
      int num = stack.pop() ;
      return num ;
   }

   //判断栈是否为空
  public boolean EmptyStack()
  {
     boolean flag = stack.empty() ;
     return flag ;
  }

  //栈中的元素数量
  public int getSize()
  {
     int num = stack.size() ;
     return  num ;
  }


}
