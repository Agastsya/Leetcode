class Solution {
    public int firstMissingPositive(int[] nums) {
        return cyclicSort(nums);
    }
     int cyclicSort(int [] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        int j=0;
        for(j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return j+1;
    }
     void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
}