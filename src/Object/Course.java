package Object;

public class Course {
	
	private double score;
	private int numOfAbsences;
	private double scoreAttendance, scoreMidTerm, scoreEndTerm;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getNumOfAbsences() {
		return numOfAbsences;
	}

	public void setNumOfAbsences(int numOfAbsences) {
		this.numOfAbsences = numOfAbsences;
	}

	public double getScoreAttendance() {
		return scoreAttendance;
	}

	public void setScoreAttendance(double scoreAttendance) {
		this.scoreAttendance = scoreAttendance;
	}

	public double getScoreMidTerm() {
		return scoreMidTerm;
	}

	public void setScoreMidTerm(double scoreMidTerm) {
		this.scoreMidTerm = scoreMidTerm;
	}

	public double getScoreEndTerm() {
		return scoreEndTerm;
	}

	public void setScoreEndTerm(double scoreEndTerm) {
		this.scoreEndTerm = scoreEndTerm;
	}

	public Course(double score, int numOfAbsences, double scoreAttendance, double scoreMidTerm, double scoreEndTerm) {
		this.score = score;
		this.numOfAbsences = numOfAbsences;
		this.scoreAttendance = scoreAttendance;
		this.scoreMidTerm = scoreMidTerm;
		this.scoreEndTerm = scoreEndTerm;
	}

	public Course() {
		
	}
	
}
