package com.test1;

public class CurrencyExchangeService {
	private Integer localCurrencyCode;
	private Integer exchangeRateEffective;
	private String exchangeRateEffectiveDate;
	private String exchangeRateLocalCurrencyDesc;
	private String exchangeRateLocalCurrencyShortDesc;
	private Integer exchangeRateDecimalPositions;
	private String exchangeRateLocalCurrencySymbol;
	private String exchangeRateLocalCurrencyScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyExchangeService() {

	}

	public CurrencyExchangeService(Integer localCurrencyCode, Integer exchangeRateEffective,
			String exchangeRateEffectiveDate, String exchangeRateLocalCurrencyDesc,
			String exchangeRateLocalCurrencyShortDesc, Integer exchangeRateDecimalPositions,
			String exchangeRateLocalCurrencySymbol, String exchangeRateLocalCurrencyScale, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.localCurrencyCode = localCurrencyCode;
		this.exchangeRateEffective = exchangeRateEffective;
		this.exchangeRateEffectiveDate = exchangeRateEffectiveDate;
		this.exchangeRateLocalCurrencyDesc = exchangeRateLocalCurrencyDesc;
		this.exchangeRateLocalCurrencyShortDesc = exchangeRateLocalCurrencyShortDesc;
		this.exchangeRateDecimalPositions = exchangeRateDecimalPositions;
		this.exchangeRateLocalCurrencySymbol = exchangeRateLocalCurrencySymbol;
		this.exchangeRateLocalCurrencyScale = exchangeRateLocalCurrencyScale;
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

	public Integer getExchangeRateEffective() {
		return exchangeRateEffective;
	}

	public void setExchangeRateEffective(Integer exchangeRateEffective) {
		this.exchangeRateEffective = exchangeRateEffective;
	}

	public String getExchangeRateEffectiveDate() {
		return exchangeRateEffectiveDate;
	}

	public void setExchangeRateEffectiveDate(String exchangeRateEffectiveDate) {
		this.exchangeRateEffectiveDate = exchangeRateEffectiveDate;
	}

	public String getExchangeRateLocalCurrencyDesc() {
		return exchangeRateLocalCurrencyDesc;
	}

	public void setExchangeRateLocalCurrencyDesc(String exchangeRateLocalCurrencyDesc) {
		this.exchangeRateLocalCurrencyDesc = exchangeRateLocalCurrencyDesc;
	}

	public String getExchangeRateLocalCurrencyShortDesc() {
		return exchangeRateLocalCurrencyShortDesc;
	}

	public void setExchangeRateLocalCurrencyShortDesc(String exchangeRateLocalCurrencyShortDesc) {
		this.exchangeRateLocalCurrencyShortDesc = exchangeRateLocalCurrencyShortDesc;
	}

	public Integer getExchangeRateDecimalPositions() {
		return exchangeRateDecimalPositions;
	}

	public void setExchangeRateDecimalPositions(Integer exchangeRateDecimalPositions) {
		this.exchangeRateDecimalPositions = exchangeRateDecimalPositions;
	}

	public String getExchangeRateLocalCurrencySymbol() {
		return exchangeRateLocalCurrencySymbol;
	}

	public void setExchangeRateLocalCurrencySymbol(String exchangeRateLocalCurrencySymbol) {
		this.exchangeRateLocalCurrencySymbol = exchangeRateLocalCurrencySymbol;
	}

	public String getExchangeRateLocalCurrencyScale() {
		return exchangeRateLocalCurrencyScale;
	}

	public void setExchangeRateLocalCurrencyScale(String exchangeRateLocalCurrencyScale) {
		this.exchangeRateLocalCurrencyScale = exchangeRateLocalCurrencyScale;
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
