class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ex=new HashSet<>();
        for (int num:nums){
            if(ex.contains(num)){
                return true;
            }
            ex.add(num);
        }
    return false;
    }
}