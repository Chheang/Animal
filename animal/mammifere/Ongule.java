package animal.mammifere;

import animal.carnivore.Carnivore;
import animal.properties.properties;

public class Ongule {

    public static boolean reponse_est_ongule = false;
    public static boolean est_ongule = false;

    public static boolean isOngule(boolean b1, boolean b2) {
        if(b1 && b2){
            return true;
        }else if(b1 && !b2){
            return false;
        }
        reponse_est_ongule = true;
        if (propertyIsTrue()
                && Mammifere.isMammifere(Mammifere.reponse_est_mammifere, Mammifere.est_mammifere)
                && (properties.aSabots(properties.reponse_a_sabots, properties.a_sabots)
                || Carnivore.isCarnivore(Carnivore.reponse_est_carnivore, !Carnivore.est_carnivore))) {
            est_ongule = true;
            return true;
        }
        return false;
    }

    public static boolean propertyIsTrue() {
         System.out.println("----------> Animal est Ongule");
        if ((Mammifere.reponse_est_mammifere && !Mammifere.est_mammifere)
                || (Carnivore.reponse_est_carnivore && Carnivore.est_carnivore)
                || (properties.reponse_a_sabots && !properties.a_sabots)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Animal est Ongule?");
        boolean isOngule;
//        isOngule = Ongule.isOngule();
//        System.out.println("Ongule is " + isOngule);

    }
}
