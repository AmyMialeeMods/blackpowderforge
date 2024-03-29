package amymialee.blackpowder.client;

import amymialee.blackpowder.items.GunItem;
import amymialee.blackpowder.items.StartupCommon;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class StartupClient {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        //RenderingRegistry.registerEntityRenderingHandler(StartupCommon.bulletEntityType, BulletRenderer::new);
    }

    static {
        ItemModelsProperties.registerProperty(StartupCommon.flintlockItem, new ResourceLocation("charged"), (gun_flintlock_0, gun_flintlock_1, gun_flintlock_2)
                -> gun_flintlock_2 != null && GunItem.isCharged(gun_flintlock_0) ? 1.0F : 0.0F);
        ItemModelsProperties.registerProperty(StartupCommon.blunderbussItem, new ResourceLocation("charged"), (gun_blunderbuss_0, gun_blunderbuss_1, gun_blunderbuss_2)
                -> gun_blunderbuss_2 != null && GunItem.isCharged(gun_blunderbuss_0) ? 1.0F : 0.0F);
        ItemModelsProperties.registerProperty(StartupCommon.blunderbehemothItem, new ResourceLocation("charged"), (gun_blunderbehemoth_0, gun_blunderbehemoth_1, gun_blunderbehemoth_2)
                -> gun_blunderbehemoth_2 != null && GunItem.isCharged(gun_blunderbehemoth_0) ? 1.0F : 0.0F);
        ItemModelsProperties.registerProperty(StartupCommon.rifleItem, new ResourceLocation("charged"), (gun_rifle_0, gun_rifle_1, gun_rifle_2)
                -> gun_rifle_2 != null && GunItem.isCharged(gun_rifle_0) ? 1.0F : 0.0F);
        ItemModelsProperties.registerProperty(StartupCommon.musketItem, new ResourceLocation("charged"), (gun_musket_0, gun_musket_1, gun_musket_2)
                -> gun_musket_2 != null && GunItem.isCharged(gun_musket_0) ? 1.0F : 0.0F);
    }
}
