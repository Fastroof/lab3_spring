package com.fastroof.lab3_spring.repository;

import com.fastroof.lab3_spring.entity.RoomDescription;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDescriptionRepository {
    List<RoomDescription> getRoomDescriptions();
}
