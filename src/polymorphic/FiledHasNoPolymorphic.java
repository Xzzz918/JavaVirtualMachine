package polymorphic;

/**
 * @author gemini
 * Created in  2021/4/23 0:12
 */
public class FiledHasNoPolymorphic {
    static class Father{
        public int money = 1;

        public Father() {
            money = 2;
            showMeTheMoney();
        }

        public void showMeTheMoney(){
            System.out.println("Father, has $" + money);
        }
    }

    static class Son extends Father{
        public static int money = 3;

        public Son() {
            money = 4;
            showMeTheMoney();
        }

        @Override
        public void showMeTheMoney() {
            System.out.println("Son, has $" + money);
        }
    }

    public static void main(String[] args) {
        Father guy = new Son();
        System.out.println("guy, has $" + guy.money);
    }
}
/*outputs:
* Son, has $0
* Son, has $4
* guy, has $2
*/