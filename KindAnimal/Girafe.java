package KindAnimal;

import animal.mammifere.Ongule;
import animal.properties.properties;

public class Girafe {

    public boolean isGirafe() {
        if (propertyIsTrue()
                && Ongule.isOngule(Ongule.reponse_est_ongule, Ongule.est_ongule)
                && properties.aLongCou(properties.reponse_a_long_cou, properties.a_long_cou)
                && properties.aLonguesPattes(properties.reponse_a_longues_pattes, properties.a_longues_pattes)
                && properties.aTachesSombres(properties.reponse_a_taches_sombres, properties.a_taches_sombres)
            ) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Animal est Girafe? **********");
        if ((Ongule.reponse_est_ongule && !Ongule.est_ongule)
                || (properties.reponse_a_long_cou && !properties.a_long_cou)
                || (properties.reponse_a_longues_pattes && !properties.a_longues_pattes)
                || (properties.reponse_a_taches_sombres && !properties.a_taches_sombres)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Animal est Girafe?");
        boolean isGirafe;
        Girafe girafe = new Girafe();
        isGirafe = girafe.isGirafe();
        System.out.println("Girafe is " + isGirafe);

    }
}
