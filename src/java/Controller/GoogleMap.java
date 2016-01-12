/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.urlProcess;
import Model.distanceMatrix;
import com.google.gson.Gson;

/**
 *
 * @author DTT
 */
public class GoogleMap {
    public static String getDistance(String origin, String destination){
        origin = origin.substring(1, origin.length()-1);
        destination = destination.substring(1, destination.length()-1);
        String json = urlProcess.readUrl("https://maps.googleapis.com/maps/api/distancematrix/json?language=vi&origins=" 
                + origin 
                + "&destinations="
                + destination);
        Gson g = new Gson();
        distanceMatrix map = g.fromJson(json, distanceMatrix.class);
        return map.getRows().get(0).getElements().get(0).getDistance().getText();
    }
}
