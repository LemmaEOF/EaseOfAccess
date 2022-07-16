package gay.lemmaeof.easeofaccess.platform;

import gay.lemmaeof.easeofaccess.AddOptionsEvent;
import gay.lemmaeof.easeofaccess.EaseOfAccess;
import gay.lemmaeof.easeofaccess.platform.services.IPlatformHelper;
import net.minecraft.client.Option;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

import java.util.List;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public List<Option> fireOptionEvent() {
        AddOptionsEvent ev = new AddOptionsEvent();
        MinecraftForge.EVENT_BUS.post(ev);
        return ev.getOptions();
    }
}
