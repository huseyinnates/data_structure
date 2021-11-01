class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len=original.length;
        if(len<(m*n)||len>(m*n)){
            int[][] temp=new int[0][0];
            return temp;
        }
        int[][] store=new int[m][n];
        int b=0;
        for(int i=0;i<m;i++){
            for(int a=0;a<n;a++){
                store[i][a]=original[b];
                b++;
        }
        }
        return store;
    }
}
