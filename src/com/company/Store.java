package com.company;

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {//если на складе нет товаров
            try {
                System.out.println(Thread.currentThread().getName() + ": приходит на склад. А где весь товар? (Товаров на складе: " + product + ")");
                wait();
            } catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println(Thread.currentThread().getName() + ": купил 1 товар. (Товаров на складе: " + product + ")");
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {//представим, что одновременно на складе не может храниться больше 3 товаров
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println(Thread.currentThread().getName() + ": добавил 1 товар. (Товаров на складе: " + product + ")");
        notify();
    }
}
