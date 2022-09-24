package com.fastroof.lab3_spring.service;

import com.fastroof.lab3_spring.entity.Room;
import com.fastroof.lab3_spring.repository.RoomRepository;
import com.fastroof.lab3_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository fakeRoomRepository;
    private final UserRepository fakeUserRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository fakeRoomRepository, UserRepository fakeUserRepository) {
        this.fakeRoomRepository = fakeRoomRepository;
        this.fakeUserRepository = fakeUserRepository;
    }

    public void submitNewRoom(Room room) {
        room.setUser(fakeUserRepository.getUsers().get(0));
        room.getDescription().setCreationDate(new Date());
        List<Room> roomList = fakeRoomRepository.getRooms();
        room.setId(roomList.get(roomList.size() - 1).getId() + 1);
        fakeRoomRepository.getRooms().add(room);
    }

    public Room getRoomById(Long id) {
        return fakeRoomRepository.findById(id);
    }

    public void submitEditedRoom(Room room, Long id) {
        int index = fakeRoomRepository.getRooms().indexOf(fakeRoomRepository.findById(id));
        fakeRoomRepository.getRooms().set(index, room);
    }

    public void deleteRoom(Long id) {
        fakeRoomRepository.getRooms().remove(fakeRoomRepository.findById(id));
    }
}
