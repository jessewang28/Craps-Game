package com.company;

public class Die {
    private int x;

    public Die() {
        x = 0;
    }

    public void roll() {
        x = (int) (Math.random() * 6 + 1);
    }

    public int getNumDots()
    {
        return x;
    }

    public static void main(String[] args) {
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());

    }
}


