import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		System.out.println("1. Crear post");
		System.out.println("2. Borrar post");
		System.out.println("3. Ver post");
		System.out.println("4. Ver todos los posts");
		System.out.println("5. Salir");
		System.out.print("¿Qué desea hacer?(1-5): ");
		String option = scanner.nextLine();

		do {			
			switch (option) {
			case "1":
				System.out.print("Introduce un titulo para crear un post: ");
				String title = scanner.nextLine();
				System.out.print("Introduce un autor: ");
				String author = scanner.nextLine();
				System.out.print("Introduce una fecha: ");
				String date = scanner.nextLine();
				Post post;
				Blog blog = new Blog();
				blog.addPost(post = new Post(author, title, date));
				break;
			case "2":
				System.out.println("Introduce un post para borrar");
				title = scanner.nextLine();
				blog.removePost(title);
				break;
			case "3":
				System.out.println("Introduce un post para verlo");
				String string = scanner.nextLine();
				number = Integer.parseInt(string);
				System.out.println(blog.showPost(number));
				break;
			case "4":
				System.out.println(blog.showAll());
				break;
			default:
				break;
			}
		} while (!option.equals("4"));
	}
}
