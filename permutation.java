import java.io.*;
import java.util.*;

public class permutation {


  public static void swap(char[] arr, int idx, int idx2) {
    char temp = arr[idx];
    arr[idx] = arr[idx2];
    arr[idx2] = temp;
  }

  public static void solve(char[] arr, int idx) {
    if (idx == arr.length - 1) { 
      System.out.print(String.valueOf(arr) + " ");
    }

    for (int i = idx; i < arr.length; i++) {
      swap(arr, idx, i);
      solve(arr, idx + 1);
      swap(arr, idx, i);
    
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter string to generate its permutations: ");
    String str = scn.next(); 
    if (str.length() == 0 || str == null) {
      return;
    }
    solve(str.toCharArray(), 0); 
  }
}