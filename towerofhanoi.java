public class towerofhanoi{
    public static void TOH(int n, char src, char hlp, char dest){
        
        if(n==1){
            System.out.println("Tranfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        TOH(n-1, src, dest, hlp);
        System.out.println("Tranfer disk "+n+" from "+src+" to "+dest);
        TOH(n-1, hlp, src, dest);

    }

    public static void main(String args[])
    {
        int n = 3;
        TOH(n,'S','H', 'D');
    }
}