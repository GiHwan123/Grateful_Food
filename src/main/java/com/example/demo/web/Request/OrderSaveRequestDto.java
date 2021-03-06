package com.example.demo.web.Request;

import com.example.demo.domain.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class OrderSaveRequestDto {
    private int stockQuantity;
    private DeliveryStatus status;
    private  Coupon coupon;
    private Member member;

    @Builder
    //값 등록이 필요없다.
    public OrderSaveRequestDto(int stockQuantity, DeliveryStatus status, Coupon coupon, Member member){
        this.coupon = coupon;
        this.stockQuantity = stockQuantity;
        this.status = status; //ready
        this.member = member;

    }


    //builder로 값을 전달해준다.
    public Order toEntity(){
        return Order.builder()
                .coupon(coupon)
                .stockQuantity(stockQuantity)
                .member(member)
                .build();
    }
}
