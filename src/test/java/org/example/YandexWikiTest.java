package org.example;

public class YandexWikiTest {
    public static void main(String[] args) {
        Yandex yandex = new Yandex();
        yandex.setUp();
        yandex.z1();
        yandex.tearDown();
        Wiki wiki = new Wiki();
        wiki.setUp();
        wiki.www();
        wiki.tearDown();

    }
}
