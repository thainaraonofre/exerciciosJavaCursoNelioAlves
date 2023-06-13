package estruturaWhile;

public class TesteDeMesa {
	public static void main(String[] args) {

		int x, y, i;
		x = 4;
		y = 0;
		i = 0;
		while (i < x) {
			i = i + 1;
			y = y + i;
			System.out.print(i);
			System.out.println(y);
		}

	}

}