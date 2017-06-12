package com.company.program;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main st = new Main();
        //st.startProgram(new DishesOnNature());
        st.startProgram(new AdditionalDishes());
    }
    void startProgram (MyOneInterfejs st){
        st.start();
    }
}
