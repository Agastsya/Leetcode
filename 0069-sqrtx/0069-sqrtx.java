class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start<=end){

            int mid = start + (end -start)/2;
            if(mid ==0) return x;

            if(mid == x/mid){
                return mid;
            }
            if(x/mid>mid){
                start = mid +1;
            }else{
                end = mid -1;
            }

        }
        return end;
    }
}