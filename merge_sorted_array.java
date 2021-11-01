class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[m];
        if(m==0){
            for(int i=0;i<nums2.length;i++){
                nums1[i]=nums2[i];
            }
        }
        for(int i=0;i<m;i++){
            temp[i]=nums1[i];
        }
        int k=0,l=0;
        for(int i=0;k+l<m+n;i++){
            if(k==m){
                nums1[i]=nums2[l];
                l++;
                continue;
            }
            if(l==n){
                nums1[i]=temp[k];
                k++;
                continue;
            }
            if(temp[k]>nums2[l]){
                nums1[i]=nums2[l];
                l++;
            }
            else{
                nums1[i]=temp[k];
                k++;
            }
        }
    
    }
}
