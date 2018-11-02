package com.ibm.developer.batchprocessor;

import org.springframework.batch.item.ItemProcessor;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONProcessor implements ItemProcessor<FootballPlayRecord, FootballPlayRecord> {
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public FootballPlayRecord process(FootballPlayRecord item) throws Exception {
		String jsonString = mapper.writeValueAsString(item);

		System.out.println(jsonString);
		return item;
	}

}
