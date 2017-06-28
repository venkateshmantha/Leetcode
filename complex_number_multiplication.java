public class Solution {
    public String complexNumberMultiply(String a, String b) {
    String[] A = a.split("\\+");
    String[] B = b.split("\\+");
    int a1 = Integer.parseInt(A[0]);
    int a2 = Integer.parseInt(A[1].replace("i",""));
    int b1 = Integer.parseInt(B[0]);
    int b2 = Integer.parseInt(B[1].replace("i",""));
    int real = a1*b1 + a2*b2*-1;
    int comp = a1*b2 + a2*b1;
        return Integer.toString(real) + "+" + Integer.toString(comp) + "i";
    }
}