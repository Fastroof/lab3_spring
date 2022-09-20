package com.fastroof.lab3_spring.service;

import com.fastroof.lab3_spring.entity.Room;
import com.fastroof.lab3_spring.entity.RoomConfiguration;
import com.fastroof.lab3_spring.repository.RoomConfigurationRepository;
import com.fastroof.lab3_spring.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    private final RoomRepository fakeRoomRepository;
    private final RoomConfigurationRepository fakeRoomConfigurationRepository;

    @Autowired
    public SearchServiceImpl(RoomRepository fakeRoomRepository, RoomConfigurationRepository fakeRoomConfigurationRepository) {
        this.fakeRoomRepository = fakeRoomRepository;
        this.fakeRoomConfigurationRepository = fakeRoomConfigurationRepository;
    }

    public String getSearchRequestAnswer(Double area, Integer bedroomCount, Integer price) {
        List<Room> rooms = new ArrayList<>();
        for (RoomConfiguration roomConfiguration :
                fakeRoomConfigurationRepository.findAllByAreaAndBedroomCountAndPrice(area, bedroomCount, price)
        ){
            rooms.add(fakeRoomRepository.findByRoomConfiguration(roomConfiguration));
        }
        return rooms.toString();
    }
}
