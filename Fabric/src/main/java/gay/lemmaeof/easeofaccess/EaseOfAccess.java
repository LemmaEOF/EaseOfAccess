package gay.lemmaeof.easeofaccess;

import gay.lemmaeof.easeofaccess.impl.ExtraAccessibilityOptions;
import net.fabricmc.api.ClientModInitializer;

import java.util.List;

public class EaseOfAccess implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		AddOptionsCallback.EVENT.register(() -> List.of(ExtraAccessibilityOptions.REDUCE_MOTION));
	}
}
