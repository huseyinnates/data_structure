class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
        Arrays.sort(students);
        int result1=0;
        for(int i=0;i<seats.length;i++){
            //System.out.println(seats[i]);
           // System.out.println(students[i]);
            result1+=Math.abs(students[i]-seats[i]);
           
      
           
        }
        return result1 ;
    }
}
