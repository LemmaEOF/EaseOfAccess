package gay.lemmaeof.easeofaccess.impl;

import gay.lemmaeof.easeofaccess.api.ExtraAccessibility;
import net.minecraft.client.CycleOption;

public final class ExtraAccessibilityOptions {

	public static final CycleOption<Boolean> REDUCE_MOTION = CycleOption.createOnOff(
			"options.accessibility.reduce_motion",
			options -> ExtraAccessibility.reduceMotion(),
			(options, option, value) -> ExtraAccessibilityImpl.INSTANCE.setReduceMotion(value)
	);

}
