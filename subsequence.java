public class subsequence{
    
    public static void printseq(String str,int idx, String newString){

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(idx);


        printseq(str,idx+1,newString+currChar);

        printseq(str,idx+1,newString);

    }
    
    public static void main(String[] args) {
        String str="abc";
        String newString="";
        printseq(str,0,newString);
    }
}