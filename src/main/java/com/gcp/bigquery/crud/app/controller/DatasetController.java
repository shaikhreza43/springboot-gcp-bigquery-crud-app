/**
 * 
 */
package com.gcp.bigquery.crud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.bigquery.crud.app.common.Document;
import com.gcp.bigquery.crud.app.dto.DatasetDto;
import com.gcp.bigquery.crud.app.service.DatasetService;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@RestController
@RequestMapping("/api/v1/gcp/bigquery")
@SuppressWarnings("rawtypes")
public class DatasetController {

	@Autowired
	private DatasetService datasetService;

	@PostMapping("/create-dataset")
	public ResponseEntity<Document> createDataset(@RequestBody DatasetDto datasetDto) {

		Document response = datasetService.createDataset(datasetDto);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
}
