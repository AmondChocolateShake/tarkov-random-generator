package com.tarkov.randomweapongenerator.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;



//랜덤 총기 생성 관련 클래스
public class RandomWeapon {
    Random random=new Random();

    private boolean randomState;
    private String[] weaponIds={"5447a9cd4bdc2dbd208b4567","5448bd6b4bdc2dfc2f8b4569","54491c4f4bdc2db1078b4568","55801eed4bdc2d89578b4588","5580223e4bdc2d1c128b457f","5644bd2b4bdc2d3b4c8b4572","56d59856d2720bd8418b456a","56dee2bdd2720bc8328b4567","56e0598dd2720bb5668b45a6","571a12c42459771f627b58a0","574d967124597745970e7c94","576165642459773c7a400233","576a581d2459771e7b1bc4f1","57838ad32459774a17445cd2","579204f224597773d619e051","57c44b372459772d2b39b8ce","57d14d2524597714373db789","57dc2fa62459775949412633","57f3c6bd24597738e730fa2f","57f4c844245977379d5c14d1","583990e32459771419544dd2","5839a40f24597726f856b511","587e02ff24597743df3deaeb","588892092459774ac91d4b11","58948c8e86f77409493f7266","5926bb2186f7744b1c6c6e60","59984ab886f7743e98271174","59d6088586f774275f37482f","59e6152586f77473dc057aa1","59e6687d86f77411d949b251","59f98b4986f7746f546d2cef","59f9cabd86f7743a10721f46","59ff346386f77477562ff5e2","5a0ec13bfcdbcb00165aa685","5a17f98cfcdbcb0980087290","5a367e5dc4a282000e49738f","5a38e6bac4a2826c6e06d79b","5a7828548dc32e5a9c28b516","5a7ae0c351dfba0017554310","5aafa857e5b5b00018480968","5ab8e9fcd8ce870019439434","5abcbc27d8ce8700182eceeb","5abccb7dd8ce87001773e277","5ac4cd105acfc40016339859","5ac66cb05acfc40198510a10","5ac66d015acfc400180ae6e4","5ac66d2e5acfc43b321d4b53","5ac66d725acfc43b321d4b60","5ac66d9b5acfc4001633997a","5ae08f0a5acfc408fb1398a1","5b0bbe4e5acfc40dc528a72d","5b1fa9b25acfc40018633c01","5b3b713c5acfc4330140bd8d","5ba26383d4351e00334c93d9","5bb2475ed4351e00853264e3","5bd70322209c4d00d7167b8f","5beed0f50db834001c062b12","5bf3e03b0db834001d2c4a9c","5bf3e0490db83400196199af","5bfd297f0db834001a669119","5bfea6e90db834001b7347f3","5c07c60e0db834002330051f","5c46fbd72e2216398b5a8c9c","5c488a752e221602b412af63","5c501a4d2e221602b412b540","5cadc190ae921500103bb3b6","5cadfbf7ae92152ac412eeef","5cc82d76e24e8d00134b4b83","5d2f0d8048f0356c925bc3b0","5d3eb3b0a4b93615055e84d2","5d43021ca4b9362eab4b5e25","5d67abc1a4b93614ec50137f","5dcbd56fdbd3d91b3e5468d5","5de652c31b7e3716273428be","5de7bd7bfd6b4e6e2276dc25","5df24cf80dee1b22f862e9bc","5df8ce05b11454561e39243b","5e00903ae9dc277128008b87","5e81c3cbac2bb513793cdc75","5e81ebcd8e146c7080625e15","5e848cc2988a8701445df1e8","5e870397991fd70db46995c8","5ea03f7400685063ec28bfa8","5f2a9575926fd9352339381f","5f36a0e5fbf956000b716b65","5fb64bc92b1b027b1f50bcf2","5fbcc1d9016cce60e8341ab3","5fc22d7c187fea44d52eda44","5fc3e272f8b6a877a729eac5","5fc3f2d5900b1d5091531e57","602a9740da11d6478d5a06dc","60339954d62c9b14ed777c06","606587252535c57a13424cfd","606dae0ab0e443224b421bb7","60db29ce99594040e04c4a27","6165ac306ef05c2ce828ef74","6176aca650224f204c1da3fb","6183afd850224f204c1da514","6184055050224f204c1da540","618428466ef05c2ce828f218","6193a720f8ee7e52e42109ed","61a4c8884f95bc3b2c5dc96f","61f7c9e189e6fb1a5e3ea78d","620109578d82e67e7911abf2","6217726288ed9f0845317459","62178be9d0050232da3485d9","62178c4d4ecf221597654e3d","623063e994fc3f7b302a9696","624c0b3340357b5f566e8766","624c2e8614da335f1e034d8c","6259b864ebedf17603599e88","6275303a9f372d6ea97f9ec7","627e14b21713922ded6f2c15","628a60ae6b1d481ff772e9c8","628b5638ad252a16da6dd245","628b9c37a733087d0d7fe84b","62e14904c2699c0ec93adc47","62e7c4fba689e8c9c50dfc38","63088377b5cd696784087147","63171672192e68c5460cebc5","633ec7c2a6918cb895019c6c"};


    public RandomWeapon(boolean randomState){
        this.randomState=randomState;
    }


    //무기 id 리스트 중에서 랜덤 id 하나를 반환하는 함수
    public String GenerateRandomWeapon(){
        int randomNumber=RandomNumber(weaponIds.length, false);
        String weaponId=weaponIds[randomNumber];
        return weaponId;
    }

    // 0부터 num으로 받은 숫자 미만의 값을 랜덤으로 생성하는 함수
    // plusOne이 true 인 경우 0부터 num까지의 랜덤 숫자를 반환한다.
    private int RandomNumber(int num,boolean plusOne){
        int result=0;
        if(plusOne){
            result=random.nextInt(num+1);
            return result;
        }else{
            result=random.nextInt(num);
            return result;
        }
    }

    //id 리스트 내 랜덤 id 값을 반환하는 함수
    public String SelectRandomId(String[] ids){

        String id="";
        int RandomNum=RandomNumber(ids.length, true);
        
        //모드가 없는 경우를 생성하여 반환
        //random 클래스가 id 리스트 개수를 넘어가는 값을 뽑아낸 경우 해당 슬롯은 모드가 없는 것으로 판단
        if(RandomNum==ids.length+1) return "none";
        //모드 리스트 id중 하나를 반환
        else id=ids[RandomNum];//0 ~ length-1 사이 랜덤값 생성

        return id;

    }

}
