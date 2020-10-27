package iplleagueanalysis;

import com.opencsv.bean.CsvBindByName;

public class CSVMostRuns {

	@CsvBindByName(column = "PLAYER")
	public String Name;

	@CsvBindByName(column = "Mat")
	public String noOfMatches;

	@CsvBindByName(column = "Inns")
	public String noOfInnings;

	@CsvBindByName(column = "NO")
	public String noOfNotOut;

	@CsvBindByName(column = "Runs")
	public String runs;

	@CsvBindByName(column = "HS")
	public String highestScore;

	@CsvBindByName(column = "Avg")
	public String average;

	@CsvBindByName(column = "BF")
	public String ballsFaced;

	@CsvBindByName(column = "SR")
	public String strikeRate;

	@CsvBindByName(column = "100")
	public String century;

	@CsvBindByName(column = "50")
	public String halfCentury;

	@CsvBindByName(column = "4s")
	public String fours;

	@CsvBindByName(column = "6s")
	public String sixes;

	public CSVMostRuns() {

	}

	@Override
	public String toString() {
		return "CSVMostRuns [Name=" + Name + ", noOfMatches=" + noOfMatches + ", noOfInnings=" + noOfInnings
				+ ", noOfNotOut=" + noOfNotOut + ", runs=" + runs + ", highestScore=" + highestScore + ", average="
				+ average + ", ballsFaced=" + ballsFaced + ", strikeRate=" + strikeRate + ", century=" + century
				+ ", halfCentury=" + halfCentury + ", fours=" + fours + ", sixes=" + sixes + "]";
	}
	
}
