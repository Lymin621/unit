package kr.co.unit.di;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Device{
    @Override
    public void powerOn(){
        System.out.println("Sony스피커 전원 켬");
    }
    @Override
    public void powerOff(){
        System.out.println("Sony스피커 전원 끔");
    }
    @Override
    public void volumeUp(){
        System.out.println("Sony스피커 볼륨 올리기");
    }
    @Override
    public void volumeDown(){
        System.out.println("Sony스피커 볼륨 내리기");
    }
}
