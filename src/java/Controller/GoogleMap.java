/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entity.SheepShopAddress;
import Model.Return.reDistance;
import Model.Sess.SheepShopAddressFacadeLocal;
import Model.distanceMatrix;
import com.google.gson.Gson;
import java.math.BigDecimal;

/**
 *
 * @author DTT
 */
public class GoogleMap {

    static reDistance dt;

    public static reDistance getDistance(int shop_id, String origin, String destination) {
        origin = origin.substring(1, origin.length() - 1);
        destination = destination.substring(1, destination.length() - 1);
        String json = urlProcess.readUrl("https://maps.googleapis.com/maps/api/distancematrix/json?language=vi&origins="
                + origin
                + "&destinations="
                + destination);

        Gson g = new Gson();
        distanceMatrix map = g.fromJson(json, distanceMatrix.class);

//        if (map.getRows().get(0).getElements().get(0).getStatus().equals("NOT_FOUND")) {
//            System.out.print("NOT_FOUND");
//        } else {
//            int dis = map.getRows().get(0).getElements().get(0).getDistance().getValue();
//            System.out.print("FOUND");
//
//            SheepShopAddress ssa = SheepShopAddressFacade.find(1);
//            String fee = ssa.getShippingFees();
//            System.out.print(fee);
//
//            BigDecimal mpm = new BigDecimal(fee);
//
//            dt.setDistance(Integer.toString(dis));
//            dt.setMoneypermile(mpm);
//            dt.setMoney(mpm.multiply(new BigDecimal(dis)));
//        }
        return dt;
    }
}
