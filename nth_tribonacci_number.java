class Solution {
    public int tribonacci(int n) {
        int a1=0,a2=1,a3=1;
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int temp=0;
        for(int i=0;i<n-2;i++){
            temp=a1+a2+a3;
            a1=a2;
            a2=a3;
            a3=temp;
        }
        return temp;
    }
}
