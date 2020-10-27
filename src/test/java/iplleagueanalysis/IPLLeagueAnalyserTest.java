package iplleagueanalysis;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.csvbuildernew.CSVBuilderException;

public class IPLLeagueAnalyserTest {
	private static final String MOST_RUNS_CSV = "C:\\Users\\LENOVO\\eclipse-workspace\\iplleagueanalysis\\src\\main\\resources\\IPL2019MostRuns.csv";
	private static final String MOST_WKTS_CSV = "C:\\Users\\LENOVO\\eclipse-workspace\\iplleagueanalysis\\src\\main\\resources\\IPL2019MostWkts.csv";

	/**
	 * Most runs csv tests
	 * 
	 * @throws IOException
	 * @throws CSVBuilderException
	 */
	@Test
	public void givenCSVFileMostRuns_IfMatchNumberOfRecords_ShouldReturnTrue() throws IOException, CSVBuilderException {
		IPLLeagueAnalyser analyser = new IPLLeagueAnalyser();
		int count = 1;
		try {
			count = analyser.loadMostRunsCSV(MOST_RUNS_CSV);
		} catch (IPLLeagueAnalyserException e) {
			e.printStackTrace();
		}
		assertEquals(100, count - 1);
	}

	/**
	 * Most wkts csv tests
	 * 
	 * @throws IOException
	 * @throws CSVBuilderException
	 */
	@Test
	public void givenCSVFileMostWkts_IfMatchNumberOfRecords_ShouldReturnTrue() throws IOException, CSVBuilderException {
		IPLLeagueAnalyser analyser = new IPLLeagueAnalyser();
		int count = 1;
		try {
			count = analyser.loadMostWktsCSV(MOST_WKTS_CSV);
		} catch (IPLLeagueAnalyserException e) {
			e.printStackTrace();
		}
		assertEquals(100, count - 1);
	}
}
