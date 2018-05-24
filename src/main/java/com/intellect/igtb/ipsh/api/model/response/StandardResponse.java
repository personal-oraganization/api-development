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
 * File Name           : StandardResponse.java
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
import java.util.ArrayList;
import java.util.List;

public class StandardResponse implements Serializable {
 private static final long serialVersionUID = -5393901375337304365L;
 /**
  * Http status code to identify success/failure
  */
 protected String resCode;
 /**
  * Response message, indicating what has happened to the request
  */
 protected String resMsg;
 /**
  * Developer friendly debug message, specific for dev environment
  */
 protected String devMsg;
 /**
  * Array of objects, indicating individual validation errors
  */
 protected List<ValidationError> valErrors;

 public StandardResponse() {
  this.resCode = ""; // to prevent null pointer exception
 }

 public StandardResponse(String resCode, String resMsg, String devMsg) {
  super();
  this.resCode = resCode;
  this.resMsg = resMsg;
  setDevMsg(devMsg); // calling setter method to ensure flag is checked
 }

 public String getResCode() {
  return resCode;
 }

 public String getResMsg() {
  return resMsg;
 }

 public String getDevMsg() {
  return devMsg;
 }

 public void setResCode(String resCode) {
  this.resCode = resCode;
 }

 public void setResMsg(String resMsg) {
  this.resMsg = resMsg;
 }

 public void setDevMsg(String devMsg) {
  this.devMsg = devMsg;
 }

 public List<ValidationError> getValErrors() {
  return valErrors;
 }

 public void setValErrors(List<ValidationError> valErrors) {
  this.valErrors = valErrors;
 }

 public void addValError(ValidationError valError) {
  if (this.valErrors == null)
   this.valErrors = new ArrayList<>();
  this.valErrors.add(valError);
 }

 @Override
 public String toString() {
  return "ResponseStatus [resCode=" + resCode + ", resMsg=" + resMsg + ", devMsg=" + devMsg + "]";
 }

}