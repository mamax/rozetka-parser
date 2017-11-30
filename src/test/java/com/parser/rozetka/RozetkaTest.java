package com.parser.rozetka;

import com.parser.rozetka.base.BasicTest;
import com.parser.rozetka.categories.wine.products.WhiteWine;
import com.parser.rozetka.pages.WinePage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RozetkaTest extends BasicTest {

    List<WhiteWine> list = new ArrayList<>();

    @Test
    public void testRozetka(){
        String url = "https://rozetka.com.ua/vino/c4594285/filter/colour-70004=362643;vid_vina-70018=tihoe/";

        goToUrlWrapper(url);
        WinePage page = new WinePage(driver);

        for (int i = 0; i < page.getBlockList().size(); i++){
            System.out.print(page.getNameProduct().getText() + " - ");
            String price = page.getPrice().getText();
            System.out.println(price.split(" ")[0].substring(0, price.length()-3));
        }



    }
}
