package animal.mammifere;

import animal.Animal;
import animal.properties.properties;

public class Mammifere implements Animal {

    public static boolean reponse_est_mammifere = false;
    public static boolean est_mammifere = false;

    public static boolean isMammifere(boolean b1, boolean b2) {
        if(b1 && b2){
            return true;
        }else if(b1 && !b2){
            return false;
        }
        reponse_est_mammifere = true;
        if (propertyIsTrue()
                && (properties.aPoils(properties.reponse_a_poils, properties.a_poils)
                || properties.donneLait(properties.reponse_donne_lait, properties.donne_lait))) {
            est_mammifere = true;
            return true;
        }
        return false;
    }

    public static boolean propertyIsTrue() {
         System.out.println("----------> Animal est Mammifere?");
        if ((properties.reponse_a_poils && !properties.a_poils)
                || (properties.reponse_donne_lait && !properties.donne_lait)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Animal est Mamminfere?");
        boolean isMammifere;
//        isMammifere = Mammifere.isMammifere();
//        System.out.println(isMammifere);

    }
}
