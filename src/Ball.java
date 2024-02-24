public class Ball extends State {
    int randomNum2 = (int) (Math.random() * 991) + 10;
    void weight(){ System.out.print("Шар\u001B[34m" + "(весом "+ randomNum2+" кг) \u001B[0m");}

    void polet(int x){System.out.print(" стал легче и поднялся на \u001B[35m"+ x +"\u001B[0m метров\n");}

}
