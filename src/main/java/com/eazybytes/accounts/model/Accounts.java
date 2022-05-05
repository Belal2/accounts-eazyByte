package com.eazybytes.accounts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Accounts {
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "account_number")
	@Id
	private long accountNumber;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "branch_address")
	private String branchAddress;
	@Column(name = "create_dt")
	private LocalDate createDt;

	public Accounts() {
	}

	public Accounts(int customerId, long accountNumber, String accountType, String branchAddress, LocalDate createDt) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.branchAddress = branchAddress;
		this.createDt = createDt;
	}

	@Override
	public String toString() {
		return "Accounts [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", branchAddress=" + branchAddress + ", createDt=" + createDt + "]";
	}
	
	

}
