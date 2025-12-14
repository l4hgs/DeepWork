import java.util.Iterator;
import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(98);
        st.push(99);
        st.push(100);
        st.pop();

        System.out.println("Stack ELements");
        
        // di nababago
        for (Iterator<Integer> iter = st.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        int top = st.peek();
        System.out.println("Top of stack: " + top);
    }
}