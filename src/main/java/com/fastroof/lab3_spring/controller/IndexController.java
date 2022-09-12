package com.fastroof.lab3_spring.controller;

import com.fastroof.lab3_spring.repository.OrderRepository;
import com.fastroof.lab3_spring.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private RoomRepository fakeRoomRepository;

    @Autowired
    private OrderRepository fakeOrderRepository;

    @GetMapping("/")
    public String showIndexPage(ModelMap model) {
        model.addAttribute("rooms", fakeRoomRepository.getRooms());
        return "thymeleaf/index";
    }

    @GetMapping("/orders")
    public String showOrdersPage(ModelMap model) {
        model.addAttribute("orders", fakeOrderRepository.getOrders());
        return "thymeleaf/orders";
    }
}
