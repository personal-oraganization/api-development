package com.intellect.ipsh.stpframework.cbx.inquiryapi;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import com.google.gson.JsonParseException;
//import com.intellect.ipsh.stpframework.cbx.services.CBXAPIServices;

/**
 * @author Akshay Kadadekar
 * 
 * This class is for, to get CutOffTime of Product including customer pref. extended cutOffTime(if set).
 * 
 * */
public class CutoffTimeInquiryAPI{

//	protected  Logger logger = LogManager.getLogger(this.getClass());

//	CBXAPIServices cbxAPIServices;
	
/*	public CBXAPIServices getCbxAPIServices() {
		return cbxAPIServices;
	}

	public void setCbxAPIServices(CBXAPIServices cbxAPIServices) {
		this.cbxAPIServices = cbxAPIServices;
	}
*/


	/**
	 * Following method is used for get product cutoff time.
	 * @input: JSON formatted request string.
	 * @output: JSON formatted response string.
	 * */

	public String getProductCutoffTime(String input){
//		logger.info("+++++++++++ Input for getPaymentType: "+input);
		System.out.println("+++++++++++ Input for getPaymentType: "+input);
		JSONObject responseJSON = new JSONObject();
		String cutOffTimeString = null;
		try{

			JSONParser parser = new JSONParser();

			JSONObject json = (JSONObject)parser.parse(input);

			JSONObject payload = (JSONObject)json.get("payload");

			JSONObject jsonDR = (JSONObject)payload.get("debtor");

//			String companyId = jsonDR.get("Identification").toString();

//			JSONObject jsonPayProd = (JSONObject)payload.get("paymentProduct");

//			String prodName = jsonPayProd.get("productName").toString();

			//cutOffTimeString = cbxAPIServices.getCutOffTime(companyId, prodName);
			cutOffTimeString="17:00:00";
			responseJSON.put("cutoffTime", cutOffTimeString);

		}
		catch(JsonParseException ex){
			responseJSON.put("errorCode", "R14");
			responseJSON.put("errorDesc", "Invalid input JSON format.");
//			logger.error("+++++++ Exception: "+ex.getMessage());
			ex.printStackTrace();
		}
		catch (Exception e) {
			responseJSON.put("errorCode", "E001");
			responseJSON.put("errorDesc", "Error in deriving transaction cutoff time.");
//			logger.error("+++++++ Exception: "+e.getMessage());
			e.printStackTrace();
		}
//		logger.info("++++++++ Response: "+ responseJSON);
		System.out.println("++++++++ Response: "+ responseJSON);
		return responseJSON.toString();
	}
}
