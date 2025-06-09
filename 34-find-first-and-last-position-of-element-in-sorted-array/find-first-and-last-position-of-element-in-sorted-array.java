class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        int start=binary(nums,target,true);
        int end=binary(nums,target,false);
        result[0]=start;
        result[1]=end;
        return result;
    }
    public int binary(int []nums,int target , boolean isSearchingLeft){
        int idx=-1;
       int low=0,high=nums.length-1;
       while(low<=high){
        int mid=low+(high-low)/2;

        if(nums[mid]>target){
           high=mid-1;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            idx=mid;
            if(isSearchingLeft){
                high=mid-1;
            }
            else
            low=mid+1;
        }
       }
       return idx;

    }
}