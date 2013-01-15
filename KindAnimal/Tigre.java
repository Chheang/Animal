package KindAnimal;

import animal.carnivore.Carnivore;
import animal.mammifere.Mammifere;
import animal.properties.properties;

public class Tigre {

    public boolean isTigre() {
        if (propertyIsTrue()
                && Mammifere.isMammifere(Mammifere.reponse_est_mammifere, Mammifere.est_mammifere)
                && Carnivore.isCarnivore(Carnivore.reponse_est_carnivore, Carnivore.est_carnivore)
                && properties.aCouleurBrune(properties.reponse_a_couleur_brune, properties.a_couleur_brune)
                && properties.aRaiesNoires(properties.reponse_a_raise_noire, properties.a_raise_noire)
            ) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Aninal est Tigre? **********");
        if ((Mammifere.reponse_est_mammifere && !Mammifere.est_mammifere)
                || (Carnivore.reponse_est_carnivore && !Carnivore.est_carnivore)
                || (properties.reponse_a_couleur_brune && !properties.a_couleur_brune)
                || (properties.reponse_a_raise_noire && !properties.a_raise_noire)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Aninal est Tigre?");
        boolean isTigre;
        Tigre tigre = new Tigre();
        isTigre = tigre.isTigre();
        System.out.println("Tigre is " + isTigre);

    }
}
