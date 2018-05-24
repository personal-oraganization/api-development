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
 * File Name           :	Account.java
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

/**
 * DocumentUpload
 */
public class DocumentUpload {

  private String docId = null;
  
  private String docOriginalName = null;

  private String docUniqueName = null;

  private String docType = null;

  private String docUploadDateTime = null;

  
public String getDocId() {
	return docId;
}

public void setDocId(String docId) {
	this.docId = docId;
}

public String getDocOriginalName() {
	return docOriginalName;
}

public void setDocOriginalName(String docOriginalName) {
	this.docOriginalName = docOriginalName;
}

public String getDocUniqueName() {
	return docUniqueName;
}

public void setDocUniqueName(String docUniqueName) {
	this.docUniqueName = docUniqueName;
}

public String getDocType() {
	return docType;
}

public void setDocType(String docType) {
	this.docType = docType;
}

public String getDocUploadDateTime() {
	return docUploadDateTime;
}

public void setDocUploadDateTime(String docUploadDateTime) {
	this.docUploadDateTime = docUploadDateTime;
}

}

