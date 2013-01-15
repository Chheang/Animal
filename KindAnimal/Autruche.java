package KindAnimal;

import animal.oiseau.Oiseau;
import animal.properties.properties;

public class Autruche {

    public boolean isAutruche() {
        if (propertyIsTrue()
                && Oiseau.isOiseau(Oiseau.reponse_est_oiseau, Oiseau.est_oiseau)
                && !properties.vole(properties.reponse_vole, !properties.vole)
                && properties.aLongCou(properties.reponse_a_long_cou, properties.a_long_cou)
                && properties.aLonguesPattes(properties.reponse_a_longues_pattes, properties.a_longues_pattes)
                && properties.estNoirEtBlanc(properties.reponse_est_noir_et_blanc, properties.est_noir_et_blanc)) {
            return true;
        }
        return false;
    }

    public boolean propertyIsTrue() {
        System.out.println("********** Animal est Autruche? **********");
        if ((Oiseau.reponse_est_oiseau && !Oiseau.est_oiseau)
                || (properties.reponse_vole && properties.vole)
                || (properties.reponse_a_long_cou && !properties.a_long_cou)
                || (properties.reponse_a_longues_pattes && !properties.a_longues_pattes)
                || (properties.reponse_est_noir_et_blanc && !properties.est_noir_et_blanc)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Aninal est Autruche?");
        boolean isAutruche;
        Autruche autruche = new Autruche();
        isAutruche = autruche.isAutruche();
        System.out.println("Autruche is " + isAutruche);
    }
}
