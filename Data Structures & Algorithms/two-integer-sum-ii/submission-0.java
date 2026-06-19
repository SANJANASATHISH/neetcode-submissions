class Solution {
    public int[] twoSum(int[] num, int target) {
        int l=0,r=num.length-1;
        while(l<r){
            int cur=num[l]+num[r];
            if(cur>target){
                r--;
            }
            else if(cur<target){
                l++;
            }else{
                return new int[] {l+1,r+1};
            }
        }
        return new int[0];
    }
}
