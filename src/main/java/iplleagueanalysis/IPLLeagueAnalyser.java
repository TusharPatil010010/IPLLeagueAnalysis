package iplleagueanalysis;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

import com.csvbuildernew.CSVBuilderException;
import com.csvbuildernew.CSVBuilderFactory;
import com.csvbuildernew.ICSVBuilder;

public class IPLLeagueAnalyser {

	List<CSVMostRuns> mostRunsCSVList = null;
	List<CSVMostWkts> mostWktsCSVList = null;

	public int loadMostRunsCSV(String csvFile) throws IPLLeagueAnalyserException, IOException, CSVBuilderException {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFile));
			@SuppressWarnings("unchecked")
			ICSVBuilder<CSVMostRuns> csvBuilder = CSVBuilderFactory.createCSVBuilder();
			mostRunsCSVList = csvBuilder.getCSVFileList(reader, CSVMostRuns.class);
			return mostRunsCSVList.size();
		} catch (RuntimeException e) {
			throw new IPLLeagueAnalyserException(e.getMessage(),
					IPLLeagueAnalyserException.ExceptionType.INCORRECT_FILE);
		} catch (NoSuchFileException e) {
			throw new IPLLeagueAnalyserException(e.getMessage(), IPLLeagueAnalyserException.ExceptionType.NO_FILE);
		}
	}

	public int loadMostWktsCSV(String csvFile) throws IPLLeagueAnalyserException, IOException, CSVBuilderException {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFile));
			@SuppressWarnings("unchecked")
			ICSVBuilder<CSVMostWkts> csvBuilder = CSVBuilderFactory.createCSVBuilder();
			mostWktsCSVList = csvBuilder.getCSVFileList(reader, CSVMostWkts.class);
			return mostWktsCSVList.size();
		} catch (RuntimeException e) {
			throw new IPLLeagueAnalyserException(e.getMessage(),
					IPLLeagueAnalyserException.ExceptionType.INCORRECT_FILE);
		} catch (NoSuchFileException e) {
			throw new IPLLeagueAnalyserException(e.getMessage(), IPLLeagueAnalyserException.ExceptionType.NO_FILE);
		}
	}

}
