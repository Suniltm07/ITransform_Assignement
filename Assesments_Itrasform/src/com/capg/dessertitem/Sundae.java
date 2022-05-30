package com.capg.dessertitem;

public class Sundae extends IceCream{

    protected String topName;
    protected int topCost;

    public Sundae(String _n0, int _cost0, String _n1, int _cost1){
        
        super(_n0, _cost0);
        topName = _n1;
        topCost = _cost1;
    }

    public final String getName(){
       
        return name + " " + topName;
    }

    public int getCost(){
        
        return cost + topCost;
    }

}
