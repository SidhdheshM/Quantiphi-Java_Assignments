public class Q3{
    public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Fetch("FetchData");
		System.out.println("Starting Fetch threads");
		t1.start();
		Thread.sleep(10000);
		System.out.println("Runnable Threads has been started");
		Thread t2 = new Thread(new Process(), ("ProcessData"));
		System.out.println("Starting Process Threads");
		t2.start();
	}
}