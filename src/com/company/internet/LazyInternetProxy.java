package com.company.internet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LazyInternetProxy implements Internet{

    private RealInternet realInternet;
    private final List<String> bannedSites;

    public LazyInternetProxy() {
        bannedSites = new ArrayList<>();
        bannedSites.addAll(Arrays.asList("aaa.com", "bbb.com", "ccc.com"));
    }

    @Override
    public void connectTo(String url) {
        if(!bannedSites.contains(url.toLowerCase())) {
            if(realInternet == null) realInternet = new RealInternet();
            realInternet.connectTo(url);
        } else {
            System.out.println("Site is banned. Could not connect.");
        }
    }
}
