package io.github.jhipster.config.apidoc;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static io.github.jhipster.config.JHipsterConstants.SPRING_PROFILE_SWAGGER;

@Configuration
@Profile(SPRING_PROFILE_SWAGGER)
@AutoConfigureBefore(SwaggerAutoConfiguration.class)
public class SwaggerProfileConfiguration {
}
