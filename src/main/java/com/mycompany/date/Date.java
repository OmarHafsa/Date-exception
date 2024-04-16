/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.date;


public class Date {
    int jour,mois,année;
    public Date(int jour, int mois, int année) throws DException {
       if (jour<1 ||jour>30 ||mois<1 ||mois>12 ||année>2024) {
        throw new DException("error");
       }
        this.jour = jour;
        this.mois = mois;
        this.année = année;
       }

    public void AfficheDate() {
        System.out.println(this. jour+ "/" + this.mois + "/" + this.année);
    }
}

