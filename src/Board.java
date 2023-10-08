public class Board {
	char screen[][] = new char[15][50];

	 Food f;
	SnakeBody body;

	public void setF(Food f) {
		this.f = f;
	}

	public void setBody(SnakeBody body) {
		this.body = body;
	}


	public void BoardPrinting(){
		InitializeScreen();
		f.GenerateFood();
		body.BodyInitilaize();
		DisplayScreen();
	}

	public void InitializeScreen() {
		for (int i = 0; i < 15; i++) {

			for (int j = 0; j < 50; j++) {
				screen[i][j] = ' ';
			}

		}
		for (int i = 0; i < 15; i++) {
			screen[i][0] = '|';
			screen[i][49] = '|';
		}

		for (int j = 0; j < 50; j++) {
			screen[0][j] = '-';
			screen[14][j] = '_';

		}
	}

		public void DisplayScreen(){
			for (int i = 0; i < 15; i++) {

				for (int j = 0; j < 50; j++) {

					System.out.print(screen[i][j]);
				}

				System.out.println();
			}
		}

}
