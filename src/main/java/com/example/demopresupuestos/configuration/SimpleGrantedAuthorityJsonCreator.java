package com.example.demopresupuestos.configuration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * It's created for aunthenticationManager search the roles, don't search for the name 'role'
 * that we used in our entity, else if for the name 'authority'
 */
public abstract class SimpleGrantedAuthorityJsonCreator {

    @JsonCreator
    public SimpleGrantedAuthorityJsonCreator(@JsonProperty("authority") String role) {}
}
