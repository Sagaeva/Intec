package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {



     Cone orderCone(Flavor[] flavors) throws NoMoreIceCreamException;

    IceRocket orderIceRocket() throws NoMoreIceCreamException;

    Magnum  orderMagnum(MagnumType magnum) throws NoMoreIceCreamException;

    @Override
    default double getProfit() {
        return 0;
   }
}
