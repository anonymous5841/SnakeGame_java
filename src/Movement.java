public class Movement {
	private int h1;
	private int h2;

	Board B1;

	public int getH1() {
		return h1;
	}

	public int getH2() {
		return h2;
	}

	public Movement(Board b1) {
		B1 = b1;
	}

	public void Choice(char c1){

		h1 = B1.body.snake_x[0];
		h2 =  B1.body.snake_y[0];

		switch (c1){
			case 'A':
			case 'a':
			{
				--h2;
				break;
			}

			case 'W':
			case 'w':
			{

				--h1;
				break;
			}


			case 'D':
			case 'd':
			{
				++h2;
				break;
			}

			case 'S':
			case 's':
			{
				++h1;
				break;
			}

		}
	}
}
