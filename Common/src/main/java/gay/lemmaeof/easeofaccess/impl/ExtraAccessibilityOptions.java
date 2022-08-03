package gay.lemmaeof.easeofaccess.impl;

import gay.lemmaeof.easeofaccess.api.ExtraAccessibility;
import net.minecraft.client.CycleOption;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

public final class ExtraAccessibilityOptions {

	private static final Component ACCESSIBILITY_TOOLTIP_REDUCE_MOTION = new TranslatableComponent("options.accessibility.reduce_motion.tooltip");
	public static final CycleOption<Boolean> REDUCE_MOTION = CycleOption.createOnOff(
			"options.accessibility.reduce_motion",
			ACCESSIBILITY_TOOLTIP_REDUCE_MOTION,
			options -> ExtraAccessibility.reduceMotion(),
			(options, option, value) -> ExtraAccessibilityImpl.INSTANCE.setReduceMotion(value)
	);

}
