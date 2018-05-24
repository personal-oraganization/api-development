/*
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
 * File Name           :	TaxInfo.java
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

/**
 * TaxInfo
 */
public class TaxInfo {
  private String invoiceNo = null;

  private String taxId = null;

  private String taxablePartyName = null;

  private String taxablePartyAddress1 = null;

  private String taxablePartyAddress2 = null;

  private String taxablePartyAddress3 = null;

  private String incomeType = null;

  private String taxRate = null;

  private String applyTaxOn = null;

  private Double taxableAmount = null;

  private Double taxAmt = null;

public String getInvoiceNo() {
	return invoiceNo;
}

public void setInvoiceNo(String invoiceNo) {
	this.invoiceNo = invoiceNo;
}

public String getTaxId() {
	return taxId;
}

public void setTaxId(String taxId) {
	this.taxId = taxId;
}

public String getTaxablePartyName() {
	return taxablePartyName;
}

public void setTaxablePartyName(String taxablePartyName) {
	this.taxablePartyName = taxablePartyName;
}

public String getTaxablePartyAddress1() {
	return taxablePartyAddress1;
}

public void setTaxablePartyAddress1(String taxablePartyAddress1) {
	this.taxablePartyAddress1 = taxablePartyAddress1;
}

public String getTaxablePartyAddress2() {
	return taxablePartyAddress2;
}

public void setTaxablePartyAddress2(String taxablePartyAddress2) {
	this.taxablePartyAddress2 = taxablePartyAddress2;
}

public String getTaxablePartyAddress3() {
	return taxablePartyAddress3;
}

public void setTaxablePartyAddress3(String taxablePartyAddress3) {
	this.taxablePartyAddress3 = taxablePartyAddress3;
}

public String getIncomeType() {
	return incomeType;
}

public void setIncomeType(String incomeType) {
	this.incomeType = incomeType;
}

public String getTaxRate() {
	return taxRate;
}

public void setTaxRate(String taxRate) {
	this.taxRate = taxRate;
}

public String getApplyTaxOn() {
	return applyTaxOn;
}

public void setApplyTaxOn(String applyTaxOn) {
	this.applyTaxOn = applyTaxOn;
}

public Double getTaxableAmount() {
	return taxableAmount;
}

public void setTaxableAmount(Double taxableAmount) {
	this.taxableAmount = taxableAmount;
}

public Double getTaxAmt() {
	return taxAmt;
}

public void setTaxAmt(Double taxAmt) {
	this.taxAmt = taxAmt;
}


}

