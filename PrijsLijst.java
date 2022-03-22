package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PrijsLijst {

    private double ballPrice;
    private double RocketPrice;
    private double MagnumStandartPrice;

    PrijsLijst() {

    }

    public PrijsLijst(double ballPrice, double RocketPrice, double MagnumStandartPrice) {
        this.ballPrice = ballPrice;
        this.RocketPrice = RocketPrice;
        this.MagnumStandartPrice = MagnumStandartPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return RocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        RocketPrice = rocketPrice;
    }

    public void setMagnumStandartPrice(double MagnumStandartPrice) {
        this.MagnumStandartPrice = MagnumStandartPrice;
    }

    public double getMagnumStandartPrice(MagnumType Magnumtype) {
        switch (Magnumtype) {
            case MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, APLPINENUTS, ROMANTICSSTRAWBERRIES:
                return MagnumStandartPrice * 1.5;
            default:
                return MagnumStandartPrice;

        }
    }
}



