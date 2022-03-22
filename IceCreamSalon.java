package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class IceCreamSalon  implements IceCreamSeller {

    private PrijsLijst prijsLijst;
    private double totalProfit;

    public IceCreamSalon(PrijsLijst prijsLijst, double totalProfit){
        this.prijsLijst = prijsLijst;
        this.totalProfit = totalProfit;

    }

    public PrijsLijst getPrijsLijst() {
        return prijsLijst;
    }

    public void setPrijsLijst(PrijsLijst prijsLijst) {
        this.prijsLijst = prijsLijst;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        Cone conesalon = new Cone(flavors);
        totalProfit += (prijsLijst.getBallPrice() * flavors.length);
        return conesalon;

    }
        @Override
        public IceRocket orderIceRocket () {
        IceRocket iceRocketSalon = new IceRocket();
        totalProfit += prijsLijst.getRocketPrice();
            return iceRocketSalon;
        }

        @Override
        public Magnum orderMagnum (MagnumType magnum){
         Magnum magnumsalon = new Magnum(magnum);
         totalProfit += prijsLijst.getMagnumStandartPrice(magnum);
            return magnumsalon;
        }


        @Override
        public double getProfit () {
            return totalProfit;
        }

        @Override
        public String toString () {
            return "IceCreamSalon{" +
                    "prijsLijst=" + prijsLijst +
                    ", totalProfit=" + totalProfit +
                    '}';
        }
    }


