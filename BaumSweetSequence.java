/**
 * Reddit, Daily Programmer #344
 */

import java.util.Scanner;

public class BaumSweetSequence {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0, ans = 0;
        while(i <= n) {
            int check = 0;
            ans = 1;
            String temp = Integer.toBinaryString(i);
            String binary = temp + " ";
            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(j) == '0') {
                    for (int k = j; k < binary.substring(j).length(); k++) {
                        if(binary.charAt(k) == '0'){
                            check++;
                        }
                        else{
                            break;
                        }
                    }

                    if(check % 2 == 1){
                        ans = 0;
                        break;
                    }
                }
            }
            System.out.print(ans + ", ");
            i++;
        }
    }
}
