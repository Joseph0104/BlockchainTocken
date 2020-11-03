package com.company;

import java.util.Arrays;

public class Block {

    private  int previousHashValue;
    private String[] transaction;

    private  int blockHashValue ;

    public Block(int previousHashValue, String[] transaction) {
        this.transaction = transaction;
        this.previousHashValue = previousHashValue;

        Object[] objects =  { Arrays.hashCode(transaction), previousHashValue};
        this.blockHashValue = Arrays.hashCode(objects);
    }

    public  int getPreviousHashValue(){
        return previousHashValue;
    }

    public String[] getTransaction() {
        return transaction;
    }

    public int getBlockHashValue() {
        return blockHashValue;
    }

}
