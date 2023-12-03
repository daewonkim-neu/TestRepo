package com.example.INFO5100FinalProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Pet {

    @NonNull
    private final UUID id;
    @NonNull
    private final String name;
    @NonNull
    private final String breed;
    @NonNull
    private final double weight;
    @NonNull
    @JsonFormat(pattern="yyyy-MM-dd")
    private final Date dob;
    @NonNull
    private final String detail;
    @NonNull
    private final String userName;

    public Pet(@JsonProperty("id") UUID id,
               @JsonProperty("name") String name,
               @JsonProperty("breed") String breed,
               @JsonProperty("weight") Double weight,
               @JsonProperty("dob") Date dob,
               @JsonProperty("detail") String detail,
               @JsonProperty("userName") String userName) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.dob = dob;
        this.detail = detail;
        this.userName = userName;
    }
}
