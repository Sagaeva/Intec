package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PrijsLijst;

public class IceCreamApp {

    public static void main(String[] args) {

        PrijsLijst prijsLijst = new PrijsLijst(1,2, 4);

        IceCreamSalon iceCreamSalon = new IceCreamSalon(prijsLijst, 0);



        Eatable[] eatables = new Eatable[] {iceCreamSalon.orderIceRocket(), iceCreamSalon.orderCone(new Flavor[] {Flavor.BANANA, Flavor.CHOCOLATE}),
            iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE)};

        for(Eatable eatable: eatables){
            eatable.eat();

        }

        System.out.println("Total profit: " + iceCreamSalon.getProfit());






    }
}
