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
 * File Name           :	ValidateSingleTransactionAPI.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-June-2017      0.1         Kiran Barik	  First version
 *******************************************************************************************/

package com.intellect.ipsh.stpframework.cbx;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellect.igtb.ipsh.api.model.response.StandardResponse;
import com.intellect.igtb.ipsh.api.model.response.ValidationError;

public class ValidateSingleTransactionAPI {

	public String validateTransaction(String jsonInString) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(".........ValidateSingleTransaction.....................");
		String strJson=null;
		try {
			
		StandardResponse s = new StandardResponse();
		s.setResCode("422");
		s.setDevMsg("Refer to validation errors for more details");
		s.setResMsg("Validation Errors found in Initiate Transfer request");	
		ValidationError vr = new ValidationError();
		vr.setCode("ERR_TXN_PRD_ENR_02");
		vr.setField("TransactionField");
		vr.setMessage("Payment cannot be processed.........");
		ValidationError vr1 = new ValidationError();
		vr1.setCode("ERR_TXN_CTOFVAL_01");
		vr1.setField("TransactionField");
		vr1.setMessage("Payment cannot be processed after cut- off time");
		List<ValidationError> l = new ArrayList<>();
		l.add(vr);
		l.add(vr1);
		s.setValErrors(l);
			strJson = mapper.writeValueAsString(s);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".........ValidateSingleTransaction....end.................");
		return strJson;
		}

}
