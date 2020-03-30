package com.lsq.designpattern.templatemethod;

public class ClothesShopping extends  Shopping {

    @Override
    public void buy() {
        System.out.println("购买衣服");
    }

    @Override
    public void pay(){
        System.out.println("使用银联支付成功！");
    }



}
