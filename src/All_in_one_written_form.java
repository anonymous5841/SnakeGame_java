public class All_in_one_written_form {

//		char screen[][] = new char[15][50];
//		int snake_x[] = new int[8];
//		int snake_y[] = new int[8];

//		int head_x = 12, head_y = 33, tail_x = 12, tail_y = 40, h1 , h2, food_x , food_y, score = 0;
//		int flag = 0 , s =2;
//		Random r = new Random();

//		for (int i = 0; i < 15; i++) {
//
//			for (int j = 0; j < 50; j++) {
//				screen[i][j] = ' ';
//			}
//
//		}
//		for (int i = 0; i < 15; i++) {
//			screen[i][0] = '|';
//			screen[i][49] = '|';
//		}
//
//		for (int j = 0; j < 50; j++) {
//			screen[0][j] = '-';
//			screen[14][j] = '_';
//
//		}
//		food_x = r.nextInt(1,13);
//		food_y = r.nextInt(1,48);
//		screen[food_x][food_y] = '*';

//		for (int i = 0; i < 8; i++) {
//			snake_x[i] = head_x;
//			snake_y[i] = head_y + i;
//			screen[snake_x[i]][snake_y[i]] = 's';
//		}

//		for (int i = 0; i < 15; i++) {
//
//			for (int j = 0; j < 50; j++) {
//
//				System.out.print(screen[i][j]);
//			}
//
//			System.out.println();
//		}

//		while (s == 2) {


//		Scanner sc = new Scanner(System.in);
//		char move = sc.next().charAt(0);

//		h1 = snake_x[0];
//		h2 = snake_y[0];

//		switch (move){
//			case 'A':
//			case 'a':
//			{
//				--h2;
//				break;
//			}
//
//			case 'W':
//			case 'w':
//			{
//
//				--h1;
//				break;
//				}
//
//
//			case 'D':
//			case 'd':
//			{
//				++h2;
//				break;
//			}
//
//			case 'S':
//			case 's':
//			{
//				++h1;
//				break;
//			}
//
//		}


//			for (int i = 7; i > 0; i--) {
//				snake_x[i] = snake_x[i - 1];
//				snake_y[i] = snake_y[i - 1];
//			}

//			snake_x[0] = h1;
//			snake_y[0] = h2;


	//self collision detection
//			for (int i = 1; i < 8; i++) {
//
//				if(snake_x[0] == snake_x[i] && snake_y[0] == snake_y[i]){
//					flag = 1;
//				}
//			}

	//Wall collision detection
//			if (snake_x[0] ==  0 || snake_x[0] == 14 || snake_y[0] == 49 || snake_y[0] == 0)
//			{
//				flag = 1;
//			}

	//food
//			if (snake_x[0] == food_x && snake_y[0] == food_y){
//				food_x = r.nextInt(1,13);
//				food_y = r.nextInt(1,48);
//				score++;
//			}


//			for (int i = 0; i < 15; i++) {
//
//				for (int j = 0; j < 50; j++) {
//					screen[i][j] = ' ';
//				}
//
//			}
//			for (int i = 0; i < 15; i++) {
//				screen[i][0] = '|';
//				screen[i][49] = '|';
//			}
//
//			for (int j = 0; j < 50; j++) {
//				screen[0][j] = '-';
//				screen[14][j] = '_';
//
//			}

//			for (int i = 0; i < 8; i++) {
//				screen[snake_x[i]][snake_y[i]] = 's';
//			}

//				screen[food_x][food_y] = '*';


//		for (int i = 0; i < 15; i++) {
//
//			for (int j = 0; j < 50; j++) {
//
//				System.out.print(screen[i][j]);
//			}
//
//			System.out.println();
//		}


//			if(flag == 1){
//				System.out.println("you have lost the game!");
//				System.out.println(score);
//				break;
//			}
//		}



//		for (int i = 0; i < 15; i++) {
//
//			for (int j = 0; j < 70; j++) {
//				screen[i][j] = ' ';
//			}
//         System.out.println();
//		}

//		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

}
