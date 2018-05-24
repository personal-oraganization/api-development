package com.intellect.ipsh.stpframework.cbx.inquiryapi;

import java.time.LocalDate;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*import com.intellect.ipsh.stpframework.cbx.services.CBXAPIServices;
import com.intellect.ipsh.stpframework.common.DateAPI;
*/
/**
 * @author sathish.raikwar
 * This class will be used to get the payment value date base on incoming request
 */
public class PaymentValueDateInquiryAPI {
	protected  Logger logger = LogManager.getLogger(this.getClass());
/*	CBXAPIServices cbxAPIServices;

	public CBXAPIServices getCbxAPIServices() {
		return cbxAPIServices;
	}

	public void setCbxAPIServices(CBXAPIServices cbxAPIServices) {
		this.cbxAPIServices = cbxAPIServices;
	}
*/

	/**
	 **@author sathish.raikwar
	 * Following method will be used to get the execution date base on JSON input
	 * @param input
	 * @return
	 */
	public String getExecutionDate(String input) {

		JSONParser parser = new JSONParser();
		JSONObject jsonResponse= new JSONObject();
		String settlementDayStr=null;
		try {
		
		JSONObject json = (JSONObject)parser.parse(input);

		JSONObject payload = (JSONObject)json.get("payload");

		String releaseDate=payload.get("releaseDate").toString();

		JSONObject instructedAmmount=(JSONObject)payload.get("instructedAmount");

		String currency=instructedAmmount.get("currency").toString();

		LocalDate localReleaseDate =   LocalDate.parse(releaseDate);

		JSONObject jsonPayProd = (JSONObject)payload.get("paymentProduct");

		String prodName = jsonPayProd.get("productName").toString();

//		localReleaseDate=cbxAPIServices.getExecutionDate( prodName ,  currency ,  settlementDayStr , localReleaseDate);
		if(localReleaseDate==null){
			jsonResponse.put("errorCode", "E002" );
			jsonResponse.put("errorDesc", "Error in deriving ExecutionDate" );
		}
		else{
			jsonResponse.put("requestedExecutionDate", localReleaseDate );	
		}
		
	}
		catch(ParseException e){
			jsonResponse.put("errorCode", "R14" );
			jsonResponse.put("errorDesc", "Invalid input JSON format." );	
		}
		catch(Exception e){
			jsonResponse.put("errorCode", "E002" );
			jsonResponse.put("errorDesc", "Error in deriving ExecutionDate" );
		}
		return jsonResponse.toString();
	}

}
