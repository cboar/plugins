package net.runelite.client.plugins.customboar;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Units;

@ConfigGroup("customboar")
public interface CustomBoarConfig extends Config {

	@ConfigItem(
		position = 0,
		keyName = "volume",
		name = "Volume",
		description = "Alert volume"
	)
	@Units(Units.PERCENT)
	default int volume()
	{
		return 75;
	}

}
