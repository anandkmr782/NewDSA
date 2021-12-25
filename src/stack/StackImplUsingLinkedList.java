package stack;

public class StackImplUsingLinkedList {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public static class Stack1
    {
        public static Node head;
        public static boolean isEmpty()
        {
            return head==null;
        }
        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }
        public static int peek()
        {
            if (isEmpty())
            {
                return -1;
            }
            int top=head.data;
            return top;
        }
    }
    public static void main(String[] args){
        Stack1 st=new Stack1();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
