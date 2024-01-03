package Programmes;

import org.testng.annotations.Test;

public class Palindrome {

    @Test
    public void palindrome_example(){
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
            for (int i=9; i>=1; i--){
                System.out.print(i+" ");
        }
    }
}
