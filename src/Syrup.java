public class Syrup extends State {
    String name;

    public void setName(String name) {
        if (name == "Чёрт") {
            this.name = "ОШИБКА 0000000000000";//???????????
        } else {
            this.name = name;
        }
    }
    int randomNum = (int) (Math.random() * 991) + 10;

    void weight(){ System.out.print(" "+ "\u001B[33m" + this.name + "\u001B[0m \u001B[34m" + "(весом "+ randomNum+" кг) \u001B[0m");}
    public void DoSmt(){
        System.out.print(" боялся лететь на воздушном шаре"); //?????????
    }
    public void say(){
        System.out.print("Он уже задрал ногу чтобы вылезти ");
    }
}
