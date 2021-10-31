class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> htable= new ArrayList<Integer>();
        List<Integer> outp=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
              if(!htable.contains(nums1[i])){
                    htable.add(nums1[i]);
                }
        }
        for(int i=0;i<nums2.length;i++){
            
            if(htable.contains(nums2[i])){
               
                if(!outp.contains(nums2[i])){
                    outp.add(nums2[i]);
                }
                
            }
        }
        for(int i=0;i<nums2.length;i++){
            
            if(!htable.contains(nums2[i])){
                htable.add(nums2[i]); 
            }
        }
        for(int i=0;i<nums3.length;i++){
            if(htable.contains(nums3[i])){
                if(!outp.contains(nums3[i])){
                    outp.add(nums3[i]);
                }
            }
           
        }
        return outp;
        
    }
}
