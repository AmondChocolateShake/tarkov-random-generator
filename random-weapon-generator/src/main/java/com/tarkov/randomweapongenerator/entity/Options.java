package com.tarkov.randomweapongenerator.entity;

public class Options {
    private boolean operability;
    private boolean noScope;
    private boolean noStock;
    private boolean noMagazine;
    private boolean noHandguard;
    private boolean noForegrip;
    private boolean noPistolgrip;
    private boolean noBullet;
    private boolean random;


    // 옵션 박스 내 옵션 체크박스 상태 값 저장 생성자
    // 모든 옵션 상태값을 입력 받아야함.
    // boolean 값만 허용
    protected Options(boolean operability, boolean noScope, boolean noStock, boolean noMagazine, boolean noHandguard, boolean noForegrip, boolean noPistolgrip, boolean noBullet, boolean random){
        this.operability=operability;
        this.noScope=noScope;
        this.noStock=noStock;
        this.noMagazine=noMagazine;
        this.noHandguard=noHandguard;
        this.noForegrip=noForegrip;
        this.noPistolgrip=noPistolgrip;
        this.noBullet=noBullet;
        this.random=random;
    }

    public boolean isRandom(){
        if(random){
            return true;
        }else{
            return false;
        }
    }

    // 모든 옵션 값을 리턴하는 함수
    protected boolean[] getOptionStates(){
        return new boolean[] {operability, noScope, noStock, noMagazine, noHandguard, noForegrip, noPistolgrip, noBullet, random};
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
            case RANDOM:
                random=state;
        }
    }
}
