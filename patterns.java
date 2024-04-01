import java.util.*;
public class patterns {

    public static void halfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }
 
    public static void square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }
 
    public static void invertedpyramid(int n){
        for(int i=0;i<=n;i++){
            //spaces
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }

    public static void cross(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i+j==n+1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        cont();
    }

    public static void hollowsquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||j==n||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        cont();
    }

    public static void hollowhalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        cont();
    }

    public static void hollowinvertedrotatedhalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==n||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        cont();
    }

    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }

    public static void rotatedhalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }

    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        cont();
    }

    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars 1st half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        cont();
    }

    public static void numpyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        cont();
    }

    public static void binarypyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        cont();
    }

    public static void palondromicpyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers 1st part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //numbers 2nd part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        cont();
    }

    public static void butterfly(int n){
        //1st part
        
        for(int i=0;i<=n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part
        for(int i=n;i>=0;i--){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }

    public static void hourglass(int n){
        //1st part
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd part
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        cont();
    }

    public static void countingPyramid(int n){
        for(int i=1;i<=n;i++){
            
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        cont();
    }

    public static void fibbonaciisePyramid(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=a+b;
                System.out.print(sum+" ");
                a=b;
                b=sum;
            }
            System.out.println();
        }
    }

//--------------------------------------------------------------------------------------------------------------//

    public static void intro(){
        patterns obj=new patterns();
        Scanner sc=new Scanner(System.in);
        System.out.println("+-----------------CHOICES-----------------+");
        System.out.println("|1. |Exit                                 |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|2. |Square                               |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|3. |Inverted Pyramid                     |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|4. |Cross                                |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|5. |Hollow Square                        |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|6. |Hollow Half Pyramid                  |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|7. |Hollow Inverted Rotated Half Pyramid |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|8. |Rhombus                              |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|9. |Rotated Half Pyramid                 |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|10.|Hollow Rhombus                       |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|11.|Pyramid                              |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|12.|Numerical Pyramid                    |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|13.|Binary Pyramid                       |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|14.|Half Pyramid                         |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|15.|Palondromic Pyramid                  |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|16.|Butterfly pattern                    |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|17.|Hourglass                            |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|18.|Counting Pyramid                     |");
        System.out.println("+---+-------------------------------------+");
        System.out.println("|19.|Fibb. Seq. Pyramid                   |");
        System.out.println("+---+-------------------------------------+");

        System.out.print("Enter the choice: ");
        int choice=sc.nextInt();
        int n=0;
        if(choice<=19&&choice!=1&&choice>0){
            System.out.print("Enter the number of rows or columns: ");
            int m=sc.nextInt();
            n=m;
        }else if(choice==1){
            System.out.println("Exiting...");
            System.exit(20);
        }else{
            System.out.println("Invalid Choice!!");
            intro();
        }
        
        sc.nextLine();
        switch(choice){
            case 1: System.out.println("Exiting...");System.exit(20);;return;
            case 2: obj.square(n);return;
            case 3: obj.invertedpyramid(n);return;
            case 4: obj.cross(n);return;
            case 5: obj.hollowsquare(n);return;
            case 6: obj.hollowhalfpyramid(n);return;
            case 7: obj.hollowinvertedrotatedhalfpyramid(n);return;
            case 8: obj.rhombus(n);return;
            case 9: obj.rotatedhalfpyramid(n);return;
            case 10:obj.hollowrhombus(n);return;
            case 11:obj.pyramid(n);return;
            case 12:obj.numpyramid(n);return;
            case 13:obj.binarypyramid(n); return;
            case 14:obj.halfpyramid(n);return;
            case 15:obj.palondromicpyramid(n);return;
            case 16:obj.butterfly(n);return;
            case 17:obj.hourglass(n);return;
            case 18:obj.countingPyramid(n);return;
            case 19:obj.fibbonaciisePyramid(n);;return;
            default:System.out.println("Invalid Choice!!");return;
        }
            
    }

    public static void cont(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to continue(y/n): ");
        String yn=sc.nextLine();
        if(yn.equals("y")||yn.equals("Y")){
            intro();
        }else if(yn.equals("n")||yn.equals("N")){
            System.out.println("Exiting...");
            System.exit(10);
        }else{
            cont();
        }
    }

    public static void main(String[] args){
        intro();
    }

}