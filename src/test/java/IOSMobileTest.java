import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IOSMobileTest {

    @Test
    public void testIphone (){
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone Last");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }
}
