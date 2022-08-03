package gay.lemmaeof.easeofaccess.api;

import gay.lemmaeof.easeofaccess.impl.ExtraAccessibilityImpl;

public final class ExtraAccessibility {

	public static boolean reduceMotion() {
		return impl().reduceMotion();
	}

	private static ExtraAccessibilityImpl impl() {
		return ExtraAccessibilityImpl.INSTANCE;
	}
}
