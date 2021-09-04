package org.example;

public class CRMTest {
    public static void main(String[] args) {
        CRM1 crm1 = new CRM1();
        crm1.setUp();
        crm1.p1();
        crm1.tearDown();
        CRM2 crm2 = new CRM2();
        crm2.setUp();
        crm2.p2();
        crm2.tearDown();
    }
}
