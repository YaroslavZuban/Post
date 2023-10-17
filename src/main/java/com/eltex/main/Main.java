package com.eltex.main;

import com.eltex.service.WallService;

public class Main {
    public static void main(String[] args) {
        final var service1=new WallService();
        System.out.println(service1);

        final var service2=new WallService();
        System.out.println(service2);
    }
}