package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.MenuCard;

public class BindedMenuCard implements MenuCard {

    @Override
    public String[] getItems(int tableNo, String customerName) {

        System.out.println("running getItems in BindedMenuCard");
        System.out.println("table no :" + tableNo + " customer name :" + customerName);

        return new String[]{"Dosa", "Poori", "Bread Sandwich", "Gobi"};
    }
}
