class Solution {
    public int[] findErrorNums(int[] arr) {        
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        int j=0;
        int[] ans = new int[2];
        for(j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans[0]=arr[j];
                ans[1]=j+1;
            }
        }
        return ans;

    }
    void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
}