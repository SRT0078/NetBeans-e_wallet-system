/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyWallet.Controller;

// create SelectionSort class
public class SelectionSort {
        
    //create an selection sorting by Name where accepts multipal paramiter
    public void selectionSortByName(int[] Ids, String[] names, String[] addresses, String[] phones, float[] amounts, String[] dates, String[] statuses, String[] actypeses, int[] transactions, int order){
        int size = names.length;
        
        // used to for loop and initail the minindex
        for(int step=0; step<size; step++){
            int minInd = step;
            // check the aplhabet is less then size and order check to sorting by ascending or descending
            for(int nextAplha=step+1; nextAplha<size; nextAplha++){
                if (order==0) {
                    if(names[nextAplha].compareTo(names[minInd])<0){
                        minInd = nextAplha;
                    }
                }else{ 
                    if(names[nextAplha].compareTo(names[minInd])>0){
                        minInd = nextAplha;
                    }
                }      
            }
            
            //id swaping
            int id = Ids[step];
            Ids[step] = Ids[minInd];
            Ids[minInd] = id;
            
            //name swaping
            String name = names[step];
            names[step] = names[minInd];
            names[minInd] = name;
            
            //address swaping
            String address = addresses[step];
            addresses[step] = addresses[minInd];
            addresses[minInd] = address;
            
            //phone no swaping
            String phone = phones[step];
            phones[step] = phones[minInd];
            phones[minInd] = phone;
            
            //amount swaping
            float amount = amounts[step];
            amounts[step] = amounts[minInd];
            amounts[minInd] = amount;
            
            //date swaping
            String date = dates[step];
            dates[step] = dates[minInd];
            dates[minInd] = date;
            
            //status swaping
            String status = statuses[step];
            statuses[step] = statuses[minInd];
            statuses[minInd] = status;
            
            //acTypes swaping
            String acType = actypeses[step];
            actypeses[step] = actypeses[minInd];
            actypeses[minInd] = acType;
            
            // transaction swaping
            int trans = transactions[step];
            transactions[step] = transactions[minInd];
            transactions[minInd] = trans;
        }
    }

    //create an selection sorting by amoun where accepts multipal paramiter
    public void selectionSortByAmount(int[] Ids, String[] names, String[] addresses, String[] phones, float[] amounts, String[] dates, String[] statuses, String[] actypeses, int[] transactions, int order){

        // sorting by amount where get the size of amounts list   
        int size = amounts.length;

        for(int step=0; step<size; step++){
            int minIndex = step;
            for(int nextNum=step+1; nextNum<size; nextNum++){
                //Assinding and dessinding >
                if (order==0) {
                    if(amounts[nextNum]<amounts[minIndex])
                        minIndex = nextNum;
                }else{
                    if(amounts[nextNum]>amounts[minIndex])
                        minIndex = nextNum;
                }    
            }

            //id swaping
            int id = Ids[step];
            Ids[step] = Ids[minIndex];
            Ids[minIndex] = id;
            
            //name swaping
            String name = names[step];
            names[step] = names[minIndex];
            names[minIndex] = name;
            
            //address swaping
            String address = addresses[step];
            addresses[step] = addresses[minIndex];
            addresses[minIndex] = address;
            
            //phone no swaping
            String phone = phones[step];
            phones[step] = phones[minIndex];
            phones[minIndex] = phone;
            
            //amount swaping
            float amount = amounts[step];
            amounts[step] = amounts[minIndex];
            amounts[minIndex] = amount;
            
            //date swaping
            String date = dates[step];
            dates[step] = dates[minIndex];
            dates[minIndex] = date;
            
            //status swaping
            String status = statuses[step];
            statuses[step] = statuses[minIndex];
            statuses[minIndex] = status;
            
            //acTypes swaping
            String acType = actypeses[step];
            actypeses[step] = actypeses[minIndex];
            actypeses[minIndex] = acType;
            
            // transaction swaping
            int transaction = transactions[step];
            transactions[step] = transactions[minIndex];
            transactions[minIndex] = transaction;
        }
    }
}