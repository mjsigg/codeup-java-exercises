import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student michaelS = new Student("MichaelS");
        michaelS.addGrade(50);
        michaelS.addGrade(60);
        michaelS.addGrade(70);

        Student michaelF = new Student("MichaelF");
        michaelF.addGrade(65);
        michaelF.addGrade(85);
        michaelF.addGrade(95);

        Student daltonM = new Student("DylanM");
        daltonM.addGrade(9001);
        daltonM.addGrade(9001);
        daltonM.addGrade(9001);


        Student juanS = new Student("JuanS");
        juanS.addGrade(78);
        juanS.addGrade(88);
        juanS.addGrade(98);

        Student luisA = new Student("LuisA");
        luisA.addGrade(75);
        luisA.addGrade(85);
        luisA.addGrade(95);

        students.put("mjsigg", michaelS);
        students.put("mikefriend2", michaelF);
        students.put("!notDylan", daltonM);
        students.put("bigJandbigolS", juanS);
        students.put("fishingchannelmoderator", luisA);

//        System.out.println(students.get("mjsigg").getStudentName());

//        for (String s : students.keySet()) {
//            System.out.println(s);
//        }
//
//        for (Student student : students.values()) {
//            System.out.println(student.getGradeAverage());
//        }
//
//        for (Map.Entry<String, Student> stringStudentEntry : students.entrySet()) {
//            System.out.println(stringStudentEntry.getKey());
//            System.out.println(stringStudentEntry.getValue().getStudentName());
//        }



//
//        System.out.println(students.keySet());
//        Iterator studentsIterator = students.entrySet().iterator();
//        System.out.println(students.entrySet().iterator());



  /// initial inquiry
        boolean decision = true;

        while (decision) {
            System.out.printf("What student would you like to inquire about?");
            students.forEach((key, value) -> System.out.println("| "+ key +" |" ));

            Scanner userInput = new Scanner(System.in);
            String response = userInput.nextLine();


            ////conditionals

            if (students.containsKey(response)) {
                Student searchedStudent = students.get(response);
                System.out.printf("Name: %s - GitHub Username: %s\n Current Average: %f", searchedStudent.getStudentName(), response, searchedStudent.getGradeAverage());
            }else {
                System.out.format("Sorry, no student found with that Github username of\" %s\"",response);
            }

            /// exit portion

            System.out.println("\nWould you like to look up another user? Y/N");
            response = userInput.nextLine() ;

            if(response.equalsIgnoreCase("n")) {
                decision = false;
        }
    }


//
//        while{
//            System.out.println("Welcome! Here's a snippet of our users.");
//            System.out.println("What student would you like to see more information on?");
//
//            // full profile
//
//
//        }



//        for (Student student : students.values()) {
//            System.out.println(student.getGradeAverage());
//        }

//        for (Student student : students.keySet()) {
//            System.out.println(student.);
//        }



    }
}
