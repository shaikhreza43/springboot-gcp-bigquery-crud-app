/**
 * 
 */
package com.gcp.bigquery.crud.app.service;

import com.gcp.bigquery.crud.app.common.Document;
import com.gcp.bigquery.crud.app.dto.DatasetDto;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@SuppressWarnings("rawtypes")
public interface DatasetService {

	Document createDataset(DatasetDto datasetDto);

}
