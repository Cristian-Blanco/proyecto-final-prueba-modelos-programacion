package singleton;

public class StartInstance {
	private static StartInstance start;
	private StartInstance() {}
	public static StartInstance getInstance() {
		if(start==null) {
			start=new StartInstance();
		}
		return start;
	}

}
