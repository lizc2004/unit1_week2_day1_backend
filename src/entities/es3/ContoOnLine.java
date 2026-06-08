package entities.es3;

import exceptions.es3.BancaException;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        // TODO: stampare i dati del conto
    }

    @Override
    public void preleva(double x) throws BancaException {
        // TODO: lanciare BancaException se x > maxPrelievo
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
    }
}
