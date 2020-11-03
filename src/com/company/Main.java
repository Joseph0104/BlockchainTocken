package com.company;

import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {


        String [] firstTransaction = {"................"};
        Block firstBlock = new Block(0, firstTransaction);

        System.out.println(firstBlock.getBlockHashValue());
    }
}
