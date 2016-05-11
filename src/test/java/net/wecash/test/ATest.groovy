package net.wecash.test

import org.junit.Test
import static org.mockito.Mockito.*;

/**
 * Created by chenwen on 16/4/28.
 */
class ATest {

    @Test
    void testAdd() {


        B b = mock(B.class);
        D d = mock(D.class);
        E e = mock(E.class);

        C c = new C(d,e);
        A a = new A(b,c);

        when(b.add(anyInt(),anyInt())).thenReturn(3);
        when(d.add(anyInt(),anyInt())).thenReturn(4);
        when(e.add(anyInt(),anyInt())).thenReturn(5);
//        when(e.add(1,2)).thenThrow(new RuntimeException("error"));


        System.out.println(a.add(1,2))

    }
}
