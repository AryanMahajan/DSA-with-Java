public class paths{
    
    public static int countpaths(int i,int j,int n,int m){

        if(i==n-1&&j==m-1){
            return 1;
        }
        if(i==n||j==m){
            return 0;
        }

        //move down
        int downpaths=countpaths(i+1, j, n, m);

        //move right
        int rightpaths=countpaths(i, j+1, n, m);

        return downpaths+rightpaths;
      
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int totalpaths=countpaths(0, 0, n, m);
        System.out.println("Total number of possible ways to reach the destination is "+totalpaths+" ");
    }
}