class Sol{
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=0; i<=n-1; i++){
        for(int j=i+1; j<n; j++){
            if(nums[i] + nums[j] == target){
            arr[0]=i;
            arr[1]=j;
            }
            
        }
        }
        return arr;
        
    }
    void main(){
        int nums[]={1,2,3,4,5};
        int target=5;
        int ans[]=twoSum(nums, target);
        for(int i=0; i<ans.length; i++)
        System.out.print(ans[i] + " ");
        
    }
}