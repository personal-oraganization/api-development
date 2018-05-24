package com.intellect.igtb.ipsh.api.model;

public class DerivedPaymentProdReq {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * type of the request create/update/delete.
	 **/
	private Context context = null;
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private DerivedPaymentProd payload = null;

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public DerivedPaymentProd getPayload() {
		return payload;
	}

	public void setPayload(DerivedPaymentProd payload) {
		this.payload = payload;
	}

}
