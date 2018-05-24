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
 * File Name           :	ResolvePaymentProduct.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-June-2017      0.1         Kiran Barik	  First version
 *******************************************************************************************/

package com.intellect.igtb.ipsh.api.model;

import java.io.Serializable;

public class ResolvePaymentProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * type of the request create/update/delete.
	 **/
	private String transferType = null;
	/**
	 * type of the request create/update/delete.
	 **/
	private String transferMethod = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private PaymentProduct paymentProduct = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private Party debtor = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private  Party creditor = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private  Account creditorAccount = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private  Amount instructedAmount = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String categoryPurpose = null;
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getTransferMethod() {
		return transferMethod;
	}
	public void setTransferMethod(String transferMethod) {
		this.transferMethod = transferMethod;
	}
	public PaymentProduct getPaymentProduct() {
		return paymentProduct;
	}
	public void setPaymentProduct(PaymentProduct paymentProduct) {
		this.paymentProduct = paymentProduct;
	}
	public Party getDebtor() {
		return debtor;
	}
	public void setDebtor(Party debtor) {
		this.debtor = debtor;
	}
	public Party getCreditor() {
		return creditor;
	}
	public void setCreditor(Party creditor) {
		this.creditor = creditor;
	}
	public Amount getInstructedAmount() {
		return instructedAmount;
	}
	public void setInstructedAmount(Amount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}
	public String getCategoryPurpose() {
		return categoryPurpose;
	}
	public void setCategoryPurpose(String categoryPurpose) {
		this.categoryPurpose = categoryPurpose;
	}
	public Account getCreditorAccount() {
		return creditorAccount;
	}
	public void setCreditorAccount(Account creditorAccount) {
		this.creditorAccount = creditorAccount;
	}
	
}
