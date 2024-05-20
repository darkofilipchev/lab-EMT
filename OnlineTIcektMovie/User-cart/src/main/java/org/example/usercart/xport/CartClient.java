package org.example.usercart.xport;

import org.example.movies.domain.models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.List;

@Service
public class CartClient {

    private final RestTemplate restTemplate;
    private final String serverUrl;

    public CartClient(@Value("${app.Movies.url}") String serverUrl) {
        this.serverUrl = serverUrl;
        this.restTemplate = new RestTemplate();
        var requestFactory = new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }

    private UriComponentsBuilder uri(){
        return UriComponentsBuilder.fromHttpUrl(this.serverUrl);
    }

    private List<Movie> findAll(){
        try{
            return restTemplate.exchange(uri().path("/api/movies").build().toUri(), HttpMethod.GET,null, new ParameterizedTypeReference<List<Movie>>(){
            }).getBody();
        } catch (Exception e){
            return Collections.emptyList();
        }
    }

}
