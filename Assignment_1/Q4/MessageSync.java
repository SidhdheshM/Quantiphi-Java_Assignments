public class MessageSync {
	private String message = "";

	public MessageSync() {
		if (message.isEmpty()) {
			this.message = "This is a default message";
		}
	}

	public synchronized String read() {
		return message;
	}

	public synchronized String write(String newMessage) throws Exception {
		if (newMessage.isEmpty()) {
			throw new Exception("Message cannot be empty!");
		}
		this.message = newMessage;
		return this.message;
	}
}

class ReadThread extends Thread {
	private MessageSync t;

	ReadThread(MessageSync t) {
		this.t = t;
	}

	public void run() {
		System.out.println(t.read());
	}

}

class WriteThread extends Thread {
	private MessageSync t;
	private String message;

	WriteThread(MessageSync t, String message) {
		this.t = t;
		this.message = message;
	}

	public void run() {
		try {
			System.out.println(t.write(this.message));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}