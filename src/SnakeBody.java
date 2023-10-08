public class SnakeBody {
	int snake_x[] = new int[8];
	int snake_y[] = new int[8];

	private int head_x = 12;
	private int head_y = 33;
	private int tail_x = 12;
	private int tail_y = 40;

	Board b;

	public SnakeBody(Board b) {
		this.b = b;
	}

	public void BodyInitilaize(){

		for (int i = 0; i < 8; i++) {
			snake_x[i] = head_x;
			snake_y[i] = head_y + i;
			b.screen[snake_x[i]][snake_y[i]] = 's';
		}
	}

	public void MovingSegments(){
		for (int i = 7; i > 0; i--) {
			snake_x[i] = snake_x[i - 1];
			snake_y[i] = snake_y[i - 1];
		}
	}

	public void ReDeclaringSnake(){

		for (int i = 0; i < 8; i++) {
			b.screen[snake_x[i]][snake_y[i]] = 's';
		}
	}

}
