
public class GradeAvg {

	public static void main(String[] args) {
		double quizScore1 = 75.0;
		double quizScore2 = 93.8;
		double quizScore3 = 92.6;
	 

		double testScore1 = 96.7;
		double testScore2 = 89.9;

		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
		double testScoreAvg = (testScore1 + testScore2) / 2;

		System.out.println("Quiz Score Average: " + quizScoreAvg + "%");
		System.out.println("Test Score Average: " + testScoreAvg + "%");

	}

}
