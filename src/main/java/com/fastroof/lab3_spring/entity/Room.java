package com.fastroof.lab3_spring.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Room {
    private Long id;
    private RoomConfiguration configuration;
    private RoomDescription description;
    private User user;
}
