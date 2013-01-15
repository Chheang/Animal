package animal.carnivore;

import animal.Animal;
import animal.properties.properties;

public class Carnivore implements Animal {

    public static boolean reponse_est_carnivore = false;
    public static boolean est_carnivore = false;

    public static boolean isCarnivore(boolean b1 , boolean b2) {
        if(b1 && b2){
            return true;
        }else if(b1 && !b2){
            return false;
        }
        reponse_est_carnivore = true;
        if (propertyIsTrue()
                && (properties.mangerViande(properties.reponse_manger_viande, properties.manger_viande)
                || (properties.aDentPointues(properties.reponse_a_dent_pointues, properties.a_dent_pointues)
                && properties.aGriffes(properties.reponse_a_griffes, properties.a_griffes)
                && properties.aYeuxVersAvant(properties.reponse_a_yeux_vers_avant, properties.a_yeux_vers_avant)))) {
            est_carnivore = true;
            return true;
        }
        return false;
    }

    public static boolean propertyIsTrue() {
         System.out.println("----------> Animal est Carnivore?");
        if ((properties.reponse_manger_viande && !properties.manger_viande)
                || (properties.reponse_a_dent_pointues && !properties.a_dent_pointues)
                || (properties.reponse_a_yeux_vers_avant && !properties.a_yeux_vers_avant)
                || (properties.reponse_a_griffes && !properties.a_griffes)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Animal est Carnivore?");
        boolean isCarnivore;
//        isCarnivore = Carnivore.isCarnivore();
//        System.out.println(isCarnivore);

    }
}
