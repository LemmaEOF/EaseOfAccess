package gay.lemmaeof.easeofaccess;

import net.minecraft.client.Option;
import net.minecraftforge.eventbus.api.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOptionsEvent extends Event {
	private final List<Option> options = new ArrayList<>();

	public void addOptions(Option... options) {
		this.options.addAll(Arrays.asList(options));
	}

	public void addOptions(List<Option> options) {
		this.options.addAll(options);
	}

	public List<Option> getOptions() {
		return options;
	}
}
