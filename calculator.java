class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();
        int sign = 1;
        int res = 0;
        int num = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                num = s.charAt(i) - '0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){
                		num = num*10 + s.charAt(i+1) - '0';
                		i++;
                }
                res += num*sign;
            }
            else if(s.charAt(i) == '+')
                sign = 1;
            else if(s.charAt(i) == '-')
                sign = -1;
            else if(s.charAt(i) == '('){
                stack.push(sign);
                stack.push(res);
                res = 0;
                sign = 1;
            }
            else if(s.charAt(i) == ')'){
                res = stack.pop() + res*stack.pop();
            }
        }
        return res;
    }
}
