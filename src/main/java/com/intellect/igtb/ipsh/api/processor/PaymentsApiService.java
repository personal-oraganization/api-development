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
 * Module Name         :	PaymentsVal
 *
 * File Name           :	PaymentsApiService.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-June-2017      0.1         Kiran Barik	  First version
 *******************************************************************************************/
package com.intellect.igtb.ipsh.api.processor;

import org.springframework.http.ResponseEntity;

import com.intellect.igtb.ipsh.api.model.CutOffTimeRequest;
import com.intellect.igtb.ipsh.api.model.DerivedPaymentProdReq;
import com.intellect.igtb.ipsh.api.model.PaymentArrivalDateRequest;
import com.intellect.igtb.ipsh.api.model.PaymentReleaseDateRequest;
import com.intellect.igtb.ipsh.api.model.ResolvePaymentProductRequest;
import com.intellect.igtb.ipsh.api.model.ResolvePaymentTypeRequest;
import com.intellect.igtb.ipsh.api.model.ValidateHoldUnholdCancelRequest;
import com.intellect.igtb.ipsh.api.model.ValidateStandingInstructionRequest;
import com.intellect.igtb.ipsh.api.model.ValidateSupportinDocumentRequest;
import com.intellect.igtb.ipsh.api.model.ValidateTransferRequest;
import com.intellect.igtb.ipsh.api.model.response.StandardResponse;

public interface PaymentsApiService {
	public ResponseEntity<Object> resolvePaymentProduct(ResolvePaymentProductRequest resolvePaymentProductRequest);

	public ResponseEntity<Object> resolvePaymentTypeRequest(ResolvePaymentTypeRequest resolvePaymentTypeRequest);

	public ResponseEntity<Object> calculatePaymentReleaseDate(PaymentReleaseDateRequest paymentReleaseDateRequest);

	public ResponseEntity<Object> calculatePaymentArrivalDate(PaymentArrivalDateRequest paymentArrivalDateRequest);

	public ResponseEntity<Object> getCutOffTime(CutOffTimeRequest cutOffTimeRequest);

	public ResponseEntity<Object> derivePaymentProdList(DerivedPaymentProdReq derivedPaymentProdReq);
	
	public ResponseEntity<StandardResponse> validateTransaction(ValidateTransferRequest validateTransferRequest);

	public ResponseEntity<StandardResponse> processStandingInstructionRequest(ValidateStandingInstructionRequest payload);

	public ResponseEntity<StandardResponse> validation(ValidateSupportinDocumentRequest	 payload);

	public ResponseEntity<StandardResponse> validate(ValidateHoldUnholdCancelRequest	 payload);
}
