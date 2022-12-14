package com.fastroof.lab3_spring.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoomDescription {
    private String description;
    private String address;
    private Date creationDate;
}
