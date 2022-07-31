package com.anadolubank.anadolubankbitirmeproje.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// toplam kazanç
	@Column(name = "toplam_kazanc")
	private int toplamKazanc; 
	@Column(name = "kar")
	private int kar;

	// başlangıç tarihi
	@Column(name = "b_date")
	private int b_date;

	// bitiş tarihi
	@Column(name = "e_date")
	private int e_date;

	// Agent
	@ManyToOne //çoktan bire olması lazım
	@JoinColumn(name = "agent_id")
	private Agent agent;

	// customer
	@ManyToOne //  çoktan bire
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Policy(Long id, int toplamKazanc, int kar, int b_date, int e_date, Agent agent,
			Customer customer) {
		super();
		this.id = id;
		this.toplamKazanc = toplamKazanc;
		this.kar = kar;
		this.b_date = b_date;
		this.e_date = e_date;
		this.agent = agent;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getToplamKazanc() {
		return toplamKazanc;
	}

	public void setToplamKazanc(int toplamKazanc) {
		this.toplamKazanc = toplamKazanc;
	}

	public int getKar() {
		return kar;
	}

	public void setKar(int kar) {
		this.kar = kar;
	}

	public int getB_date() {
		return b_date;
	}

	public void setB_date(int b_date) {
		this.b_date = b_date;
	}

	public int getE_date() {
		return e_date;
	}

	public void setE_date(int e_date) {
		this.e_date = e_date;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
