package com.berdaflex.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Set;

/**
 * Created by alexander_borohov on 26.9.16.
 */
@Component
public class RestClient {
/*    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    public Set<Object> getSet() {
        MultiValueMap params = new LinkedMultiValueMap();
        UriComponents uriComponents = UriComponentsBuilder
                .fromHttpUrl("#rest[baseUrl]")
                .pathSegment()
                .queryParams(params)
                .build();

        return restTemplate.getForObject(uriComponents.toUriString(), Set.class);

    }*/
}
