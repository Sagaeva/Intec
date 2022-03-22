package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {

    public NoMoreIceCreamException(String icecreamName) {
        super(icecreamName);
    }

}

