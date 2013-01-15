package KindAnimal;

import animal.carnivore.Carnivore;
import animal.oiseau.Oiseau;
import animal.properties.properties;

public class Aigle {

    public boolean isAigle() {
        if (propertyIsTrue()
                && Oiseau.isOiseau(Oiseau.reponse_est_oiseau, Oiseau.est_oiseau)
                && Carnivore.isCarnivore(Carnivore.reponse_est_carnivore, Carnivore.est_carnivore)) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Animal est Aigle? **********");
        if ((Oiseau.reponse_est_oiseau && !Oiseau.est_oiseau)
                || (Carnivore.reponse_est_carnivore && !Carnivore.est_carnivore)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Aninal est Aigle?");
        boolean isAigle;
        Aigle aigle = new Aigle();
        isAigle = aigle.isAigle();
        System.out.println("Aigle is " + isAigle);

    }
}
