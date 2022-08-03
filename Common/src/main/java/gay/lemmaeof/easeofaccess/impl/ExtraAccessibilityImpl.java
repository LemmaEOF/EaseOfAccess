package gay.lemmaeof.easeofaccess.impl;

public class ExtraAccessibilityImpl {
	public static final ExtraAccessibilityImpl INSTANCE = new ExtraAccessibilityImpl();

	private boolean reduceMotion = false;

	public boolean reduceMotion() {
		return reduceMotion;
	}

	public void setReduceMotion(boolean value) {
		this.reduceMotion = value;
	}
}
