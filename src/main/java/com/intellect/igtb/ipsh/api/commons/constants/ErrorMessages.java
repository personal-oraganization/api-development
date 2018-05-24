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
 * File Name           :	ErrorMessages.java
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

public enum ErrorMessages {
	ERR_STR_404("No data found"), ERR_STR_400("Bad Request"), ERR_STR_500(
			"Internal Error Occurred"), STD_VAL_ERR_DEBUG_MSG("Refer to validation errors for more details"), OK_MSG(
					"All OK"), STD_501_ERR_MSG("This feature is not implemented.");

	private final String name;

	private ErrorMessages(String s) {
		this.name = s;
	}

	@Override
	public String toString() {
		return name;
	}
}