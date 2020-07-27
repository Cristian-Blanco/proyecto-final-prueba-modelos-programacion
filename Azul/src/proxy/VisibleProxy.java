package proxy;

public class VisibleProxy implements IVisible{
	private Visible size;
	
	public VisibleProxy() {
		size = new Visible();
	}
	@Override
	public boolean isVisible(int ammount) {
		if(ammount>0 && ammount<5) {
			return size.isVisible(ammount);
		}else {
			return false;
		}
	}

}
