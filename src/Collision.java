public class Collision {

	SnakeBody s1;

	PlayGame p1;


	public Collision(SnakeBody s1, PlayGame p1) {
		this.s1 = s1;
		this.p1 = p1;
	}

	public void SelfAndWallCollision(){
		for (int i = 1; i < 8; i++) {

			if(s1.snake_x[0] == s1.snake_x[i] && s1.snake_y[0] == s1.snake_y[i]){
				p1.setFlag(1);
			}
		}

		if (s1.snake_x[0] ==  0 || s1.snake_x[0] == 14 || s1.snake_y[0] == 49 || s1.snake_y[0] == 0)
		{
			p1.setFlag(1);
		}
	}

}
