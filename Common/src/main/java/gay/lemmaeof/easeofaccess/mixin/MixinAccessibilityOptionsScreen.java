package gay.lemmaeof.easeofaccess.mixin;

import gay.lemmaeof.easeofaccess.platform.Services;
import net.minecraft.client.Option;
import net.minecraft.client.gui.screens.AccessibilityOptionsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.Arrays;
import java.util.List;

@Mixin(AccessibilityOptionsScreen.class)
public class MixinAccessibilityOptionsScreen {
	@ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/SimpleOptionsSubScreen;<init>(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/Options;Lnet/minecraft/network/chat/Component;[Lnet/minecraft/client/Option;)V"), index = 3)
	private static Option[] addExtraOptions(Option[] original) {
		List<Option> ret = Arrays.asList(original);
		ret.addAll(Services.PLATFORM.fireOptionEvent());
		return ret.toArray(new Option[]{});
	}

}
