package animal.oiseau;

import animal.Animal;
import animal.properties.properties;

public class Oiseau implements Animal {

    public static boolean reponse_est_oiseau = false;
    public static boolean est_oiseau = false;

    ;
    
    public static boolean isOiseau(boolean b1 , boolean b2) {
        if(b1 && b2){
            return true;
        }else if(b1 && !b2){
            return false;
        }
        reponse_est_oiseau = true;

        if (propertyIsTrue() &&
            (properties.aPlumes(properties.reponse_a_plumes, properties.a_plumes)
                || (properties.vole(properties.reponse_vole, properties.vole)
                && properties.pondsOeufs(properties.reponse_ponds_oeufs, properties.ponds_oeufs)))) {
            est_oiseau = true;
            return true;
        }
        return false;
    }

    public static boolean propertyIsTrue() {
        System.out.println("----------> Animal est Oiseau?");
        if ((properties.reponse_a_plumes && !properties.a_plumes)
                || (properties.reponse_vole && !properties.vole)
                || (properties.reponse_ponds_oeufs && !properties.ponds_oeufs)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Animal est Oiseau?");
        boolean isOiseau;
//        isOiseau = Oiseau.isOiseau();
//        System.out.println(isOiseau);
    }
}
