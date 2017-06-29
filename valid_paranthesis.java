public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' )
                stack.push(s.charAt(i));
            else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            else if(s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='[')
                stack.pop();
            else if(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{')
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}