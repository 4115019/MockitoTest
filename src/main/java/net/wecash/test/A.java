package net.wecash.test;

/**
 * Created by chenwen on 16/4/28.
 */
public class A {
    private B b;
    private C c;

    public A(B b,C c){
        this.b = b;
        this.c = c;
    }

    public int add(int a,int b){
        return this.b.add(a,b) + this.c.add(a,b);
    }
}
