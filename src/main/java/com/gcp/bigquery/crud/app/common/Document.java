/**
 * 
 */
package com.gcp.bigquery.crud.app.common;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class Document<T> {

	private T data;
	private String message;
	private int statusCode;

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @param data
	 * @param message
	 * @param statusCode
	 */
	public Document(T data, String message, int statusCode) {
		super();
		this.data = data;
		this.message = message;
		this.statusCode = statusCode;
	}

	public Document() {
		// TODO Auto-generated constructor stub
	}

}
