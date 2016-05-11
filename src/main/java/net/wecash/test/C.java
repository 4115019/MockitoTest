package net.wecash.test;

/**
 * Created by chenwen on 16/4/28.
 */
public class C {
    private D d;
    private E e;

    public C(D d,E e){
        this.d = d;
        this.e = e;
    }

    public int add(int a,int b){
        return d.add(a,b) + e.add(a,b);
    }
}
