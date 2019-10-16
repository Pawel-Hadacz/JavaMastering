package mastering.repetition;

public class Main {

    public static void main(String[] args) {

	int lvlCompleted = 5;
	int bonus = 100;
	int C1 = CalcScore(true,5000,lvlCompleted,bonus);
	int C2 = CalcScore(true,5000,5,100);
		System.out.println(C1);
		System.out.println(C2);
		//zadanko cd

		int res1 = calculateHighScorePosition(1500);
		int res2 = calculateHighScorePosition(900);
		int res3 = calculateHighScorePosition(400);
		int res4 = calculateHighScorePosition(50);
		displayHighScorePostion("Pawel", res1);
		displayHighScorePostion("Tomek", res2);
		displayHighScorePostion("Adrian", res3);
		displayHighScorePostion("Patryk", res4);

		int es1 = calculateHighScorePosition2(1500);
		int es2 = calculateHighScorePosition2(900);
		int es3 = calculateHighScorePosition2(400);
		int es4 = calculateHighScorePosition2(50);
		displayHighScorePostion("Pawel", es1);
		displayHighScorePostion("Tomek", es2);
		displayHighScorePostion("Adrian", es3);
		displayHighScorePostion("Patryk", es4);
		System.out.println( res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
	/*if(score ==5000){
			System.out.println("your score was 5000");
		}
		else{
			System.out.println("to nie jest 5000");
		}*/
	/*if(gameOver){
		int finalScore = score + (lvlCompleted * bonus);
		System.out.println(finalScore);
	}*/
// First way
	/*int scndScore = 10000;
	int scndLvlCom = 8;
	int bonus2 = 200;

		if(gameOver){
			int finalScore = scndScore + (scndLvlCom * bonus2);
			System.out.println(finalScore);
		}*/
// Snd way
		/* gameOver = true;
		 score =5000;
		lvlCompleted = 5;
		 bonus = 100;
		if(gameOver){
			int finalScore = score + (lvlCompleted * bonus);
			System.out.println(finalScore);
		}*/
    }


    public static int CalcScore(boolean gameOver, int scndScore,int scndLvlCom, int bonus2){

		if(gameOver){
			int finalScore = scndScore + (scndLvlCom * bonus2);
			return finalScore;
		}
		else{
		return -1;
		}
	}
	//Zadanko
	public static void  displayHighScorePostion(String playerName, int postion){
		System.out.println(playerName + " managed to get into position : "
				+ postion + " on the high score table!");
	}
	public static int calculateHighScorePosition(int playerScore){
    	if(playerScore>=1000){
    		return  1;
		} else if(playerScore >= 500){
    		return 2;
		} else if(playerScore >= 100){
    		return 3;
		}
    		return 4;
	}
	public static int calculateHighScorePosition2(int playerScore){
    	int postion = 4;
		if(playerScore>=1000){
			postion = 1;
		} else if(playerScore >= 500){
			postion = 2;
		} else if(playerScore >= 100){
			postion = 3;
		}
		return postion;
	}

}
