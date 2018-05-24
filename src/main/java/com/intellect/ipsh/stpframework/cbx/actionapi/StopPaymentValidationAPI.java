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
 * File Name           :	StopPaymentValidationAPI.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-June-2017      0.1         Kiran Barik	  First version
 *******************************************************************************************/
package com.intellect.ipsh.stpframework.cbx.actionapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellect.igtb.ipsh.api.model.response.StandardResponse;

public class StopPaymentValidationAPI {
	public String validate(String jsonInString) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(".........Validate.....................");
		String strJson=null;
		try {
		StandardResponse s = new StandardResponse();
		s.setResCode("200");
		s.setDevMsg("OK");
		s.setResMsg("OK");		
			strJson = mapper.writeValueAsString(s);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".........ValidateSingleTransaction....end.................");
		return strJson;
		}
}
