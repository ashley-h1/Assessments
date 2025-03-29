import Math;
public class Exam extends Assessment{
    private int questions;
    private int missed;

    public Exam(int questions, int missed){
        this.questions = questions;
        this.missed = missed;
        float temp = ((((float)questions-missed)/questions)*100);
        setScore(Math.round(temp));
    }
    public int getPointsEach(){
        float answer = 100/(float)questions;
        answer = Math.round(answer);
        return (int)answer;
    }
    public int getNumMissed(){
        return this.missed;
    }
}