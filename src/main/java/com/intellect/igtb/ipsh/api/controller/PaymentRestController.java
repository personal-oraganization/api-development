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
 * File Name           :	PaymentRestController.java
 *
 * Description         :	************************
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-Oct-2017      0.1         Kiran Barik	      First version
 *******************************************************************************************/
package com.intellect.igtb.ipsh.api.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import com.intellect.igtb.ipsh.api.processor.PaymentsApiService;

@RestController
@RequestMapping(value = "/v1")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentRestController {
	
	PaymentsApiService paymentsApiService;
	
	public PaymentsApiService getPaymentsApiService() {
		return paymentsApiService;
	}

	public void setPaymentsApiService(PaymentsApiService paymentsApiService) {
		this.paymentsApiService = paymentsApiService;
	}


	protected Logger logger = LogManager.getLogger(this.getClass());

	// Incoming request for Resolve payment product
	@RequestMapping(value = "/inquiry/resolvepaymentproduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> resolvePaymentProduct(
			@RequestBody ResolvePaymentProductRequest resolvePaymentProductRequest) {

		logger.info("call resolvepaymentproduct");

		// Calling Service method for get resolve payment praduct
		return paymentsApiService
				.resolvePaymentProduct(resolvePaymentProductRequest); // createTransfer(validateTransferRequest);
	}

	// Incoming request for Resolve Payment Type
	@RequestMapping(value = "/inquiry/resolvepaymenttype", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> resolvePaymentType(
			@RequestBody ResolvePaymentTypeRequest resolvePaymentTypeRequest) {

		logger.info("call resolvePaymentType");
		// Calling Service method for resolve payment type request
		return paymentsApiService
				.resolvePaymentTypeRequest(resolvePaymentTypeRequest); // createTransfer(validateTransferRequest);
	}

	// Incoming request for Calculate Payment Release date
	@RequestMapping(value = "/inquiry/calculatepaymentreleasedate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> calculatePaymentReleaseDate(
			@RequestBody PaymentReleaseDateRequest paymentReleaseDateRequest) {

		logger.info("call paymentReleaseDateRequest");
		// Calling Service method for get calculate payment release date
		return paymentsApiService
				.calculatePaymentReleaseDate(paymentReleaseDateRequest); // createTransfer(validateTransferRequest);
	}

	// Incoming request for Calculate Payment arrival date
	@RequestMapping(value = "/inquiry/calculatepaymentarrivaldate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> calculatePaymentArrivalDate(
			@RequestBody PaymentArrivalDateRequest paymentArrivalDateRequest) {

		logger.info("call calculatepaymentarrivaldate");

		// Calling Service method for calculate payment arrival date
		return paymentsApiService
				.calculatePaymentArrivalDate(paymentArrivalDateRequest); // createTransfer(validateTransferRequest);
	}

	// Incoming request for CutOffTime details
	@RequestMapping(value = "/inquiry/getcutofftime", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getCutOffTime(
			@RequestBody CutOffTimeRequest cutOffTimeRequest) {

		logger.info("call cutOffTime");

		// Calling Service method for get cutoff time
		return paymentsApiService.getCutOffTime(cutOffTimeRequest); // createTransfer(validateTransferRequest);
	}
	
	// Incoming request for derivedPaymentProdList details
	@RequestMapping(value = "/inquiry/derivePaymentProdList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> derivePaymentProdList(
			@RequestBody DerivedPaymentProdReq derivedPaymentProdReq) {

		logger.info("call derivedPaymentProdList");

		// Calling Service method for get derivedPaymentProdList
		return paymentsApiService.derivePaymentProdList(derivedPaymentProdReq); // createTransfer(validateTransferRequest);
	}

	// Incoming Validate request for FundTransfer resource payload.
	@RequestMapping(value = "/validators/transfer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StandardResponse> createTransferValidation(
			@RequestBody ValidateTransferRequest validateTransferRequest) {

		logger.info("call createTransferValidation");

		// Calling Service method for get createTransfer resoponse
		return paymentsApiService.validateTransaction(validateTransferRequest); // createTransfer(validateTransferRequest);
	}

	// Incoming Validate request for StandingInstructions resource payload.
	@RequestMapping(value = "/validators/stndginstr", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StandardResponse> processStandingInstructionRequest(
			@RequestBody ValidateStandingInstructionRequest payload) {

		logger.info("call processStandingInstructionRequest");

		// Calling Service method to get processStandingInstruction resoponse
		return paymentsApiService.processStandingInstructionRequest(payload); // processStandingInstructionRequest(payload);
	}

	// Incoming Validate request for SupportingDocument resource payload.
	@RequestMapping(value = "/validators/suppdoc", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StandardResponse> validation(
			@RequestBody ValidateSupportinDocumentRequest payload) {

		logger.info("call validation");

		// Calling Service method for get validation resoponse
		return paymentsApiService.validation(payload); // validation(payload);
	}
	
	
	// Incoming Validate request for HoldUnholdCancel resource payload.
	@RequestMapping(value = "/validators/huc", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StandardResponse> validate(
			@RequestBody ValidateHoldUnholdCancelRequest payload) {

		logger.info("call validate");

		// Calling Service method to get validate resoponse
		return paymentsApiService.validate(payload);
	}
}
