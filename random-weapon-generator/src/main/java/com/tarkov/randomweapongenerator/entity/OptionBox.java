package com.tarkov.randomweapongenerator.entity;


// 총기 부품 생성 옵션 박스 내 체크 박스 상태 저장 클래스
public class OptionBox{
    
    
}
// 총기 부품 생성 옵션 박스 내 체크 박스 상태 저장 클래스
class Option{
    private boolean operability;
    private boolean noScope;
    private boolean noStock;
    private boolean noMagezine;
    private boolean noHandguard;
    private boolean noForegrip;
    private boolean noPistolgrip;
    private boolean noBullet;

    protected Option(boolean operability, boolean noScope, boolean noStock, boolean noMagezine, boolean noHandguard, boolean noForegrip, boolean noPistolgrip, boolean noBullet ){
        this.operability=operability;
        this.noScope=noScope;
        this.noStock=noStock;
        this.noMagezine=noMagezine;
        this.noHandguard=noHandguard;
        this.noForegrip=noForegrip;
        this.noPistolgrip=noPistolgrip;
        this.noBullet=noBullet;
    }

    protected boolean[] getOptionStates(){
        return new boolean[] {operability, noScope, noStock, noMagezine, noHandguard, noForegrip, noPistolgrip, noBullet};
    }


}