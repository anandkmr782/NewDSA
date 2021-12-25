package stack;

import java.util.ArrayList;

public class StackImplUsingArrayList {
    static ArrayList<Integer> as=new ArrayList<>();
    public static class Stack
    {
        public static boolean isEmpty()
        {
            return as.size()==0;
        }
        public static void push(int data)
        {
            as.add(data);
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=as.get(as.size()-1);
            as.remove(as.size()-1);
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=as.get(as.size()-1);
            return top;
        }
        public static void pushAtButtom(int data,Stack st)
        {
            if(st.isEmpty())
            {
                st.push(data);
                return;
            }
            int top=st.pop();
            pushAtButtom(data, st);
            st.push(top);
        }
    }
    public static void main(String[] args)
    {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pushAtButtom(5,st);
        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
