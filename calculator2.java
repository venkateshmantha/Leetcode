class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();
        int num = 0;
        char sign = '+';
        int len = s.length();
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                num = s.charAt(i) - '0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + s.charAt(i+1) - '0';
                    i++;
                }
                switch(sign){
                    case '+': 
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(num*-1);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case '/':
                        stack.push(stack.pop()/num);
                        break;
                }
            }
            else if(s.charAt(i) == '+')
                sign = '+';
            else if(s.charAt(i) == '-')
                sign = '-';
            else if(s.charAt(i) == '*')
                sign = '*';
            else if(s.charAt(i) == '/')
                sign = '/';
        }
        int res = 0;
        for(int i:stack)
            res += i;
        return res;
    }
}
