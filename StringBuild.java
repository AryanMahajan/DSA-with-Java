import java.util.*;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Tony");
        StringBuilder stt=new StringBuilder("");
        for(int i=0;i<=st.length();i++){
            stt.append(st.charAt(st.length()-i));
            System.out.println(stt);
        }
        System.out.println(stt);

    }
}
