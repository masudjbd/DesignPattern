/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public class LuxuryCar extends Car {
 
    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}