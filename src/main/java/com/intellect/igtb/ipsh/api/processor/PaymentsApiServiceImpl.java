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
 * File Name           :	PaymentsApiServiceImpl.java
 *
 * Description         :	For all action and inquiry service execution for backend process 
 *
 * Version Control Block
 *
 * Date             Version      Author           Description
 * ---------        --------	 ---------------  ---------------------------
 * 22-Oct-2017      0.1         Kiran Barik	       First version
 *******************************************************************************************/
package com.intellect.igtb.ipsh.api.processor;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.intellect.igtb.ipsh.api.commons.constants.ErrorCodes;
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
import com.intellect.ipsh.stpframework.cbx.ValidateSingleTransactionAPI;
import com.intellect.ipsh.stpframework.cbx.actionapi.StandingInstructionValidationAPI;
import com.intellect.ipsh.stpframework.cbx.actionapi.StopPaymentValidationAPI;
import com.intellect.ipsh.stpframework.cbx.actionapi.SupportingDocUploadValidationAPI;
import com.intellect.ipsh.stpframework.cbx.inquiryapi.CutoffTimeInquiryAPI;
import com.intellect.ipsh.stpframework.cbx.inquiryapi.DerivePaymentProductListInquiryAPI;
import com.intellect.ipsh.stpframework.cbx.inquiryapi.PaymentProductEnquiry;
import com.intellect.ipsh.stpframework.cbx.inquiryapi.PaymentTypeInquiryAPI;
import com.intellect.ipsh.stpframework.cbx.inquiryapi.PaymentValueDateEnquiryAPI;

@Service("paymentsApiService")
public class PaymentsApiServiceImpl implements PaymentsApiService {
	protected Logger logger = LogManager.getLogger(this.getClass());

	
	CutoffTimeInquiryAPI cutoffTimeInquiryAPI;
	
	
	DerivePaymentProductListInquiryAPI derivePaymentProductListInquiryAPI;

	
	PaymentProductEnquiry paymentProductEnquiry;

	
	PaymentTypeInquiryAPI paymentTypeInquiryAPI;

	
	PaymentValueDateEnquiryAPI paymentValueDateEnquiryAPI;

	
	ValidateSingleTransactionAPI validateSingleTransactionAPI;

	
	StandingInstructionValidationAPI standingInstructionValidationApi;

	
	SupportingDocUploadValidationAPI supportingDocUploadValidationAPI;
	
	
	StopPaymentValidationAPI stopPaymentValidationAPI;


	public CutoffTimeInquiryAPI getCutoffTimeInquiryAPI() {
		return cutoffTimeInquiryAPI;
	}

	public void setCutoffTimeInquiryAPI(CutoffTimeInquiryAPI cutoffTimeInquiryAPI) {
		this.cutoffTimeInquiryAPI = cutoffTimeInquiryAPI;
	}

	public DerivePaymentProductListInquiryAPI getDerivePaymentProductListInquiryAPI() {
		return derivePaymentProductListInquiryAPI;
	}

	public void setDerivePaymentProductListInquiryAPI(
			DerivePaymentProductListInquiryAPI derivePaymentProductListInquiryAPI) {
		this.derivePaymentProductListInquiryAPI = derivePaymentProductListInquiryAPI;
	}

	public PaymentProductEnquiry getPaymentProductEnquiry() {
		return paymentProductEnquiry;
	}

	public void setPaymentProductEnquiry(PaymentProductEnquiry paymentProductEnquiry) {
		this.paymentProductEnquiry = paymentProductEnquiry;
	}

	public PaymentTypeInquiryAPI getPaymentTypeInquiryAPI() {
		return paymentTypeInquiryAPI;
	}

	public void setPaymentTypeInquiryAPI(PaymentTypeInquiryAPI paymentTypeInquiryAPI) {
		this.paymentTypeInquiryAPI = paymentTypeInquiryAPI;
	}

	public PaymentValueDateEnquiryAPI getPaymentValueDateEnquiryAPI() {
		return paymentValueDateEnquiryAPI;
	}

	public void setPaymentValueDateEnquiryAPI(
			PaymentValueDateEnquiryAPI paymentValueDateEnquiryAPI) {
		this.paymentValueDateEnquiryAPI = paymentValueDateEnquiryAPI;
	}

	public ValidateSingleTransactionAPI getValidateSingleTransactionAPI() {
		return validateSingleTransactionAPI;
	}

	public void setValidateSingleTransactionAPI(
			ValidateSingleTransactionAPI validateSingleTransactionAPI) {
		this.validateSingleTransactionAPI = validateSingleTransactionAPI;
	}

	public StandingInstructionValidationAPI getStandingInstructionValidationApi() {
		return standingInstructionValidationApi;
	}

	public void setStandingInstructionValidationApi(
			StandingInstructionValidationAPI standingInstructionValidationApi) {
		this.standingInstructionValidationApi = standingInstructionValidationApi;
	}

	public SupportingDocUploadValidationAPI getSupportingDocUploadValidationAPI() {
		return supportingDocUploadValidationAPI;
	}

	public void setSupportingDocUploadValidationAPI(
			SupportingDocUploadValidationAPI supportingDocUploadValidationAPI) {
		this.supportingDocUploadValidationAPI = supportingDocUploadValidationAPI;
	}

	public StopPaymentValidationAPI getStopPaymentValidationAPI() {
		return stopPaymentValidationAPI;
	}

	public void setStopPaymentValidationAPI(
			StopPaymentValidationAPI stopPaymentValidationAPI) {
		this.stopPaymentValidationAPI = stopPaymentValidationAPI;
	}

	@Override
	public ResponseEntity<Object> resolvePaymentProduct(
			ResolvePaymentProductRequest resolvePaymentProductRequest) {

		HttpStatus httpStatus = HttpStatus.OK;
		ObjectMapper mapper = new ObjectMapper();
		JSONParser parser = new JSONParser();
		JSONArray list = new JSONArray();
		// Object to JSON in String
		String jsonIncutOffTimeRequestString = "";
		String jsonString=null;
		Map map = new HashMap();
		try {
			jsonIncutOffTimeRequestString = mapper.writeValueAsString(resolvePaymentProductRequest);
			logger.info("calling for backend process");
			jsonString = paymentProductEnquiry.getPaymentProductCodes(jsonIncutOffTimeRequestString);
			JSONObject json = (JSONObject) parser.parse(jsonString);
			list = (JSONArray) json.get("paymentProductCodes");
			String errorCodeString = (String) json.get("errorCode");
			String errorDescString = (String) json.get("errorDesc");
			if (list != null) {
				map.put("paymentTypeCodes", list);
			} else {
				map.put("errorCode", errorCodeString);
				map.put("errorDesc", errorDescString);
				httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			}

		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ jsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;

		} catch (ParseException e) {
			logger.error("Failure to parse JSON "+ jsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		logger.info("sending responese to controller method");
		return new ResponseEntity<Object>(map, httpStatus);
	}

	@Override
	public ResponseEntity<Object> resolvePaymentTypeRequest(
			ResolvePaymentTypeRequest resolvePaymentTypeRequest) {
		HttpStatus httpStatus = HttpStatus.OK;
		Map map = new HashMap<>();
		ObjectMapper mapper = new ObjectMapper();
		JSONParser parser = new JSONParser();
		// Object to JSON in String
		String jsonIncutOffTimeRequestString = "", resJsonString = "";
		try {
			jsonIncutOffTimeRequestString = mapper.writeValueAsString(resolvePaymentTypeRequest);
			logger.info("calling for backend process");

			resJsonString = paymentTypeInquiryAPI.getPaymentTypeCode(jsonIncutOffTimeRequestString);
			JSONObject json = (JSONObject) parser.parse(resJsonString);

			String paymentTypeCodeString = (String) json.get("paymentTypeCode");
			String errorCodeString = (String) json.get("errorCode");
			String errorDescString = (String) json.get("errorDesc");
			if (paymentTypeCodeString != null&& (!paymentTypeCodeString.equals(""))) {
				map.put("paymentTypeCode", paymentTypeCodeString);
			} else {
				map.put("errorCode", errorCodeString);
				map.put("errorDesc", errorDescString);
				httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			}
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ resJsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		} catch (ParseException e) {
			 logger.error("Failure to Json Processing "+ resJsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		logger.info("sending responese to controller method");
		return new ResponseEntity<Object>(map, httpStatus);
	}

	@Override
	public ResponseEntity<Object> calculatePaymentReleaseDate(
			PaymentReleaseDateRequest paymentReleaseDateRequest) {
		HttpStatus httpStatus = HttpStatus.OK;
		Map map = new HashMap<>();
		map.put("releaseDate", "03-JUL-2017");
		map.put("errorCode", "");
		map.put("errorDesc", "");
		return new ResponseEntity<Object>(map, httpStatus);
	}

	@Override
	public ResponseEntity<Object> calculatePaymentArrivalDate(
			PaymentArrivalDateRequest paymentArrivalDateRequest) {
		HttpStatus httpStatus = HttpStatus.OK;
		Map map = new HashMap<>();
		ObjectMapper mapper = new ObjectMapper();
		JSONParser parser = new JSONParser();
		// Object to JSON in String
		String jsonIncutOffTimeRequestString = "", resJsonString = "";
		try {
			jsonIncutOffTimeRequestString = mapper.writeValueAsString(paymentArrivalDateRequest);

			logger.info("calling for backend process");
			resJsonString = paymentValueDateEnquiryAPI.getExecutionDate(jsonIncutOffTimeRequestString);
			JSONObject json = (JSONObject) parser.parse(resJsonString);

			String requestedExecutionDateString = (String) json.get("requestedExecutionDate");
			String errorCodeString = (String) json.get("errorCode");
			String errorDescString = (String) json.get("errorDesc");
			if (requestedExecutionDateString != null&& (!requestedExecutionDateString.equals(""))) {
				map.put("requestedExecutionDate", requestedExecutionDateString);
			} else {
				map.put("errorCode", errorCodeString);
				map.put("errorDesc", errorDescString);
				httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			}
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ resJsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		} catch (ParseException e) {
			logger.error("Failure to Json Processing "+ resJsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		logger.info("sending responese to controller method");
		return new ResponseEntity<Object>(map, httpStatus);
	}

	@Override
	public ResponseEntity<Object> getCutOffTime(
			CutOffTimeRequest cutOffTimeRequest) {
		HttpStatus httpStatus = HttpStatus.OK;
		Map map = new HashMap<>();
		ObjectMapper mapper = new ObjectMapper();
		JSONParser parser = new JSONParser();
		// Object to JSON in String
		String jsonIncutOffTimeRequestString = "", resJsonString = "";
		try {
			jsonIncutOffTimeRequestString = mapper.writeValueAsString(cutOffTimeRequest);
			
			logger.info("calling for backend process");
			resJsonString = cutoffTimeInquiryAPI.getProductCutoffTime(jsonIncutOffTimeRequestString);
			JSONObject json = (JSONObject) parser.parse(resJsonString);
			String cutofftimeString = (String) json.get("cutoffTime");
			String errorCodeString = (String) json.get("errorCode");
			String errorDescString = (String) json.get("errorDesc");
			if (cutofftimeString != null && (!cutofftimeString.equals(""))) {
				map.put("cutoffTime", cutofftimeString);
			} else {
				map.put("errorCode", errorCodeString);
				map.put("errorDesc", errorDescString);
				httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			}
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ resJsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		} catch (ParseException e) {
			 logger.error("Failure to Json Processing "+ resJsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		logger.info("sending responese to controller method");
		return new ResponseEntity<Object>(map, httpStatus);
	}


	@Override
	public ResponseEntity<Object> derivePaymentProdList(
			DerivedPaymentProdReq derivedPaymentProdReq) {
		HttpStatus httpStatus = HttpStatus.OK;
		ObjectMapper mapper = new ObjectMapper();
		JSONParser parser = new JSONParser();
		JSONArray list = new JSONArray();
		// Object to JSON in String
		String jsonRequestString = "";
		String jsonString=null;
		Map map = new HashMap();
		try {
			jsonRequestString = mapper.writeValueAsString(derivedPaymentProdReq);	
			logger.info("calling for backend process"+jsonRequestString);
			jsonString = derivePaymentProductListInquiryAPI.derivePaymentProdList(jsonRequestString);			
			JSONObject json = (JSONObject) parser.parse(jsonString);
			list = (JSONArray) json.get("derivePaymentProdList");
			String errorCodeString = (String) json.get("errorCode");
			String errorDescString = (String) json.get("errorDesc");
			if (list != null) {
				map.put("derivePaymentProdList", list);
			} else {
				map.put("errorCode", errorCodeString);
				map.put("errorDesc", errorDescString);
				httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			}

		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ jsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;

		} catch (ParseException e) {
			logger.error("Failure to parse JSON "+ jsonString , e);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		logger.info("sending responese to controller method");
		return new ResponseEntity<Object>(map, httpStatus);
	}
	
	@Override
	public ResponseEntity<StandardResponse> validateTransaction(
			ValidateTransferRequest validateTransferRequest) {
		ObjectMapper mapper = new ObjectMapper();
		Gson gson = new Gson();
		StandardResponse response = null;
		HttpStatus httpStatus = HttpStatus.OK;
		String jsonInString=null;
		try {
			jsonInString = mapper.writeValueAsString(validateTransferRequest);
			
			String backend_response = validateSingleTransactionAPI.validateTransaction(jsonInString);
			
			response = gson.fromJson(backend_response, StandardResponse.class);
			
			if (response == null || response.getResCode().equalsIgnoreCase(ErrorCodes.ERR_CODE_500.toString()))
				httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			else if (response.getResCode().equalsIgnoreCase(ErrorCodes.OK_CODE_200.toString()))
				httpStatus = HttpStatus.OK;
			else if (response.getResCode().equalsIgnoreCase(ErrorCodes.ERR_CODE_422.toString()))
				httpStatus = HttpStatus.PRECONDITION_FAILED;
			else if (response.getResCode().equalsIgnoreCase(ErrorCodes.ERR_CODE_400.toString()))
				httpStatus = HttpStatus.BAD_REQUEST;
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ jsonInString , e);
		}
		return new ResponseEntity<StandardResponse>(response, httpStatus);

	}

	@Override
	public ResponseEntity<StandardResponse> processStandingInstructionRequest(
			ValidateStandingInstructionRequest payload) {
		ObjectMapper mapper = new ObjectMapper();
		Gson gson = new Gson();
		StandardResponse response = null;
		HttpStatus httpStatus = HttpStatus.OK;
		String jsonInString=null;
		try {
			jsonInString = mapper.writeValueAsString(payload);
			logger.info("response----" + jsonInString + "\n\n");
			String backend_response = standingInstructionValidationApi.processStandingInstructionRequest(jsonInString);
			logger.info("response----" + backend_response + "\n\n");
			response = gson.fromJson(backend_response, StandardResponse.class);
			if (response == null
					|| response.getResCode().equalsIgnoreCase(
							ErrorCodes.ERR_CODE_500.toString()))
				httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.OK_CODE_200.toString()))
				httpStatus = HttpStatus.OK;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.ERR_CODE_422.toString()))
				httpStatus = HttpStatus.PRECONDITION_FAILED;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.ERR_CODE_400.toString()))
				httpStatus = HttpStatus.BAD_REQUEST;
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ jsonInString , e);

		}
		return new ResponseEntity<StandardResponse>(response, httpStatus);

	}

	@Override
	public ResponseEntity<StandardResponse> validation(
			ValidateSupportinDocumentRequest payload) {
		ObjectMapper mapper = new ObjectMapper();
		Gson gson = new Gson();
		StandardResponse response = null;
		HttpStatus httpStatus = HttpStatus.OK;
		String jsonInString=null;
		try {
			jsonInString = mapper.writeValueAsString(payload);
			String backend_response = supportingDocUploadValidationAPI.validation(jsonInString);
			logger.info("response----" + backend_response + "\n\n");
			response = gson.fromJson(backend_response, StandardResponse.class);
			logger.info("\n\n" + Response.Status.OK + "\n\n");
			logger.info("response----" + response + "\n\n");
			if (response == null
					|| response.getResCode().equalsIgnoreCase(
							ErrorCodes.ERR_CODE_500.toString()))
				httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.OK_CODE_200.toString()))
				httpStatus = HttpStatus.OK;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.ERR_CODE_422.toString()))
				httpStatus = HttpStatus.PRECONDITION_FAILED;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.ERR_CODE_400.toString()))
				httpStatus = HttpStatus.BAD_REQUEST;
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ jsonInString , e);
		}
		return new ResponseEntity<StandardResponse>(response, httpStatus);
	}

	@Override
	public ResponseEntity<StandardResponse> validate(
			ValidateHoldUnholdCancelRequest payload) {
		ObjectMapper mapper = new ObjectMapper();
		Gson gson = new Gson();
		StandardResponse response = null;
		HttpStatus httpStatus = HttpStatus.OK;
		String jsonInString=null;
		try {
			jsonInString = mapper.writeValueAsString(payload);
			String backend_response = stopPaymentValidationAPI
					.validate(jsonInString);
			logger.info("response----" + backend_response + "\n\n");
			response = gson.fromJson(backend_response, StandardResponse.class);
			logger.info("\n\n" + Response.Status.OK + "\n\n");
			logger.info("response----" + response + "\n\n");
			if (response == null
					|| response.getResCode().equalsIgnoreCase(
							ErrorCodes.ERR_CODE_500.toString()))
				httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.OK_CODE_200.toString()))
				httpStatus = HttpStatus.OK;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.ERR_CODE_422.toString()))
				httpStatus = HttpStatus.PRECONDITION_FAILED;
			else if (response.getResCode().equalsIgnoreCase(
					ErrorCodes.ERR_CODE_400.toString()))
				httpStatus = HttpStatus.BAD_REQUEST;
		} catch (JsonProcessingException e) {
			 logger.error("Failure to Json Processing "+ jsonInString , e);
		}
		return new ResponseEntity<StandardResponse>(response, httpStatus);
	}
}
