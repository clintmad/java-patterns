//Clint Madariaga-Zittel
//The purpose of this code is to create a pattern
//7 March 2017
//Bellevue University
//Patterns.java

public class Patterns {
  public static void main (String [] args){

    //Pattern #1
    int n = 1;
    while (n >= 1 && n <=6){
      int num = 1;
      for (int o = 1; o <= n; o++) {
        System.out.print(num + " ");
	num += 1;
        }
    System.out.println();
    n++;
    }

    //Pattern #2
    int m = 6;
    while (m >= 1 && m <=6){
      int num = 1;
      for (int l = 1; l <= m; l++) {
        System.out.print(num + " ");
	num += 1;
        }
    System.out.println();
    m--;
    }

    //Pattern #3
    for (int i = 1; i <= 6; i++) {
      for (int j = 5; j >= i; j--) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    } 
    
    //Pattern #4
    for (int p = 6; p >= 1; p--) {
      for (int q = 6; q > p; q--) {
        System.out.print("  ");
      }
      for (int r = 1; r <= p; r++) {
        System.out.print(r + " ");
      }
      System.out.println();
    }  
  }
}