/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyWallet.Models;

public class Customer {

    // this ia the constructoe
    public Customer() {}
    
    // initialize the variables
    private int id;
    private String name;
    private String address;
    private String phone;
    private float amount;
    private String date;
    private String status;
    private String actypes;
    private int transaction;
    
    // this is the gettter methods where as the values is get from initial varabale
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public float getAmount() {
       return amount;
    }
    public String getDate() {
       return date;
    }
    public String getStatus() {
        return status;
    }
    public String getAcTypes(){
        return actypes;
    }
    public int getTransaction(){
        return transaction;
    }
    
    // this is the setter methods where the values are set in initial variable
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAmount(float amount) {
       this.amount = amount;
    }
    public void setDate(String date) {
       this.date = date;
    }
    public void setStatus(String status) {
       this.status = status;
    }
    public void setAcTypes(String actypes) {
       this.actypes = actypes;
    }
    public void setTransaction(int transaction){
        this.transaction = transaction;
    }
}
