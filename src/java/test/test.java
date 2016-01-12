/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Controller.GoogleMap;
/**
 *
 * @author DTT
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        System.out.print(GoogleMap.getDistance("(21.0290212,105.7855)", "(22.0290212,105.7855)"));
        
    }
}
