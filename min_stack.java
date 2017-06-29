public class MinStack {

    Stack<Integer> s = new Stack<Integer>();
    int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(x<=min){
            s.push(min);
            min=x;
        }
        s.push(x);
    }
    
    public void pop() {
        if(s.pop()==min)
            min=s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}