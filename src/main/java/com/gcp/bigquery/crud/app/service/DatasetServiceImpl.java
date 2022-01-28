/**
 * 
 */
package com.gcp.bigquery.crud.app.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.gcp.bigquery.crud.app.common.Document;
import com.gcp.bigquery.crud.app.dto.DatasetDto;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetInfo;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Service
@SuppressWarnings("rawtypes")
public class DatasetServiceImpl implements DatasetService {

	@SuppressWarnings({ "unchecked", "static-access" })
	@Override
	public Document createDataset(DatasetDto datasetDto) {

		Document doc = new Document();

		try {

			BigQuery bigquery = BigQueryOptions.newBuilder().setProjectId(datasetDto.getProjectId()).build()
					.getDefaultInstance().getService();

			DatasetInfo datasetInfo = DatasetInfo.newBuilder(datasetDto.getProjectId(), datasetDto.getDatasetName())
					.build();

			Dataset newDataset = bigquery.create(datasetInfo);
			String newDatasetName = newDataset.getDatasetId().getDataset();
			System.out.println(newDatasetName + " created successfully");

			doc.setData(newDatasetName);
			doc.setMessage("Dataset Created Successfully");
			doc.setStatusCode(201);

		} catch (Exception ex) {
			doc.setData(ex.getStackTrace());
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

}
