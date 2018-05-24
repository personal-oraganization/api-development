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
 * Module Name         :	Payments API
 *
 * File Name           :	ErrorCodes.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-Dec-2017      0.1          Kiran Barik	  First version
 *******************************************************************************************/

package com.intellect.igtb.ipsh.api.commons.constants;

public enum ErrorCodes {
	OK_CODE_200("200"), ERR_CODE_404("404"), ERR_CODE_400("400"), ERR_CODE_422("422"), ERR_CODE_500(
			"500"), ERR_CODE_501("501");

	private final String name;

	private ErrorCodes(String s) {
		this.name = s;
	}

	@Override
	public String toString() {
		return name;
	}
}
