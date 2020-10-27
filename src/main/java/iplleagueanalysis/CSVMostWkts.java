package iplleagueanalysis;

import com.opencsv.bean.CsvBindByName;

public class CSVMostWkts {

	@CsvBindByName(column = "PLAYER")
	public String Name;

	@CsvBindByName(column = "Mat")
	public String noOfMatches;

	@CsvBindByName(column = "Inns")
	public String noOfInnings;

	@CsvBindByName(column = "Ov")
	public String overs;

	@CsvBindByName(column = "Runs")
	public String runs;

	@CsvBindByName(column = "Wkts")
	public String wickets;

	@CsvBindByName(column = "BBI")
	public String bestBowlingInInnings;

	@CsvBindByName(column = "Avg")
	public String average;

	@CsvBindByName(column = "Econ")
	public String economyRate;

	@CsvBindByName(column = "SR")
	public String strikeRate;

	@CsvBindByName(column = "4w")
	public String fourWicketsInInnings;

	@CsvBindByName(column = "5w")
	public String fiveWicketsInInnings;

	@CsvBindByName(column = "6s")
	public String sixes;

	public CSVMostWkts() {

	}

	@Override
	public String toString() {
		return "CSVMostWkts [Name=" + Name + ", noOfMatches=" + noOfMatches + ", noOfInnings=" + noOfInnings
				+ ", overs=" + overs + ", runs=" + runs + ", wickets=" + wickets + ", bestBowlingInInnings="
				+ bestBowlingInInnings + ", average=" + average + ", economyRate=" + economyRate + ", strikeRate="
				+ strikeRate + ", fourWicketsInInnings=" + fourWicketsInInnings + ", fiveWicketsInInnings="
				+ fiveWicketsInInnings + ", sixes=" + sixes + "]";
	}

}
