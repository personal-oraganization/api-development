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
 * File Name           :	RemittanceInformation.java
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

public class RemittanceInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Information supplied to enable the matching/reconciliation of an entry
	 * with the items that the payment is intended to settle, such as commercial
	 * invoices in an accounts' receivable system, in an unstructured form.
	 **/
	private String unstructured = null;
	/**
	 * Unique reference, as assigned by the creditor, to unambiguously refer to
	 * the payment transaction. Usage If available, the initiating party should
	 * provide this reference in the structured remittance information, to
	 * enable reconciliation by the creditor upon receipt of the amount of
	 * money. If the business context requires the use of a creditor reference
	 * or a payment remit identification, and only one identifier can be passed
	 * through the end-to-end chain, the creditor's reference or payment
	 * remittance identification should be quoted in the end-to-end transaction
	 * identification.
	 **/
	private String creditorReferenceInformation = null;
	
	public String getUnstructured() {
		return unstructured;
	}
	public void setUnstructured(String unstructured) {
		this.unstructured = unstructured;
	}
	public String getCreditorReferenceInformation() {
		return creditorReferenceInformation;
	}
	public void setCreditorReferenceInformation(String creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
	}

}
