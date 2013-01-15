package KindAnimal;

import animal.mammifere.Ongule;
import animal.properties.properties;

public class Zebre {

    public boolean isZebre() {
        if (propertyIsTrue() 
                && Ongule.isOngule(Ongule.reponse_est_ongule, Ongule.est_ongule)
                && properties.aRaiesNoires(properties.reponse_a_raise_noire, properties.a_raise_noire)) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Aninal est Zebre? **********");
        if ((Ongule.reponse_est_ongule && !Ongule.est_ongule)
                || (properties.reponse_a_raise_noire && !properties.a_raise_noire)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Aninal est Zebre?");
        boolean isZebre;
        Zebre zebre = new Zebre();
        isZebre = zebre.isZebre();
        System.out.println("Zebre is " + isZebre);

    }
}
