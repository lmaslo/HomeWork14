import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {

    Path props = Paths.get("/tmp/auth.properties");

    @BeforeEach
    public void clearFile() throws Exception {
        Files.deleteIfExists(props);
    }

    @Test
    public void testLocalFile(){
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("lmaslo");
        assertThat(config.password()).isEqualTo("123456");
    }

    @Test
    public void testRemoteFile() throws Exception {
        String content = "username=lmaslo1\npassword=1234567";


        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());


        assertThat(config.username()).isEqualTo("lmaslo1");
        assertThat(config.password()).isEqualTo("1234567");
    }
}
