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
 * File Name           :	ResolvePaymentType.java
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

public class ResolvePaymentType implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private Party debtor = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private  Party creditorAgent = null;
	public Party getDebtor() {
		return debtor;
	}
	public void setDebtor(Party debtor) {
		this.debtor = debtor;
	}
	public Party getCreditorAgent() {
		return creditorAgent;
	}
	public void setCreditorAgent(Party creditorAgent) {
		this.creditorAgent = creditorAgent;
	}


}
