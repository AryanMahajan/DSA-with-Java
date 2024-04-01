import java.util.*;

public class calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+---------------------------------------------+");
        System.out.println("|                   WELCOME                   |");
        System.out.println("|          TO ALL IN ONE CALCULATOR           |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|                                             |");
        System.out.println("|      Choose any one from the following      |");
        System.out.println("|             (either 1/2/3/4)                |");
        System.out.println("|                                             |");
        System.out.println("+------------+--------------------------------+");
        System.out.println("|            |                                |");
        System.out.println("|     1.)    |      Area of any 2-D shape     |");
        System.out.println("|            |                                |");
        System.out.println("+------------+--------------------------------+");
        System.out.println("|            |                                |");
        System.out.println("|     2.)    |      Area of any 3-D shape     |");
        System.out.println("|            |                                |");
        System.out.println("+------------+--------------------------------+");
        System.out.println("|            |                                |");
        System.out.println("|     3.)    |       Regular Calculator       |");
        System.out.println("|            |                                |");
        System.out.println("+------------+--------------------------------+");
        System.out.println("|            |                                |");
        System.out.println("|     4.)    |     Geometry (In Progress)     |");
        System.out.println("|            |                                |");
        System.out.println("+------------+--------------------------------+");

        System.out.print("Enter Your Choice: ");
        int first = sc.nextInt();

        if (first==1){
            System.out.println("+---------------------------------------------+");
            System.out.println("|                                             |");
            System.out.println("|      Choose any one from the following      |");
            System.out.println("|             (either 1/2/3/4)                |");
            System.out.println("|                                             |");
            System.out.println("+------------+--------------------------------+");
            System.out.println("|            |                                |");
            System.out.println("|     1.)    |             SQUARE             |");
            System.out.println("|            |                                |");
            System.out.println("+------------+--------------------------------+");
            System.out.println("|            |                                |");
            System.out.println("|     2.)    |           RECTANGLE            |");
            System.out.println("|            |                                |");
            System.out.println("+------------+--------------------------------+");
            System.out.println("|            |                                |");
            System.out.println("|     3.)    |             CIRCLE             |");
            System.out.println("|            |                                |");
            System.out.println("+------------+--------------------------------+");
            System.out.println("|            |                                |");
            System.out.println("|     4.)    |            TRIANGLE            |");
            System.out.println("|            |                                |");
            System.out.println("+------------+--------------------------------+");

            System.out.print("Enter Your Choice: ");
            int first_2d = sc.nextInt();

            if (first_2d==1){
                System.out.print("Enter the side of the square: ");
                float sqside = sc.nextFloat();
                float sqarea = sqside*sqside;
                float sqperi = 4f*sqside;
                System.out.println("+-----------+-------------------");
                System.out.println("|  Perimeter  |    "+sqperi);
                System.out.println("+-----------+-------------------");
                System.out.println("|     Area    |    "+sqarea);
                System.out.println("+-----------+-------------------");
            }

            else if (first_2d==2){
                
            }

            else if (first_2d==3){

            }

            else if (first_2d==4){

            }

            else{
                System.out.print("Invalid Shape Entered.");
            }

        }
        else if (first==2){

        }
        else if (first==3){

        }
        else if (first==4){

        }
        else{
            System.out.println("Invalid Option");
        }

    }
}