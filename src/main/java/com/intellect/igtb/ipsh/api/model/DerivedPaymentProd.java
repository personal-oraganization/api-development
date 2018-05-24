package com.intellect.igtb.ipsh.api.model;

public class DerivedPaymentProd {
	
	private Party debtor = null;
	private String bankEntity = null;
	private FinancialAgent creditorAgent = null;
	
	public Party getDebtor() {
		return debtor;
	}
	public void setDebtor(Party debtor) {
		this.debtor = debtor;
	}
	public String getBankEntity() {
		return bankEntity;
	}
	public void setBankEntity(String bankEntity) {
		this.bankEntity = bankEntity;
	}
	public FinancialAgent getCreditorAgent() {
		return creditorAgent;
	}
	public void setCreditorAgent(FinancialAgent creditorAgent) {
		this.creditorAgent = creditorAgent;
	}
	
}
