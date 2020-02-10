package net.runelite.client.plugins.customboar;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "Boar's Custom Plugins",
	description = "Boar's Custom Plugins",
	tags = {"boar","custom","overlay"},
	type = PluginType.UTILITY
)
public class CustomBoarPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private CustomBoarOverlay overlay;

	@Provides
	CustomBoarConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(CustomBoarConfig.class);
	}

	@Override
	protected void startUp()
	{
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
	}
}
