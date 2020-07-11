package com.example.springboot1.controller;

import com.example.springboot1.entity.CourierStation;
import com.example.springboot1.entity.Member;
import com.example.springboot1.entity.Poster;
import com.example.springboot1.entity.Sender;
import com.example.springboot1.respons.ICourierStationRepository;
import com.example.springboot1.respons.IMemberRepository;
import com.example.springboot1.respons.IPosterRepository;
import com.example.springboot1.respons.ISenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/register/")
@Transactional
public class RegisterController {
    @Autowired
    ICourierStationRepository iCourierStationRepository;
    @Autowired
    IMemberRepository iMemberRepository;
    @Autowired
    IPosterRepository iPosterRepository;
    @Autowired
    ISenderRepository iSenderRepository;

    @PostMapping("/courier")//快递站注册
    public Map register(@RequestBody CourierStation courierStation){
        iCourierStationRepository.save(courierStation);
        iCourierStationRepository.refresh(courierStation);
        return Map.of("账号",courierStation.getUsername());
    }
    @PostMapping("/member")//会员注册
    public Map register(@RequestBody Member member){
        iMemberRepository.save(member);
        iMemberRepository.refresh(member);
        return Map.of("账号",member.getUsername());
    }
    @PostMapping("/poster")//快递员注册
    public Map register(@RequestBody Poster poster){
        iPosterRepository.save(poster);
        iPosterRepository.refresh(poster);
        return Map.of("账号",poster.getUsername());
    }
    @PostMapping("/sender")//分销商注册
    public Map register(@RequestBody Sender sender){
        iSenderRepository.save(sender);
        iSenderRepository.refresh(sender);
        return Map.of("账号",sender.getUsername());
    }
}
