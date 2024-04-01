import java.util.Scanner;
public class twodarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int [][] num=new int[rows][columns];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                num[i][j]=sc.nextInt();
            }
        }

        // System.out.print("Enter the number you want to search: ");
        // int x = sc.nextInt();

        // //output
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //         if(num[i][j]==x){
        //             System.out.print("The number you searched was on the index: "+i+","+j);
        //         }
        //     }
        // }

        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(num[j][i]+" ");
            }
            System.out.println();
        }
    }
}
