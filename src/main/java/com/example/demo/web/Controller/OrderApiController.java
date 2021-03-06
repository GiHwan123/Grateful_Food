package com.example.demo.web.Controller;

import com.example.demo.domain.*;
import com.example.demo.service.OrderService;
import com.example.demo.web.Request.OrderSaveRequestDto;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderApiController {
    private final OrderService orderService;



    @PostMapping("/guest/order") //주문정보저장
    public Long save(@RequestBody OrderSaveRequestDto requestDto){
        return orderService.order(requestDto);
    }

//
//    //cancle 을 어떻게 처리해줄가?
//    @PostMapping("/api/Order/Cancle") // 취소
//    public void Cancle(@RequestBody Order order){
//        orderService.cancelOrder(order.getId());
//    }

}

/**
 *
 * Food class 맴버와 연관관계 x
 *
 */