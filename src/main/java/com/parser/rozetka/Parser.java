package com.parser.rozetka;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Parser {

    private static Document connect(){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://en.wikipedia.org/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public static void main(String[] args) {
        Document doc = connect();
//        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            String line = String.format("%s\n\t%s - %s", headline.attr("title"), headline.absUrl("href"), headline.wholeText());
            System.out.println(line);
        }

    }


}
