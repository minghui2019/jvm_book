package org.fenixsoft.jvm.chapter2;

/**
 * Code List 2-4
 * VM Args：-Xss128k
 * Windows10 Java-se12
 * The Java thread stack size specified is too small. Specify at least 180k
 *
 * @author zzm
 */
public class JavaVMStackSOF_1 {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF_1 oom = new JavaVMStackSOF_1();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
