package com.company;

class Consumer implements Runnable {

    Store store;
    final int PURCHASED_GOODS = 11;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < PURCHASED_GOODS; i++) {
            store.get();
        }
    }
}
