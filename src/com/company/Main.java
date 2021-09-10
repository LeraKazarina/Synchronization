package com.company;

public class Main {
    public static void main(String[] args) {
        Store store=new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(consumer, "Покупатель 1").start();
        new Thread(consumer, "Покупатель 2").start();
        new Thread(consumer, "Покупатель 3").start();

        new Thread(producer, "Рабочий").start();
    }
}
