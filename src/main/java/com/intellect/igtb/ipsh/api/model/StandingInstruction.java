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
 * File Name           :	StandingInstruction.java
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
 * StandingInstruction
 */
public class StandingInstruction {
  private String paymentMethod = null;

  private CategoryPurpose categoryPurpose = null;

  private String requestedExecutionDate = null;

  private String holidayAction = null;

  private String frqcy = null;

  private String dayOfWeek = null;

  private String dayOfMonth = null;

  private String endCriterion = null;

  private String numOfPayments = null;

  private String endDate = null;

  private String baloonAmtfrqcy = null;

  private String option = null;

  private String makerUserId = null;

  private String makerDate = null;

  private String endToEndIdentification = null;

  private String instructionIdentification = null;

  private String txnInitiationType = null;

  private Party debtor = null;

  private FinancialAgent debtorAgent = null;

  private Account debtorAccount = null;

  private ChargeBearer chargeBearer = null;

  private Account chargeAccount = null;

  private String intermediaryAgent1 = null;//------------------

  private PaymentProduct paymentProduct = null;

  private Party creditor = null;

  private FinancialAgent creditorAgent = null;

  private Account creditorAccount = null;

  private Amount instructedAmount = null;

  private Amount equivalentAmount = null;

  private Amount baloonAmount = null;

  private RemittanceInformation remittanceInformation = null;

  private String standingInstructionId = null;
  
  public StandingInstruction paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Specifies the means of payment that will be used to move the amount of money.
   * @return paymentMethod
  **/
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public StandingInstruction categoryPurpose(CategoryPurpose categoryPurpose) {
    this.categoryPurpose = categoryPurpose;
    return this;
  }

   /**
   * Get categoryPurpose
   * @return categoryPurpose
  **/

  public CategoryPurpose getCategoryPurpose() {
    return categoryPurpose;
  }

  public void setCategoryPurpose(CategoryPurpose categoryPurpose) {
    this.categoryPurpose = categoryPurpose;
  }

  public StandingInstruction requestedExecutionDate(String requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

   /**
   * Date at which the initiating party requests the clearing agent to process the payment. If payment by cheque, the date when the cheque must be generated by the bank.
   * @return requestedExecutionDate
  **/

  public String getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(String requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  public StandingInstruction holidayAction(String holidayAction) {
    this.holidayAction = holidayAction;
    return this;
  }

   /**
   * Specifies the means of payment that will be used to move the amount of money.
   * @return holidayAction
  **/

  public String getHolidayAction() {
    return holidayAction;
  }

  public void setHolidayAction(String holidayAction) {
    this.holidayAction = holidayAction;
  }

  public StandingInstruction frqcy(String frqcy) {
    this.frqcy = frqcy;
    return this;
  }

   /**
   * Frequency of the SI execution (i.e. Daily, Weekly, Monthly etc)
   * @return frqcy
  **/
  public String getFrqcy() {
    return frqcy;
  }

  public void setFrqcy(String frqcy) {
    this.frqcy = frqcy;
  }

  public StandingInstruction dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of Week on which the SI needs to be executed.
   * @return dayOfWeek
  **/
  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public StandingInstruction dayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Day of Month on which the SI needs to be executed.
   * @return dayOfMonth
  **/

  public String getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public StandingInstruction endCriterion(String endCriterion) {
    this.endCriterion = endCriterion;
    return this;
  }

   /**
   * Criteria for ending the SI (Upon cancellation, After number of payments etc)
   * @return endCriterion
  **/
  public String getEndCriterion() {
    return endCriterion;
  }

  public void setEndCriterion(String endCriterion) {
    this.endCriterion = endCriterion;
  }

  public StandingInstruction numOfPayments(String numOfPayments) {
    this.numOfPayments = numOfPayments;
    return this;
  }

   /**
   * Number of payments to be made using the SI being created.
   * @return numOfPayments
  **/
  public String getNumOfPayments() {
    return numOfPayments;
  }

  public void setNumOfPayments(String numOfPayments) {
    this.numOfPayments = numOfPayments;
  }

  public StandingInstruction endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End Date of the SI being created.
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public StandingInstruction baloonAmtfrqcy(String baloonAmtfrqcy) {
    this.baloonAmtfrqcy = baloonAmtfrqcy;
    return this;
  }

   /**
   * Specifies baloon amount frequency.
   * @return baloonAmtfrqcy
  **/
  public String getBaloonAmtfrqcy() {
    return baloonAmtfrqcy;
  }

  public void setBaloonAmtfrqcy(String baloonAmtfrqcy) {
    this.baloonAmtfrqcy = baloonAmtfrqcy;
  }

  public StandingInstruction option(String option) {
    this.option = option;
    return this;
  }

   /**
   * Type of Payment being initiated (i.e. Bill Payment, Transfer, File upload, Payment)
   * @return option
  **/
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public StandingInstruction makerUserId(String makerUserId) {
    this.makerUserId = makerUserId;
    return this;
  }

   /**
   * UserId of the customer maker user who initiated the Standing instruction
   * @return makerUserId
  **/
  public String getMakerUserId() {
    return makerUserId;
  }

  public void setMakerUserId(String makerUserId) {
    this.makerUserId = makerUserId;
  }

  public StandingInstruction makerDate(String makerDate) {
    this.makerDate = makerDate;
    return this;
  }

   /**
   * Specifies DateTime on which the customer maker initiated the Standing instruction
   * @return makerDate
  **/
  public String getMakerDate() {
    return makerDate;
  }

  public void setMakerDate(String makerDate) {
    this.makerDate = makerDate;
  }

  public StandingInstruction endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

   /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.
   * @return endToEndIdentification
  **/
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public StandingInstruction instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage- the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public StandingInstruction txnInitiationType(String txnInitiationType) {
    this.txnInitiationType = txnInitiationType;
    return this;
  }

   /**
   * Type of Payment being initiated (i.e. Bill Payment, Transfer, File upload).
   * @return txnInitiationType
  **/
  public String getTxnInitiationType() {
    return txnInitiationType;
  }

  public void setTxnInitiationType(String txnInitiationType) {
    this.txnInitiationType = txnInitiationType;
  }

  public StandingInstruction debtor(Party debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Get debtor
   * @return debtor
  **/
  public Party getDebtor() {
    return debtor;
  }

  public void setDebtor(Party debtor) {
    this.debtor = debtor;
  }

  public StandingInstruction debtorAgent(FinancialAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  public FinancialAgent getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(FinancialAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public StandingInstruction debtorAccount(Account debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  public Account getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(Account debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public StandingInstruction chargeBearer(ChargeBearer chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

   /**
   * Get chargeBearer
   * @return chargeBearer
  **/

  public ChargeBearer getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(ChargeBearer chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public StandingInstruction chargeAccount(Account chargeAccount) {
    this.chargeAccount = chargeAccount;
    return this;
  }

   /**
   * Get chargeAccount
   * @return chargeAccount
  **/

  public Account getChargeAccount() {
    return chargeAccount;
  }

  public void setChargeAccount(Account chargeAccount) {
    this.chargeAccount = chargeAccount;
  }

  public StandingInstruction paymentProduct(PaymentProduct paymentProduct) {
    this.paymentProduct = paymentProduct;
    return this;
  }

   /**
   * Get paymentProduct
   * @return paymentProduct
  **/

  public PaymentProduct getPaymentProduct() {
    return paymentProduct;
  }

  public void setPaymentProduct(PaymentProduct paymentProduct) {
    this.paymentProduct = paymentProduct;
  }

  public StandingInstruction creditor(Party creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Get creditor
   * @return creditor
  **/

  public Party getCreditor() {
    return creditor;
  }

  public void setCreditor(Party creditor) {
    this.creditor = creditor;
  }

  public StandingInstruction creditorAgent(FinancialAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  public FinancialAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(FinancialAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public StandingInstruction creditorAccount(Account creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  public Account getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(Account creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public StandingInstruction instructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.
   * @return instructedAmount
  **/
  public Amount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public StandingInstruction equivalentAmount(Amount equivalentAmount) {
    this.equivalentAmount = equivalentAmount;
    return this;
  }

   /**
   * Amount of money to be moved between the debtor and creditor, expressed in the currency of the debtors account, and the currency in which the amount is to be moved.
   * @return equivalentAmount
  **/
  public Amount getEquivalentAmount() {
    return equivalentAmount;
  }

  public void setEquivalentAmount(Amount equivalentAmount) {
    this.equivalentAmount = equivalentAmount;
  }

  public StandingInstruction baloonAmount(Amount baloonAmount) {
    this.baloonAmount = baloonAmount;
    return this;
  }

   /**
   * The final payment is large and has ballooned in comparison to the other payments..
   * @return baloonAmount
  **/
  public Amount getBaloonAmount() {
    return baloonAmount;
  }

  public void setBaloonAmount(Amount baloonAmount) {
    this.baloonAmount = baloonAmount;
  }

public RemittanceInformation getRemittanceInformation() {
	return remittanceInformation;
}

public void setRemittanceInformation(RemittanceInformation remittanceInformation) {
	this.remittanceInformation = remittanceInformation;
}

public String getIntermediaryAgent1() {
	return intermediaryAgent1;
}

public void setIntermediaryAgent1(String intermediaryAgent1) {
	this.intermediaryAgent1 = intermediaryAgent1;
}

public String getStandingInstructionId() {
	return standingInstructionId;
}

public void setStandingInstructionId(String standingInstructionId) {
	this.standingInstructionId = standingInstructionId;
}


}

