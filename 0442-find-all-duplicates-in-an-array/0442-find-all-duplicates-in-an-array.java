class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
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