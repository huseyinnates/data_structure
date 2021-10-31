class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int ab=0;
        boolean c=true;
        int kl=0,mn=0;
        for(int i=0;i<str.length;i++) {
          
            //System.out.println(str[i].charAt(0));
            char k=str[i].charAt(0);
            if(k<='9' && k>='1' && c){
               // System.out.println(k);
                
                ab=Integer.parseInt(str[i]);  
                System.out.println(ab);
                c=false;
            }
            else if(k<='9' && k>='1'){
               // System.out.println(k);
                kl++;
                System.out.println(Integer.parseInt(str[i]));
                if(ab<Integer.parseInt(str[i])){
                    ab=Integer.parseInt(str[i]);
                    mn++;
                }  

            }
           
            //System.out.println(k);
          
        }
         if(kl==mn && kl>0){
                System.out.println("mn:"+mn+"kl:"+kl);
                return true;
            }
        return false;
    }
}
