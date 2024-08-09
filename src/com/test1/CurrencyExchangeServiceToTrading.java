package com.test1;

public class CurrencyExchangeServiceToTrading {
	private Integer localCurrencyCode;
	private Integer amountToBeConverted;
	private Integer sourceCurrency;
	private String targetCountry;
	private Integer targetCurrency;
	private boolean billerCode;
	private boolean isValidNomination;
	private String unitName;
	private String exchangeRatedataCustodianMappingId;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyExchangeServiceToTrading() {

	}

	public CurrencyExchangeServiceToTrading(Integer localCurrencyCode, Integer amountToBeConverted,
			Integer sourceCurrency, String targetCountry, Integer targetCurrency, boolean billerCode,
			boolean isValidNomination, String unitName, String exchangeRatedataCustodianMappingId, String creationCr,
			String modifiedCr, String creationDate, String modifiedDate, String entityState) {
		super();
		this.localCurrencyCode = localCurrencyCode;
		this.amountToBeConverted = amountToBeConverted;
		this.sourceCurrency = sourceCurrency;
		this.targetCountry = targetCountry;
		this.targetCurrency = targetCurrency;
		this.billerCode = billerCode;
		this.isValidNomination = isValidNomination;
		this.unitName = unitName;
		this.exchangeRatedataCustodianMappingId = exchangeRatedataCustodianMappingId;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getLocalCurrencyCode() {
		return localCurrencyCode;
	}

	public void setLocalCurrencyCode(Integer localCurrencyCode) {
		this.localCurrencyCode = localCurrencyCode;
	}

	public Integer getAmountToBeConverted() {
		return amountToBeConverted;
	}

	public void setAmountToBeConverted(Integer amountToBeConverted) {
		this.amountToBeConverted = amountToBeConverted;
	}

	public Integer getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(Integer sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public String getTargetCountry() {
		return targetCountry;
	}

	public void setTargetCountry(String targetCountry) {
		this.targetCountry = targetCountry;
	}

	public Integer getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(Integer targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public boolean isBillerCode() {
		return billerCode;
	}

	public void setBillerCode(boolean billerCode) {
		this.billerCode = billerCode;
	}

	public boolean isValidNomination() {
		return isValidNomination;
	}

	public void setValidNomination(boolean isValidNomination) {
		this.isValidNomination = isValidNomination;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getExchangeRatedataCustodianMappingId() {
		return exchangeRatedataCustodianMappingId;
	}

	public void setExchangeRatedataCustodianMappingId(String exchangeRatedataCustodianMappingId) {
		this.exchangeRatedataCustodianMappingId = exchangeRatedataCustodianMappingId;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
