package gay.lemmaeof.easeofaccess;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.client.Option;

import java.util.ArrayList;
import java.util.List;

public interface AddOptionsCallback {
	Event<AddOptionsCallback> EVENT = EventFactory.createArrayBacked(AddOptionsCallback.class, callbacks -> () -> {
		List<Option> ret = new ArrayList<>();
		for (AddOptionsCallback callback : callbacks) {
			ret.addAll(callback.getAccessibilityOptions());
		}
		return ret;
	});

	/**
	 * Fired when the {@link net.minecraft.client.gui.screens.AccessibilityOptionsScreen} is constructed.
	 * @return A list of options to add to the accessibility options screen.
	 */
	List<Option> getAccessibilityOptions();
}
