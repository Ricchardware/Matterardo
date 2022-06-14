package com.almaviva;

import com.swagger.client.codgen.rest.api.PersonControllerApi;
import com.swagger.client.codgen.rest.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlmavivaCustomSwaggerBufferApplicationConfiguration {

    @Value ( "${person.host.uri}")
    private String host;

    @Bean
    public ApiClient apiClient () {

        return new ApiClient().setBasePath(host);
    }

    @Bean
    public PersonControllerApi personControllerApi () {

        return new PersonControllerApi(apiClient());
    }
}
