public class ServerNameGenerator {
    private static String[] adjective = {"nice","nice","kind","kind","rude","rude","impressive","impressive","stupendous","stupendous"};

    private static String[] noun = {"pizza","spag","spam","pine","pepper","banana","apple", "kiwi","donut","veg"};

    private static String randomEle() {
        String randomNum = String.valueOf(getRandom());
        return randomNum;
    }

    public static String serverNames(String[]name1, String[]name2) {
        String makeName = name1[Integer.parseInt(randomEle())];
        String makeName2 = name2[Integer.parseInt(randomEle())];

        return makeName + " " + makeName2;
    }

    static int getRandom() {
        int randomNumber = (int) (Math.random() * adjective.length);
        return randomNumber;
    }

    public static void main(String[] args) {
        System.out.println("Name is: ");
        System.out.println(serverNames(adjective,noun));
    }
}
