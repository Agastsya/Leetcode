class Solution {
    public int arrangeCoins(int n) {
        int temp = n;
        int i =0;

        while(temp>=0){
            i++;
            temp = temp - i;
        }
        return i-1;
    }
}