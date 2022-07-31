package com.anadolubank.anadolubankbitirmeproje;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anadolubank.anadolubankbitirmeproje.consAnswers.Input;


@SpringBootApplication
public class AnadolubankBitirmeProjeApplication {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(AnadolubankBitirmeProjeApplication.class, args);
		Input.inprocess();
	}

}
