class four {
    public int countNegatives(int[][] grid) {
       int c=0;
       for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[0].length; j++){
            if(grid[i][j]<0){
                c++;
            }
        }
       } 
       return c;
    }
    void main(){
        int grid[][]={{-1,-2,3},{-9,0,8},{2,-3,-6}};
      int ans=  countNegatives(grid);
      System.out.println(ans);
        

    }
}