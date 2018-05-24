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
 * File Name           :	SupportingDocument.java
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

import java.util.List;

/**
 * SupportingDocument
 */
public class SupportingDocument {
	private String channelSeqIdTrf = null;

	private String domainIdTrf = null;
	
	private String actionType = null;

	private List<DocumentUpload> docData = null;
	  
	public String getChannelSeqIdTrf() {
		return channelSeqIdTrf;
	}

	public void setChannelSeqIdTrf(String channelSeqIdTrf) {
		this.channelSeqIdTrf = channelSeqIdTrf;
	}

	public String getDomainIdTrf() {
		return domainIdTrf;
	}

	public void setDomainIdTrf(String domainIdTrf) {
		this.domainIdTrf = domainIdTrf;
	}
	
	
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public List<DocumentUpload> getDocData() {
		return docData;
	}

	public void setDocData(List<DocumentUpload> docData) {
		this.docData = docData;
	}

}
