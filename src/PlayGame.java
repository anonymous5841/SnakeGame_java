import java.io.IOException;
import java.util.Scanner;

public class PlayGame  {
	private char move;
	private int flag = 0;
	private int score = 0;
	private final int s = 2;
	Board B;
	Movement m0;
	Collision c;

	public void setB(Board b) {
		B = b;
	}

	public void setM0(Movement m0) {
		this.m0 = m0;
	}

	public void setC(Collision c) {
		this.c = c;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void PlayGame1() throws InterruptedException, IOException {


		while(s == 2){

		Scanner sc = new Scanner(System.in);
		 move = sc.next().charAt(0);

		 m0.Choice(move);

		 B.body.MovingSegments();

			 B.body.snake_x[0] = m0.getH1();
			 B.body.snake_y[0] = m0.getH2();

			 c.SelfAndWallCollision();
			 B.f.ChangeFoodPosition();
			 B.InitializeScreen();
			 B.body.ReDeclaringSnake();
			 B.screen[B.f.getFood_x()][B.f.getFood_y()] = '*';
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			 B.DisplayScreen();
			if(flag == 1){
				System.out.println("you have lost the game due to collision!");
				System.out.println("Score:"+ score);
				System.out.println("Now try running it in cmd you will get a surprise ;) ");
				break;
			}

		}
	}


}
