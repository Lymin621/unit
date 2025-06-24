package kr.co.unit.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("lg")
public class LgSpeaker implements Device{
    @Override
    public void powerOn(){
        System.out.println("LG스피커 전원 켬");
    }
    @Override
    public void powerOff(){
        System.out.println("LG스피커 전원 끔");
    }
    @Override
    public void volumeUp(){
        System.out.println("LG스피커 볼륨 올리기");
    }
    @Override
    public void volumeDown(){
        System.out.println("LG스피커 볼륨 내리기");
    }
}
