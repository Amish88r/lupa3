public class Znaika {
    String stil = "\u001B[34m" + " один мешок" + "\u001B[0m с песком и выбросил из корзины.";
    String stil1 = "\u001B[34m" + " два мешка" + "\u001B[0m с песком и выбросил их из корзины.";
    String stil2 = "\u001B[34m" + " очень много мешков" + "\u001B[0m с песком и выбросил их из корзины.";
    String qwerty;

    public void sos() {
        int know = (int) (Math.random() * 3) + 1;
        if (know == 1) {
            qwerty = stil;
        } else if (know == 2) {
            qwerty = stil1;
        } else {
            qwerty = stil2;
        }
        System.out.print(",но тут Знайка взял"+qwerty);
    }
    private String pop= " для чего Знайка велел положить в корзину мешки с песком";
    public void understood(){ System.out.print(pop);}

    String kol;
    public void ruka() {
        int lol = (int) (Math.random() * 3) + 1;
            if (lol == 1) {
                kol = "\u001B[32m руку \u001B[0m";
            } else if (lol == 2) {
                kol = "\u001B[32m ногу \u001B[0m";
            } else {
                kol = "\u001B[32m какую-то часть тела \u001B[0m";
            }
            System.out.print(",а Знайка поднял кверху\n" + kol + " и обратился к коротышкам с речью.");
        }
    }


