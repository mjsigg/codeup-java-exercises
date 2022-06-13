import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bobSure = "Sure. ";
        String bobChill = "Whoa, chillout! ";
        String bobBeThatWay = "Fine. Be that way! ";
        String bobWhatever = "Whatevs.";
        ;

        System.out.println("Bob: Hey, you got something you wanna ask me?");
        String questionToBob = scan.nextLine();

        if(questionToBob.endsWith("!")) {
            System.out.printf(bobChill + bobWhatever);
        }else if (questionToBob.endsWith("?")) {
            System.out.printf("%s", bobSure + bobWhatever);
        }else if (questionToBob.endsWith(".")) {
            System.out.printf(bobSure);
        }else if (questionToBob.endsWith("")|| questionToBob.startsWith("")) {
            System.out.printf(bobWhatever);
        }
    }
}


//    Create a class named Bob with a main method for the following exercise.
//
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.