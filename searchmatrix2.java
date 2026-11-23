class smx {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
       int r=0,c=matrix[0].length-1;
       while(r<n && c>=0){
        if(target == matrix[r][c]){
            return true;
        }
        else if(target>matrix[r][c]){
            r++;

        }
        else{
            c--;
        }
       } 
       return false;
    }
    void main(){
        int target=7;
        int matrix[][]={{1,2,3},{4,5,7}};
        boolean ans=searchMatrix(matrix,target);
        System.out.println(ans);
    }
}