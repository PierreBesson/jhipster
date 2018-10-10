package io.github.jhipster.config.info;

import io.github.jhipster.config.JHipsterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

/**
 * An {@link InfoContributor} that tells if mail service is enabled.
 *
 */
public class SwaggerEnabledInfoContributor implements InfoContributor {

    private static final String SWAGGER_ENABLED = "swaggerEnabled";

    @Autowired
    private JHipsterProperties jHipsterProperties;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail(SWAGGER_ENABLED, jHipsterProperties.getSwagger().isEnabled());
    }
}
