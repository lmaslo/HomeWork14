import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTest {


    @Test
    public void testIphone() {
        System.setProperty("device", "iphone");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone Last");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }

    @Test
    public void testPixel() {
        System.setProperty("device", "pixel");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Google Pixel");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");
    }
}
