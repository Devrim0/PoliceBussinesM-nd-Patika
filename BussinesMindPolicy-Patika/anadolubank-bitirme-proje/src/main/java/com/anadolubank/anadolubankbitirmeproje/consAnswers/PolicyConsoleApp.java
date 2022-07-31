package com.anadolubank.anadolubankbitirmeproje.consAnswers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anadolubank.anadolubankbitirmeproje.model.Policy;
import com.anadolubank.anadolubankbitirmeproje.service.PolicyService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class PolicyConsoleApp {

	
	public static Scanner input = new Scanner(System.in);

	private PolicyService policyService;

	@Autowired
	public PolicyConsoleApp(PolicyService policyService) {
		super();
		this.policyService = policyService;
	}

	public void FinansData() {

		List<Policy> policyList = policyService.findAll();

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"| ID  | Toplamda olan Kazançlar| Kar | Başlama Tarihi    | Bitiş Tarihi| Customer ID | Agent ID   |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < policyList.size(); i++) {

			System.out.printf("| %-3s | %-14s| %-17s  | %-18s| %-11s| %-13s | %-13s | %-9s| %-12s| %-12s|\n",
					policyList.get(i).getId(), policyList.get(i).getToplamKazanc(),
					policyList.get(i).getKar(), policyList.get(i).getB_date(),
					policyList.get(i).getE_date(), policyList.get(i).getCustomer().getId(),
					policyList.get(i).getAgent().getId());

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	public void Rapor() { 

		List<Policy> policyList = policyService.findAll();
		List<Policy> policyListFilter = new ArrayList<>();

		System.out.println("Start Date kaçtan büyük olanları rapor edeceksiniz?");
		int cevap = input.nextInt();
		input.hasNextLine();
		for (int i = 0; i < policyList.size(); i++) {
			if (policyList.get(i).getB_date() >= cevap) {
				policyListFilter.add(policyList.get(i));
			}
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"| ID  | Toplamda olan Kazançlar| Kar | Başlama Tarihi    | Bitiş Tarihi| Customer ID | Agent ID   |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < policyListFilter.size(); i++) {

			System.out.printf("| %-3s | %-14s| %-17s  | %-18s| %-11s| %-13s | %-13s | %-9s| %-12s| %-12s|\n",
					policyListFilter.get(i).getId(), policyListFilter.get(i).getToplamKazanc(),
					policyListFilter.get(i).getKar(), policyListFilter.get(i).getB_date(),
					policyListFilter.get(i).getE_date(), policyListFilter.get(i).getCustomer().getId(),
					policyListFilter.get(i).getAgent().getId());

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	public void Compare() {
		List<Policy> policyList = policyService.findAll();
		List<Integer> listOfIndex = new ArrayList<>();

		System.out.println("Kaç tane karşılaştırma işlemi yapacaksınız ? ");
		int ans = input.nextInt();
		input.nextLine();

		System.out.println("Karşılaştırmak istediğiniz ID değerlerini giriniz.");

		for (int i = 0; i < ans; i++) {
			int id_deger = input.nextInt();
			listOfIndex.add(i);
		}

		List<Policy> selectedPolicy = new ArrayList<>();

		for (int i = 0; i < listOfIndex.size(); i++) {
			if (policyService.getPolicyById(listOfIndex.get(i)) != null) {
				selectedPolicy.add(policyService.getPolicyById(listOfIndex.get(i)).get());
			}
		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"| ID  | Toplamda olan Kazançlar| Kar | Başlama Tarihi    | Bitiş Tarihi| Customer ID | Agent ID   |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < selectedPolicy.size(); i++) {

			System.out.printf("| %-3s | %-14s| %-17s  | %-18s| %-11s| %-13s | %-13s | %-9s| %-12s| %-12s|\n",
					selectedPolicy.get(i).getId(), selectedPolicy.get(i).getToplamKazanc(),
					selectedPolicy.get(i).getKar(), selectedPolicy.get(i).getB_date(),
					selectedPolicy.get(i).getE_date(), selectedPolicy.get(i).getCustomer().getId(),
					selectedPolicy.get(i).getAgent().getId());

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}
}
