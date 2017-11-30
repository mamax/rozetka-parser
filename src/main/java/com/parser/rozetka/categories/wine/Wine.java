package com.parser.rozetka.categories.wine;

import com.parser.rozetka.categories.wine.products.*;

import java.util.ArrayList;
import java.util.List;

public class Wine {

    public static String getUrl() {
        return url;
    }

    private static final String url="https://rozetka.com.ua/vino/c4594285/";

    List<WhiteWine> whiteWineList = new ArrayList();
    List<PinkWine> pinkWineList = new ArrayList();
    List<RedWine> redWineList = new ArrayList();
    List<ChampaneWine> champaneWineList = new ArrayList();
    List<PresentsSuite> presentsSuite = new ArrayList();

}
