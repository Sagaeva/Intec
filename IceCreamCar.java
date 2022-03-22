package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {

    private PrijsLijst prijsLijst;
    private Stock stock;
    private double profit;

    public IceCreamCar(PrijsLijst prijsLijst, Stock stock, double profit){
        this.prijsLijst = prijsLijst;
        this.stock = stock;
        this.profit = profit;
    }

    public PrijsLijst getPrijsLijst() {
        return prijsLijst;
    }

    public void setPrijsLijst(PrijsLijst prijsLijst) {
        this.prijsLijst = prijsLijst;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) throws NoMoreIceCreamException {
        Cone coneCar = prepareCone(flavors);
        profit += prijsLijst.getBallPrice() * flavors.length;
        return coneCar;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {

        IceRocket iceRocketcar = prepareRocket();
        profit += prijsLijst.getRocketPrice();
        return iceRocketcar;
    }

    private IceRocket prepareRocket() throws NoMoreIceCreamException {
        int count = stock.getIceRockets();
    if (count > 0) {
        IceRocket iceRocket = new IceRocket();
        stock.setIceRockets(count-1);
        return iceRocket;
    } else {
        throw new NoMoreIceCreamException("iceRocket");

        }
    }

    private Cone prepareCone(Flavor[] flavors) throws NoMoreIceCreamException {
        int resCones = stock.getCones() - 1;
        int resBalls = stock.getBalls() - flavors.length;
        if (resCones >= 0 && resBalls >= 0) {
            Cone cone = new Cone(flavors);
            stock.setCones(resCones);
            stock.setBalls(resBalls);
            return cone ;
        } else {
            throw new NoMoreIceCreamException("Cone");
        }
    }

    @Override
    public Magnum orderMagnum(MagnumType magnum) throws NoMoreIceCreamException {
        Magnum magni = prepareMagnum(magnum);
        profit += prijsLijst.getMagnumStandartPrice(magnum);
        return magni;
    }

    private Magnum prepareMagnum(MagnumType magnum) throws NoMoreIceCreamException {
        int count = stock.getMagni();
        if (count > 0) {
            Magnum magni = new Magnum(magnum);
            stock.setMagni(count-1);
            return magni;
        } else {
            throw new NoMoreIceCreamException("Magnum");
        }
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
