package com.test1;

public class CurrencyExchangeServiceMakerCheckers {
	private Integer localCurrencyCode;
	private Integer transactionFee;
	private Integer sequenceId;
	private String buySellvalue;
	private String groupName;
	private Integer makerChekerTypeCode;
	private String makerCheckerType;
	private String makerCheckerTypeDesc;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyExchangeServiceMakerCheckers() {

	}

	public CurrencyExchangeServiceMakerCheckers(Integer localCurrencyCode, Integer transactionFee, Integer sequenceId,
			String buySellvalue, String groupName, Integer makerChekerTypeCode, String makerCheckerType,
			String makerCheckerTypeDesc, String creationDate, String modifiedDate, String entityState) {
		super();
		this.localCurrencyCode = localCurrencyCode;
		this.transactionFee = transactionFee;
		this.sequenceId = sequenceId;
		this.buySellvalue = buySellvalue;
		this.groupName = groupName;
		this.makerChekerTypeCode = makerChekerTypeCode;
		this.makerCheckerType = makerCheckerType;
		this.makerCheckerTypeDesc = makerCheckerTypeDesc;
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

	public Integer getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(Integer transactionFee) {
		this.transactionFee = transactionFee;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getBuySellvalue() {
		return buySellvalue;
	}

	public void setBuySellvalue(String buySellvalue) {
		this.buySellvalue = buySellvalue;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getMakerChekerTypeCode() {
		return makerChekerTypeCode;
	}

	public void setMakerChekerTypeCode(Integer makerChekerTypeCode) {
		this.makerChekerTypeCode = makerChekerTypeCode;
	}

	public String getMakerCheckerType() {
		return makerCheckerType;
	}

	public void setMakerCheckerType(String makerCheckerType) {
		this.makerCheckerType = makerCheckerType;
	}

	public String getMakerCheckerTypeDesc() {
		return makerCheckerTypeDesc;
	}

	public void setMakerCheckerTypeDesc(String makerCheckerTypeDesc) {
		this.makerCheckerTypeDesc = makerCheckerTypeDesc;
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
