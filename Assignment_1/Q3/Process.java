public class Process implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread2(process) - START " + Thread.currentThread().getName());
		try {
			// Get database connection, delete unused data from DB
			fetchData();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread2(process) - END " + Thread.currentThread().getName());
	}

	private void fetchData() throws InterruptedException {
		Thread.sleep(5000);
	}

}