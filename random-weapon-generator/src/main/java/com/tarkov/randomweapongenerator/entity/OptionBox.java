package com.tarkov.randomweapongenerator.entity;
import java.util.Arrays;

import com.tarkov.randomweapongenerator.entity.OptionIds;

// 총기 부품 생성 옵션 박스 내 체크 박스 상태 저장 클래스
public class OptionBox extends Option{
    
    public OptionBox(){
        super(true,true,true,true,true,true,true,true);
        super.setOptionStateById(OptionIds.OPERABILITY, false);
        System.out.println(Arrays.toString(super.getOptionStates()));
    }
    
}



// 총기 부품 생성 옵션 박스 내 체크 박스 상태 저장 클래스
class Option{
    private boolean operability;
    private boolean noScope;
    private boolean noStock;
    private boolean noMagazine;
    private boolean noHandguard;
    private boolean noForegrip;
    private boolean noPistolgrip;
    private boolean noBullet;


    // 옵션 박스 내 옵션 체크박스 상태 값 저장 생성자
    // 모든 옵션 상태값을 입력 받아야함.
    // boolean 값만 허용
    protected Option(boolean operability, boolean noScope, boolean noStock, boolean noMagazine, boolean noHandguard, boolean noForegrip, boolean noPistolgrip, boolean noBullet ){
        this.operability=operability;
        this.noScope=noScope;
        this.noStock=noStock;
        this.noMagazine=noMagazine;
        this.noHandguard=noHandguard;
        this.noForegrip=noForegrip;
        this.noPistolgrip=noPistolgrip;
        this.noBullet=noBullet;
    }


    // 모든 옵션 값을 리턴하는 함수
    protected boolean[] getOptionStates(){
        return new boolean[] {operability, noScope, noStock, noMagazine, noHandguard, noForegrip, noPistolgrip, noBullet};
    }


    // 옵션 값을 id로 취급하여
    protected void setOptionStateById(OptionIds optionId,boolean state){
        

        switch(optionId){
            case OPERABILITY:
                operability=state;
                break;
            case NoSCOPE:
                noScope=state;
                break;
            case NoSTOCK:
                noStock=state;
                break;
            case NoMAGAZINE:
                noMagazine=state;
                break;
            case NoHANDGUARD:
                noHandguard=state;
                break;
            case NoFOREGRIP:
                noForegrip=state;
                break;
            case NoPISTOLGRIP:
                noPistolgrip=state;
                break;
            case NoBULLET:
                noBullet=state;
                break;
        }
    }
}