/**
 * 
 */
package com.gcp.bigquery.crud.app.dto;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class DatasetDto {

	private String datasetName;

	/**
	 * @return the datasetName
	 */
	public String getDatasetName() {
		return datasetName;
	}

	/**
	 * @param datasetName the datasetName to set
	 */
	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
	}

	/**
	 * @param datasetName
	 */
	public DatasetDto(String datasetName) {
		super();
		this.datasetName = datasetName;
	}

	/**
	 * 
	 */
	public DatasetDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
