class Solution {
    public int minimumMoves(String s) {
        char[] ch=s.toCharArray();
        int len=ch.length,count=0;
        
        for(int i=0;i<len;i++){
            if(ch[i]=='X'){
                //look two more if index exist
                if((i+2)<=len-1){
                    ch[i+0]='O';
                    ch[i+1]='O';
                    ch[i+2]='O';
                    count++;
                }
                else{
                    count++;
                    break;
                }
            }
        }
        return count;
        
    }
}
