/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.date;


public class Date {
    int day,month,year;
    public Date(int day, int month, int year) throws DException {
       if (day<1 ||day>30 ||month<1 ||month>12 ||year>2024) {
        throw new DException("error");
       }
        this.day = day;
        this.month = month;
        this.year = year;
       }

    public void AfficheDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}

