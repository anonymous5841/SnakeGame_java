import java.util.Random;

public class Food {

	private int food_x = 0;
	private int food_y = 0;
	private Board b1;
	private SnakeBody body2;
	private PlayGame p2;
	private int score1 = 0;

	public Food(Board b1, SnakeBody body2, PlayGame p2) {
		this.b1 = b1;
		this.body2 = body2;
		this.p2 = p2;
	}

	public int getFood_x() {
		return food_x;
	}

	public int getFood_y() {
		return food_y;
	}

	public void GenerateFood(){

		Random r = new Random();
		food_x = r.nextInt(1,13);
		food_y = r.nextInt(1,48);
		b1.screen[food_x][food_y] = '*';
	}

	public void ChangeFoodPosition(){
		Random r = new Random();
		if (body2.snake_x[0] == food_x && body2.snake_y[0] == food_y){
			food_x = r.nextInt(1,13);
			food_y = r.nextInt(1,48);
			score1 += 10;
			p2.setScore(score1);
		}
	}


}
