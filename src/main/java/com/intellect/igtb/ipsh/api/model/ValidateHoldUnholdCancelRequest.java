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
 * File Name           :	ValidateHoldUnholdCancelRequest.java
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

public class ValidateHoldUnholdCancelRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
//	private Context context = null;
	private String domainId=null;
	private String channelId=null;
	private String channelSeqId=null;
	private String payloadType=null;
	private String requestType=null;
	private HoldUnholdCancel payload = null;

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelSeqId() {
		return channelSeqId;
	}

	public void setChannelSeqId(String channelSeqId) {
		this.channelSeqId = channelSeqId;
	}

	public String getPayloadType() {
		return payloadType;
	}

	public void setPayloadType(String payloadType) {
		this.payloadType = payloadType;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public HoldUnholdCancel getPayload() {
		return payload;
	}

	public void setPayload(HoldUnholdCancel payload) {
		this.payload = payload;
	}

}
