/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class SteamedMilk extends CondimentDecorator{
 
    Beverage beverage;
    
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
    
}
