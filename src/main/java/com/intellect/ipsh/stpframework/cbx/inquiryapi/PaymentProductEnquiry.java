package com.intellect.ipsh.stpframework.cbx.inquiryapi;

import java.util.HashMap;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import com.intellect.ipsh.stpframework.cbx.services.CBXAPIServices;

/**
 * @author sathish.raikwar
 * This class will be used to parse incoming request and send back payment product code
 * in response to the request
 * 
 */
public class PaymentProductEnquiry {

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
	 * @author sathish.raikwar
	 * Following method will be used to get the payment product code
	 * based on incoming request.
	 * @param input
	 * @return
	 */
	public String getPaymentProductCodes(String input){
		JSONArray list = new JSONArray();
		System.out.println("+++++++++++++++Input String received ++++++++++++ " +input);
		JSONParser jsonParser=new JSONParser();
		JSONObject jsonObject;
		System.out.println(-1);
		JSONObject jsonResponse= new JSONObject();
		System.out.println(0);
		try {
					jsonObject = (JSONObject)jsonParser.parse(input);
					System.out.println(1);
					JSONObject payLoadObject=(JSONObject) jsonObject.get("payload");
					System.out.println(1);
					JSONObject paymentProduct=(JSONObject)payLoadObject.get("paymentProduct");
					System.out.println(1);
					String prod=paymentProduct.get("paymentType").toString();
					System.out.println(1);
//					JSONObject ceditor=(JSONObject)payLoadObject.get("creditor");
//					String customer_id=ceditor.get("Identification").toString();
//					JSONObject instructedAmount=(JSONObject)payLoadObject.get("instructedAmount");
//					String instrAmnt=instructedAmount.get("amount").toString();
//					String instCurr=instructedAmount.get("currency").toString();
					System.out.println(10);
					//String lIsoCode="TH";//As of now hard code later we have to drive country code from customer id from cache
					String lIsoCode=null;
					String lBprodCode="002"; // as of now may be will receive from JSON/some where else 
//					logger.info("+++++++++++++++Calling inquiryAPIServices with customer id ++++++++++++ " +customer_id);
//					if(instrAmnt != null)
//					{
//						amount = Double.valueOf(instrAmnt.toString());
//		
//					}
					System.out.println(100);
//					outWardformatNetwrk=cbxAPIServices.getPaymentProductCodes(customer_id, prod, instCurr, amount, lIsoCode, lBprodCode);
//					if(outWardformatNetwrk.get("PRODUCT_CODE") != null)
//					{
//		
//						jsonResponse.put("errorCode", "AG02" );
//						jsonResponse.put("errorDesc", "Payment Product not found." );
//					}
//					else{
						//list.add(outWardformatNetwrk.get("PRODUCT_CODE").toString());
						list.add("SMART001");
						list.add("BATHNET001");
						System.out.println(list);
						jsonResponse.put("paymentProductCodes", list );
//					}
			}
		    catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			jsonResponse.put("errorCode", "R14" );
			jsonResponse.put("errorDesc", "Invalid input JSON format." );
		    }catch (Exception e){
			jsonResponse.put("errorCode", "E002" );
			jsonResponse.put("errorDesc", "Error in Payment Product derivation." );

		}

		return jsonResponse.toJSONString();

		}
	}