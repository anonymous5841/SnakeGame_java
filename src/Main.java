
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		Board board1 = new Board();

		SnakeBody s = new SnakeBody(board1);

		Movement m = new Movement(board1);

		PlayGame play = new PlayGame();

		Food f =new Food(board1,s,play);

		Collision c = new Collision(s,play);

		board1.setBody(s);
		board1.setF(f);
		play.setB(board1);
		play.setC(c);
		play.setM0(m);

		board1.BoardPrinting();
		play.PlayGame1();
	}
}