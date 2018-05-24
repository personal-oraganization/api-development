/*
 COPYRIGHT NOTICE
 
 Copyright 2016 Intellect Design Arena Limited. All rights reserved.
 
 These materials are confidential and proprietary to
 Intellect Design Arena Limited and no part of these materials should
 be reproduced, published, transmitted or distributed in any form or
 by any means, electronic, mechanical, photocopying, recording or
 otherwise, or stored in any information storage or retrieval system
 of any nature nor should the materials be disclosed to third parties
 or used in any other manner for which this is not authorized, without
 the prior express written authorization of Intellect Design Arena Limited.
 */

/**
 *
 * Module Name         : Digital API 
 *
 * File Name           : ValidationError.java
 *
 * Description         : 
 * 
 * @author kiran barik
 * @version 1.0
 * <p>------------------------------------------------------------------------------------</p>
 * <p>MODIFICATION HISTORY:</p>
 * <p>------------------------------------------------------------------------------------</p>
 * <p>SERIAL      AUTHOR      DATE  SCF     DESCRIPTION</p>
 * <p>------------------------------------------------------------------------------------</p>
 * <p> 1  kiran barik  15/11/2017     Initial Version     </p>
 */

package com.intellect.igtb.ipsh.api.model.response;

import java.io.Serializable;

public class ValidationError implements Serializable {
	private static final long serialVersionUID = -5304272529647948029L;
	/**
	 * App specific validation error code
	 */
	protected String code;
	/**
	 * Name of the field, that has failed validation
	 */
	protected String field;
	/**
	 * validation error message, that can be displayed on frontend
	 */
	protected String message;

	public ValidationError() {
	}

	public ValidationError(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ValidationError(String code, String field, String message) {
		super();
		this.code = code;
		this.field = field;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getField() {
		return field;
	}

	public String getMessage() {
		return message;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setField(String field) {
		this.field = field;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ValidationError [code=" + code + ", field=" + field + ", message=" + message + "]";
	}

}