package KindAnimal;

import animal.oiseau.Oiseau;
import animal.properties.properties;

public class Pingouin {

    public boolean isPingouin() {
        if (propertyIsTrue()
                && Oiseau.isOiseau(Oiseau.reponse_est_oiseau, Oiseau.est_oiseau)
                && !properties.vole(properties.reponse_vole,properties.vole)
                && properties.nage(properties.reponse_nage, properties.nage)
                && properties.estNoirEtBlanc(properties.reponse_est_noir_et_blanc, properties.est_noir_et_blanc)) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Aninal est Pingouin? **********");
        if ((Oiseau.reponse_est_oiseau && !Oiseau.est_oiseau)
                || (properties.reponse_vole && properties.vole)
                || (properties.reponse_nage && !properties.nage)
                || (properties.reponse_est_noir_et_blanc && !properties.est_noir_et_blanc)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Aninal est Pingouin?");
        boolean isPingouin;
        Pingouin pingouin = new Pingouin();
        isPingouin = pingouin.isPingouin();
        System.out.println("Pingouin is " + isPingouin);
    }
}
