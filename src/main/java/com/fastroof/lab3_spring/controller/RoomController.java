package com.fastroof.lab3_spring.controller;

import com.fastroof.lab3_spring.entity.Room;
import com.fastroof.lab3_spring.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/room/new")
    public String createNewRoom(Model model) {
        Room room = new Room();
        model.addAttribute("room", room);
        return "thymeleaf/room/new";
    }

    @PostMapping("/room/new")
    public String submitNewRoom(@ModelAttribute Room room) {
        roomService.submitNewRoom(room);
        return "redirect:../";
    }

    @GetMapping("/room/edit")
    public String editRoom(Model model, @RequestParam Long id) {
        model.addAttribute("room", roomService.getRoomById(id));
        return "thymeleaf/room/edit";
    }

    @PostMapping("/room/edit")
    public String submitEditedRoom(@ModelAttribute Room room, @RequestParam Long id) {
        roomService.submitEditedRoom(room, id);
        return "redirect:../";
    }

    @GetMapping("/room/delete")
    public String deleteRoom(@RequestParam Long id) {
        roomService.deleteRoom(id);
        return "redirect:../";
    }
}
