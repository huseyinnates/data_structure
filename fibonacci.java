class Solution {
    public int fib(int n) {
        double a=Math.pow(5,0.5);
        double b=1.0/a;
        double c=((1.0+a)/2.0);
        double d=((1.0-a)/2.0);
        double result=b*(Math.pow(c,n)-Math.pow(d,n));
        System.out.println((int)result);
        
        return (int)result;
    }
}
