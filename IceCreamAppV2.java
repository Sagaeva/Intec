package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {

    public static void main(String[] args) {

        PrijsLijst prijsLijst = new PrijsLijst(1,2, 4);

        Stock stock = new Stock(10,8,6,2);
        IceCreamCar iceCreamCar = new IceCreamCar(prijsLijst, stock, 0);




        try {
            Eatable[] eatables = new Eatable[] {iceCreamCar.orderIceRocket(), iceCreamCar.orderCone(new Flavor[] {Flavor.BANANA, Flavor.CHOCOLATE}),
                    iceCreamCar.orderMagnum(MagnumType.MILKCHOCOLATE)};

            for(Eatable eatable: eatables){
                eatable.eat();

            }

            System.out.println("Total profit: " + iceCreamCar.getProfit());

        } catch (NoMoreIceCreamException e) {
            System.out.println("No more icecream: " + e.getLocalizedMessage());
        }






    }
}
