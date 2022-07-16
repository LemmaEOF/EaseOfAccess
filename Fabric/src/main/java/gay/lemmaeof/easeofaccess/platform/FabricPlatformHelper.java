package gay.lemmaeof.easeofaccess.platform;

import gay.lemmaeof.easeofaccess.platform.services.IPlatformHelper;
import gay.lemmaeof.easeofaccess.AddOptionsCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Option;

import java.util.List;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public List<Option> fireOptionEvent() {
        return AddOptionsCallback.EVENT.invoker().getAccessibilityOptions();
    }
}
