package com.naver.dbsxodud01.csvParseSample1;

import java.util.stream.Collectors;

public class CSVParseSampleCore {

	public static void main(String[] args) throws Exception
	{
		EQDataLoader loader = new EQDataLoader();
		loader.storeData(CSVParseSampleCore.class.getResourceAsStream("/sample.csv"));
		String result = loader.getData().stream().map(d -> d.toString()).collect(Collectors.joining("\n"));
		System.out.println(result);
	}
}
