package com.company;

public class Die {
    public Die()
    { int x = 0; }

    public int roll()
    {
     int x = (int) (Math.random()*6 + 1) + Math.random()*6 + 1);
     return x;
    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());

    }



