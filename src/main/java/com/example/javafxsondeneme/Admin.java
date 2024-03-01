package com.example.javafxsondeneme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Iterator;

public class Admin {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Label sonuc1;

    @FXML
    private Label sonuc2;

    @FXML
    private Label sonuc3;

    @FXML
    private Label sonuc4;

    @FXML
    private TextField silincekFirma;

    @FXML
    private TextField eklenecekFirmaAd;

    @FXML
    private TextField eklenecekFirmaSifre;

    @FXML
    private TextField hizmetBedeli;


    private static ArrayList<Transport> transportArrayList;
    private ArrayList<Transport> yeniArrayList;
    private ArrayList<Transport> yeni2ArrayList;
    private ArrayList<String> stringArrayList;
    private Iterator<Transport> companyIterator;
    String birlesmisMetin;
    String silinecekAd;
    String bedel;



    public Admin(){
        transportArrayList = new ArrayList<>();
        yeniArrayList = new ArrayList<>();
        yeni2ArrayList = new ArrayList<>();
        stringArrayList = new ArrayList<>();
        companyIterator = transportArrayList.iterator();

        // DATABASE

        // 1. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "12.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "12.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "12.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "12.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "12.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "12.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "12.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "12.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "12.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "12.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "12.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "12.12.2023"));

        // 2. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "13.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "13.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "13.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "13.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "13.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "13.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "13.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "13.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "13.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "13.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "13.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "13.12.2023"));

        // 3. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "14.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "14.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "14.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "14.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "14.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "14.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "14.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "14.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "14.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "14.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "14.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "14.12.2023"));

        // 4. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "15.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "15.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "15.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "15.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "15.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "15.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "15.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "15.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "15.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "15.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "15.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "15.12.2023"));

        // 5. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "16.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "16.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "16.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "16.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "16.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "16.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "16.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "16.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "16.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "16.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "16.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "16.12.2023"));

        // 6. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "17.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "17.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "17.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "17.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "17.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "17.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "17.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "17.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "17.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "17.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "17.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "17.12.2023"));

        // 7. GÜN
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs1", 3, 20, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "18.12.2023"));
        transportArrayList.add(new Transport("A Firması", "firmaA123", "Otobüs2", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "18.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs1", 3, 15, "İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", "18.12.2023"));
        transportArrayList.add(new Transport("B Firması", "firmaB123", "Otobüs2", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "18.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Otobüs1", 4, 20, "İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "18.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak1", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "18.12.2023"));
        transportArrayList.add(new Transport("C Firması", "firmaC123", "Uçak2", 5, 30, "İstanbul-Konya-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "18.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren1", 1, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "18.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren2", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "18.12.2023"));
        transportArrayList.add(new Transport("D Firması", "firmaD123", "Tren3", 2, 25, "İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", "18.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak1", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "18.12.2023"));
        transportArrayList.add(new Transport("F Firması", "firmaF123", "Uçak2", 6, 30, "İstanbul-Ankara-İstanbul", "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", "18.12.2023"));
    }


    public static ArrayList<Transport> getSharedArrayList() {
        return transportArrayList;
    }



    @FXML
    void firmaGoster(ActionEvent event) {
        // companyArrayList i sadeleştiriyoruz ve yeni bir arrayListe atıyoruz
        for(Transport currentTransport : transportArrayList){
            boolean eklendi = false;
            for(Transport yeniTransport : yeniArrayList){
                if(currentTransport.getKullaniciAdi().equals(yeniTransport.getKullaniciAdi())){
                    eklendi = true;
                    break;
                }
            }
            if(!eklendi){
                yeniArrayList.add(currentTransport);
            }
        }
        // yeni arrayListteki değerleri String bir arrayListe atıyoruz
        if(stringArrayList.isEmpty()){
            for(Transport yeni : yeniArrayList){
                stringArrayList.add(yeni.getKullaniciAdi());
                stringArrayList.add("\n");
            }
        }
        // String arrayListteki değerleri metin haline getiriyoruz
        birlesmisMetin = String.join("", stringArrayList);
        sonuc1.setText(birlesmisMetin);
    }


    @FXML
    void firmaSil(ActionEvent event) {
        // companyArrayList içerisinden firma siliyoruz
        silinecekAd = silincekFirma.getText();
        Iterator<Transport> companyIterator = transportArrayList.iterator();
        while(companyIterator.hasNext()){
            Transport tarananFirma = companyIterator.next();
            if(tarananFirma.getKullaniciAdi().equals(silinecekAd)){
                companyIterator.remove();
            }
        }
        // içinden eleman silinmiş companyArrayListi sadeleştiriyoruz
        for(Transport currentTransport : transportArrayList){
            boolean eklendi = false;
            for(Transport yeni2Transport : yeni2ArrayList){
                if(currentTransport.getKullaniciAdi().equals(yeni2Transport.getKullaniciAdi())){
                    eklendi = true;
                    break;
                }
            }
            if(!eklendi){
                yeni2ArrayList.add(currentTransport);
            }
        }
        // en son hale gelmiş arrayListi string bir ArrayListe atıyoruz
        stringArrayList.clear();
        for(Transport yeni2 : yeni2ArrayList){
            stringArrayList.add(yeni2.getKullaniciAdi());
            stringArrayList.add("\n");
        }
        // string arrayListi metine çeviriyoruz
        birlesmisMetin = String.join("", stringArrayList);
        sonuc4.setText(birlesmisMetin);
    }


    @FXML
    void hizmetBedeli(ActionEvent event) {
        bedel = hizmetBedeli.getText();
        sonuc2.setText(bedel);
    }

    @FXML
    void yeniFirmaKaydi(ActionEvent event) {
        // yeni firmanın bazı parametrelerine default değerler vererek companyArrayListin sonuna ekliyoruz ardından String arrayListe atıyoruz
        transportArrayList.add(new Transport(eklenecekFirmaAd.getText(), eklenecekFirmaSifre.getText(), null, 0,0, null, null, null));
        if(stringArrayList.isEmpty()){
            for(Transport transport : transportArrayList){
                stringArrayList.add(transport.getKullaniciAdi());
                stringArrayList.add("\n");
            }
        }
        String yeniFirma = transportArrayList.get(transportArrayList.size()-1).getKullaniciAdi();
        stringArrayList.add(yeniFirma);
        birlesmisMetin = String.join("", stringArrayList);
        sonuc3.setText(birlesmisMetin);
    }
}
