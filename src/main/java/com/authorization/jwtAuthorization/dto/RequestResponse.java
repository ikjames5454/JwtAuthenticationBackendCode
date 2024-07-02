package com.authorization.jwtAuthorization.dto;

import com.authorization.jwtAuthorization.entity.Users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestResponse {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String email;
    private String country;
    private String state;
    private String role = "USER";
    private String password;
    private Long count;
    private Users users;
    private List<Users> usersList;
    private List<CountryUserCount> countryUserCount;
}
