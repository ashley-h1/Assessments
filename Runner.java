import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {
        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions = 0 ;    // Number of questions
            int missed = 0;       // Number of questions missed

            // Get the number of questions on the exam
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            try{
                questions = Integer.parseInt(input);
            }
            catch (NumberFormatException e){
                System.out.println("Error: Enter an integer, no letters");
                System.exit(0);
            }
            finally{
                if (questions == 0){
                    System.out.println("Error: 0 questions on exam");
                    System.exit(0);
                }
            }

            // Get the number of questions the student missed
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            try{
                missed = Integer.parseInt(input);
            }
            catch (NumberFormatException e){
                System.out.println("Error: Enter an integer, no letters");
                System.exit(0);
            }
            finally{
                if (missed > questions){
                    System.out.println("Error: Missed questions is greater than total questions");
                    System.exit(0);
                }
            }

            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

            System.exit(0);
        }
    }


