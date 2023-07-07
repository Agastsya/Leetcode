class Solution {
    public int findDuplicate(int[] arr) {
        return cyclicSort(arr);
        
    }
    int cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;){
            if(arr[j]==j+1){
                j++;
            }else{
                return arr[j];
            }

        }
        return -1;
    }
     void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}