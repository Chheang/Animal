/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KindAnimal;

/**
 *
 * @author macbookpro
 */
public class main {

    public static void main(String[] args) {
        Aigle aigle = new Aigle();
        Autruche autruche = new Autruche();
        Girafe girafe = new Girafe();
        Guepard guepard = new Guepard();
        Pingouin pingouin = new Pingouin();
        Tigre tigre = new Tigre();
        Zebre zebre = new Zebre();
        if (guepard.isGepard()) {
            System.out.println("Animal est Gepard");
        } else if (tigre.isTigre()) {
            System.out.println("Animal est Tigre");
        } else if (girafe.isGirafe()) {
            System.out.println("Animal est Girafe");
        } else if (zebre.isZebre()) {
            System.out.println("Animal est Zebre");
        } else if (autruche.isAutruche()) {
            System.out.println("Animal est Autruche");
        } else if (pingouin.isPingouin()) {
            System.out.println("Animal est Pingouin");
        } else if (aigle.isAigle()) {
            System.out.println("Animal est Aigle");
        } else {
            System.out.println("No in fait");
        }
    }
    public static void main() {
        Aigle aigle = new Aigle();
        Autruche autruche = new Autruche();
        Girafe girafe = new Girafe();
        Guepard guepard = new Guepard();
        Pingouin pingouin = new Pingouin();
        Tigre tigre = new Tigre();
        Zebre zebre = new Zebre();
        if (guepard.isGepard()) {
            System.out.println("Animal est Gepard");
        } else if (tigre.isTigre()) {
            System.out.println("Animal est Tigre");
        } else if (girafe.isGirafe()) {
            System.out.println("Animal est Girafe");
        } else if (zebre.isZebre()) {
            System.out.println("Animal est Zebre");
        } else if (autruche.isAutruche()) {
            System.out.println("Animal est Autruche");
        } else if (pingouin.isPingouin()) {
            System.out.println("Animal est Pingouin");
        } else if (aigle.isAigle()) {
            System.out.println("Animal est Aigle");
        } else {
            System.out.println("No in fait");
        }
    }
}
