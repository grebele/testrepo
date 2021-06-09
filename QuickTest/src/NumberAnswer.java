
public class NumberAnswer extends Question {
	private double answer;
	
	public void setAnswer (double correctResponse) {
		answer = correctResponse;
	}

	public boolean checkAnswer (double response) {	
		return answer == response;
	}



	}
