public class removeDups{
    
    public static boolean map[]=new boolean[26];

    public static void removeDup(int idx, String str, String newString){
        
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDup(idx+1, str, newString);

        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDup(idx+1, str, newString);
        }

    }
    
    public static void main(String[] args) {
        String str="abbccda";
        String newString="";
        removeDup(0, str, newString);
    }
}