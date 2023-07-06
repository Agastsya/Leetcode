class Solution {
    public int missingNumber(int[] nums) {
        return cyclicSort(nums);
        
    }
    int cyclicSort(int [] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(correct!=arr.length && arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        int j=0;
        for(j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return j;
    }
    void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
}