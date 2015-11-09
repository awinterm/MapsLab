/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author andre_000
 */
public class Car implements Comparable {
    private int vinNumber;

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.vinNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.vinNumber != other.vinNumber) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public int compareTo(Object o) {
         Car targetCar = (Car)o;
         return new CompareToBuilder()
               .append(this.vinNumber, targetCar.vinNumber)
               .toComparison();
        
        
//        Car targetCar = (Car)o;
//        final int EQUAL = 0;
//        final int BEFORE = -1;
//        final int AFTER = 1;
//        
//        if(this.equals(targetCar)){
//            return EQUAL;
//        }
//        if(targetCar.getVinNumber() < this.getVinNumber()){
//            return BEFORE;
//        }
//       if(targetCar.getVinNumber() > this.getVinNumber()){
//            return AFTER;
//        }
//        
       
    }
    
}
