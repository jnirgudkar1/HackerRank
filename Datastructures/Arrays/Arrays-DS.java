//Input Format
//The first line contains an integer, (the number of integers in ). The second line contains space-separated integers describing 
//Output Format
//Print all integers in reverse order as a single line of space-separated integers.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int arr_i=n-1; arr_i >= 0; arr_i--){
            System.out.print(arr[arr_i]+" ");
        }
    }
}