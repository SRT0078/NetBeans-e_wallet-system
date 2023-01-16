/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyWallet.Controller;

/**
 *
 * @author Lenovo
 */
public class BinarySearch {
    
    // serching by String
    public int searchByString(String[] arr, int low, int high, String searchKey){
        if(high>=low){
            System.out.println("high: "+high);
            int mid = (low + high)/2;

            // check the arraylist mid values to search key values
            if (arr[mid].equals(searchKey)){
                return mid;
            }

            if (arr[mid].compareTo(searchKey)>0){
                return searchByString(arr, low, mid-1, searchKey);
            }
            return searchByString(arr, mid+1, high, searchKey);
        }else{
            return -1;
        }
    }
    
    // searching by number
    public int searchByInteger(int[] arr, int low, int high, int searchKey){
        
        if(high>=low){
            int mid = (low + high)/2;
            
            if (arr[mid] == searchKey)
                return mid;
            
            // check the arraylist mid values to search key values
            if (arr[mid] > searchKey){
                return searchByInteger(arr, low, mid-1, searchKey);
            }
            return searchByInteger(arr, mid+1, high, searchKey);
        }else{
            return -1;
        }
    }
}
