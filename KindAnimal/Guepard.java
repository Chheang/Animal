package KindAnimal;

import animal.carnivore.Carnivore;
import animal.mammifere.Mammifere;
import animal.properties.properties;

public class Guepard {

    public boolean isGepard() {
        if (propertyIsTrue()
                && Mammifere.isMammifere(Mammifere.reponse_est_mammifere, Mammifere.est_mammifere)
                && Carnivore.isCarnivore(Carnivore.reponse_est_carnivore, Carnivore.est_carnivore)
                && properties.aCouleurBrune(properties.reponse_a_couleur_brune, properties.a_couleur_brune)
                && properties.aTachesSombres(properties.reponse_a_taches_sombres, properties.a_taches_sombres)) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Aninal est Guepard? **********");
        if ((Mammifere.reponse_est_mammifere && !Mammifere.est_mammifere)
                || (Carnivore.reponse_est_carnivore && !Carnivore.est_carnivore)
                || (properties.reponse_a_couleur_brune && !properties.a_couleur_brune)
                || (properties.reponse_a_taches_sombres && !properties.a_taches_sombres)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Aninal est Guepard?");
        boolean isGepard;
        Guepard guepard = new Guepard();
        isGepard = guepard.isGepard();
        System.out.println("Guepard is " + isGepard);
    }
}
