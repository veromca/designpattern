package com.lsq.designpattern.templatemethod;

public abstract class Shopping {
    /**
     * 模板方法
     */
    protected void buyGoods(){
        login();
        buy();
        pay();
    }

    /**
     * 最终方法
     * 子类不可重写的方法
     */
    public final void login(){
        System.out.println("用户登录成功");
    }

    /**
     * 抽象方法
     * 必须由子类实现的方法
     */
    protected abstract void buy();

    /**
     * 钩子方法
     * 父类给出默认实现，但子类也可以重写的方法
     *
     */
    protected void pay(){
        System.out.println("使用支付宝支付成功！");
    }

}
