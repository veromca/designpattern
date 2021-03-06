package com.lsq.designpattern.templatemethod;

/**
 * 一、模板方法定义
 *
 *    定义一个操作中的某种算法的框架，而将一些步骤延迟到子类中。模板方法模式使得子类在不改变一个算法结构的前提下，对这些步骤进行个性化定义。
 *
 * 二、模板方法程序构成
 *
 *   在模板方法设计模式中，存在一个父类，其中包括两类方法：模板方法和步骤方法。
 *
 *  模板方法，即实现某种算法的方法步骤。而这些步骤都是调用的步骤方法完成的。
 *
 *  步骤方法，即完成模板方法的每个阶段性方法。每个步骤方法完成某一特定的、完成总算法的一部分功能。
 *
 * 步骤方法有三种类型：抽象方法、最终方法和钩子方法。
 *
 * 抽象方法：要求子类必须实现的方法，是完成模板方法的算法步骤中必须由子类完成的个性化定义。（一个抽象方法由抽象类声明、由其具体子类实现。）
 * 最终方法：子类不能重写的方法，是若要完成模板方法的算法步骤，对于所有子类执行都一样的步骤。
 * 钩子方法，是父类给出默认实现，但子类也可以重写的方法。（个钩子方法由一个抽象类或具体类声明并实现，而其子类可能会加以扩展。通常在父类中给出的实现是一个空实现
 * （可使用virtual关键字将其定义为虚函数），并以该空实现作为方法的默认实现，当然钩子方法也可以提供一个非空的默认实现。）
 * 三、使用场景
 *  3.1 JVM ClassLoader 双亲委派机制 ClassLoader.loadClass(String name, boolean resolve)
 *  3.2
 */
public class TestMain {
    public static void main(String[] args) {
        Shopping cs = new ClothesShopping();
        cs.buyGoods();
        System.out.println("---------------");
        Shopping ts = new TrousersShopping();
        ts.buyGoods();
    }
}
