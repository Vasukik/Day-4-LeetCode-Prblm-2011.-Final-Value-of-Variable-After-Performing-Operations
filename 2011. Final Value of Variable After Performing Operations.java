
import java.util.*;
class Solution {
    public static int finalValueAfterOperations(String[] S) {
        int x=0;
        for(int i=0;i<S.length;i++){
            if(S[i].contains("++")){
x++;
            }
            if(S[i].contains("--")){
x--;
            }
           

        }
        return x;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
      
        String s1[]= S.replace("[", "").replace("]", "").split(",");
        
        System.out.println(finalValueAfterOperations(s1));
            }

}