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
	private String projectId;

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
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	/**
	 * @param datasetName
	 * @param projectId
	 */
	public DatasetDto(String datasetName, String projectId) {
		super();
		this.datasetName = datasetName;
		this.projectId = projectId;
	}

	/**
	 * 
	 */
	public DatasetDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
