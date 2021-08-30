import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) throws Exception {
		MessageSync synchronizedMessage = new MessageSync();
		Thread read = new ReadThread(synchronizedMessage);
		System.out.println("Starting read thread:");
		read.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new message to add to the existing default message: ");
		Thread write = new WriteThread(synchronizedMessage, sc.nextLine());
		System.out.println("Starting write thread:");
		write.start();
		sc.close();
	}
}