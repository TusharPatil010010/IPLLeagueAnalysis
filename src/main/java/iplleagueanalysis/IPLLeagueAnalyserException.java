package iplleagueanalysis;


public class IPLLeagueAnalyserException extends Exception {

	public enum ExceptionType {
		NO_FILE, INCORRECT_FILE, UNABLE_TO_PARSE, NO_CENSUS_DATA
	}

	public ExceptionType type;

	public IPLLeagueAnalyserException(String message, ExceptionType type) {
		super();
		this.type = type;
	}
}
