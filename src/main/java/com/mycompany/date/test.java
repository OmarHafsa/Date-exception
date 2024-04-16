package com.mycompany.date;

public class test {
        public static void main(String[] args) {
            try {
                 Date date1 = new Date(4, 6, 2016);
                date1.AfficheDate();
                Date date2 = new Date(30, 14, 2024);
                date2.AfficheDate();
            } catch (DException e) {
                System.out.println(e.getMessage());
            }
        }
    
    }
