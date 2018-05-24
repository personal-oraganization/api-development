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
 * File Name           :	Account.java
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

public class PaymentArrivalDate implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private PaymentProduct paymentProduct = null;
	/**
	 * type of the request create/update/delete.
	 **/
	private String releaseDate = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private Amount instructedAmount = null;
	
	public PaymentProduct getPaymentProduct() {
		return paymentProduct;
	}
	public void setPaymentProduct(PaymentProduct paymentProduct) {
		this.paymentProduct = paymentProduct;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Amount getInstructedAmount() {
		return instructedAmount;
	}
	public void setInstructedAmount(Amount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}
	
	
}
