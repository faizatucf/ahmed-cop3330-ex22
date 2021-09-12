/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class compare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int flag =-1, tmp;
        for(int i=0;i<3;i++)
        {
            System.out.println(String.format("Enter number %d:",i+1));
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<2;i++)
        {
            if(arr[i] > arr[i+1])
            {
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }       
            if(arr[i] == arr[i+1])
            {
            flag = 1;
            continue;
            }
            flag = 0;
        }
        if(flag==1)
        {
            System.out.println("All numbers are the same... exiting... goodbye.");
            System.exit(0);
        }
        System.out.println(String.format("The largest number is %d", arr[2]));

    }
}
