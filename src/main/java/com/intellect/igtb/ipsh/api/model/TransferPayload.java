/*
COPYRIGHT NOTICE

Copyright 2017 Intellect Design Arena Limited. All rights reserved.

These materials are confidential and proprietary to
Intellect Design Arena Limited and no part of these materials should
be reproduced, published, transmitted or distributed in any form or
by any means, electronic, mechanical, photocopying, recording or
otherwise, or stored in any information storage or retrieval system
of any nature nor should the materials be disclosed to third parties
or used in any other manner for which this is not authorized, without
the prior express written authorization of Intellect Design Arena Limited.
 */
/*******************************************************************************************
 *
 * Module Name         :	PaymentsValidation
 *
 * File Name           :	TransferPayload.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	---------------  ---------------------------
 * 22-June-2017      0.1         Kiran Barik	 First version
 *******************************************************************************************/

package com.intellect.igtb.ipsh.api.model;

import java.io.Serializable;
import java.util.List;

public class TransferPayload implements Serializable {
private static final long serialVersionUID = 1L;
private String paymentMethod = null;
private CategoryPurpose categoryPurpose = null;
private String requestedExecutionDate = null;
private String endToEndIdentification = null;
private String instructionIdentification = null;
private String txnInitiationType = null;//--------------------------
private Party debtor = null;
private Account debtorAccount = null;
private FinancialAgent debtorAgent = null;
private ChargeBearer chargeBearer = null;
private Account chargeAccount = null;
private String intermediaryAgent1 = null;//------------------
private PaymentProduct paymentProduct = null;//----------------
private Party creditor = null;
private FinancialAgent creditorAgent = null;
private Account creditorAccount = null;
private Amount instructedAmount = null;
private Amount equivalentAmount = null;
private List<TaxInfo> taxDetails = null;
private String transferId = null;
private RemittanceInformation remittanceInformation = null;
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}

public CategoryPurpose getCategoryPurpose() {
	return categoryPurpose;
}
public void setCategoryPurpose(CategoryPurpose categoryPurpose) {
	this.categoryPurpose = categoryPurpose;
}
public String getRequestedExecutionDate() {
	return requestedExecutionDate;
}
public void setRequestedExecutionDate(String requestedExecutionDate) {
	this.requestedExecutionDate = requestedExecutionDate;
}
public String getEndToEndIdentification() {
	return endToEndIdentification;
}
public void setEndToEndIdentification(String endToEndIdentification) {
	this.endToEndIdentification = endToEndIdentification;
}
public String getInstructionIdentification() {
	return instructionIdentification;
}
public void setInstructionIdentification(String instructionIdentification) {
	this.instructionIdentification = instructionIdentification;
}
public String getTxnInitiationType() {
	return txnInitiationType;
}
public void setTxnInitiationType(String txnInitiationType) {
	this.txnInitiationType = txnInitiationType;
}
public Party getDebtor() {
	return debtor;
}
public void setDebtor(Party debtor) {
	this.debtor = debtor;
}
public Account getDebtorAccount() {
	return debtorAccount;
}
public void setDebtorAccount(Account debtorAccount) {
	this.debtorAccount = debtorAccount;
}
public FinancialAgent getDebtorAgent() {
	return debtorAgent;
}
public void setDebtorAgent(FinancialAgent debtorAgent) {
	this.debtorAgent = debtorAgent;
}
public ChargeBearer getChargeBearer() {
	return chargeBearer;
}
public void setChargeBearer(ChargeBearer chargeBearer) {
	this.chargeBearer = chargeBearer;
}


public Account getChargeAccount() {
	return chargeAccount;
}
public void setChargeAccount(Account chargeAccount) {
	this.chargeAccount = chargeAccount;
}

public String getIntermediaryAgent1() {
	return intermediaryAgent1;
}
public void setIntermediaryAgent1(String intermediaryAgent1) {
	this.intermediaryAgent1 = intermediaryAgent1;
}
public PaymentProduct getPaymentProduct() {
	return paymentProduct;
}
public void setPaymentProduct(PaymentProduct paymentProduct) {
	this.paymentProduct = paymentProduct;
}
public Party getCreditor() {
	return creditor;
}
public void setCreditor(Party creditor) {
	this.creditor = creditor;
}
public FinancialAgent getCreditorAgent() {
	return creditorAgent;
}
public void setCreditorAgent(FinancialAgent creditorAgent) {
	this.creditorAgent = creditorAgent;
}
public Account getCreditorAccount() {
	return creditorAccount;
}
public void setCreditorAccount(Account creditorAccount) {
	this.creditorAccount = creditorAccount;
}
public Amount getInstructedAmount() {
	return instructedAmount;
}
public void setInstructedAmount(Amount instructedAmount) {
	this.instructedAmount = instructedAmount;
}
public Amount getEquivalentAmount() {
	return equivalentAmount;
}
public void setEquivalentAmount(Amount equivalentAmount) {
	this.equivalentAmount = equivalentAmount;
}

public RemittanceInformation getRemittanceInformation() {
	return remittanceInformation;
}
public void setRemittanceInformation(RemittanceInformation remittanceInformation) {
	this.remittanceInformation = remittanceInformation;
}
public List<TaxInfo> getTaxDetails() {
	return taxDetails;
}
public void setTaxDetails(List<TaxInfo> taxDetails) {
	this.taxDetails = taxDetails;
}
public String getTransferId() {
	return transferId;
}
public void setTransferId(String transferId) {
	this.transferId = transferId;
}


}

