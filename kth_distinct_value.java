class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> htable=new HashSet<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(!htable.add(arr[i])){
                if(list.indexOf(arr[i])>=0){   
                list.remove(list.indexOf(arr[i]));
                }
                if(list.indexOf(arr[i])>=0){   
                list.remove(list.indexOf(arr[i]));
                }
            }
        }
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        if(list.size()>=k){
            
            return list.get(k-1);
        }
        return "";
    }
}
