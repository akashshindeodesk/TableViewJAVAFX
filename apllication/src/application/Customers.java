package application;



//package com.humanit.sim.tab.customer.functionality.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Customers {
	
	

	private String CustomFieldVaue;

	private String creditAmount;
	private String debittAmount;

	private String trType;

	private String trNumber;
	private String trDate;
	private String sNo;

	@Override
	public String toString() {
		return "Customers [CustomFieldVaue=" + CustomFieldVaue + ", creditAmount=" + creditAmount + ", debittAmount="
				+ debittAmount + ", trType=" + trType + ", trNumber=" + trNumber + ", trDate=" + trDate + ", sNo=" + sNo
				+ ", text=" + text + ", transactionid=" + transactionid + ", trtoDate=" + trtoDate + ", totalDays="
				+ totalDays + ", quickAmount=" + quickAmount + ", paymentID=" + paymentID + ", customerType="
				+ customerType + ", paymentmode=" + paymentmode + ", totalAmount=" + totalAmount + ", amount=" + amount
				+ ", cadrAmount=" + cadrAmount + ", cardCommision=" + cardCommision + ", cardHName=" + cardHName
				+ ", cardRNumber=" + cardRNumber + ", cardBName=" + cardBName + ", chequeAmount=" + chequeAmount
				+ ", chequeNumber=" + chequeNumber + ", chequeRNumber=" + chequeRNumber + ", chequeBName=" + chequeBName
				+ ", chequeCommision=" + chequeCommision + ", netBankingAmount=" + netBankingAmount + ", nBNumber="
				+ nBNumber + ", nBRNumber=" + nBRNumber + ", nBCommision=" + nBCommision + ", fCAmount=" + fCAmount
				+ ", fCCommission=" + fCCommission + ", giftCardAmount=" + giftCardAmount + ", giftcardNumber="
				+ giftcardNumber + ", giftCardRNumber=" + giftCardRNumber + ", giftCardCommision=" + giftCardCommision
				+ ", giftCardBankName=" + giftCardBankName + ", totalCommission=" + totalCommission + ", status="
				+ status + ", indexvalue=" + indexvalue + ", debitaccount=" + debitaccount + ", pricelistname="
				+ pricelistname + ", debitAcountID=" + debitAcountID + ", creditAccountName=" + creditAccountName
				+ ", creditAccountID=" + creditAccountID + ", customerid=" + customerid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", place=" + place + ", vatnumber=" + vatnumber + ", cstnumber="
				+ cstnumber + ", tinnumber=" + tinnumber + ", pannumber=" + pannumber + ", performedid=" + performedid
				+ ", idtype=" + idtype + ", birthdate=" + birthdate + ", customergroup=" + customergroup
				+ ", salesexecutiveid=" + salesexecutiveid + ", customerImage=" + customerImage + ", shippingaddress1="
				+ shippingaddress1 + ", shippingaddress2=" + shippingaddress2 + ", shippingcity=" + shippingcity
				+ ", shippingstate=" + shippingstate + ", shippingzipcode=" + shippingzipcode
				+ ", shippingcontactnumber=" + shippingcontactnumber + ", shippingalternativenumber="
				+ shippingalternativenumber + ", shippingemailid=" + shippingemailid + ", billingaddress1="
				+ billingaddress1 + ", billingaddress2=" + billingaddress2 + ", billingcity=" + billingcity
				+ ", billingstate=" + billingstate + ", billingzipcode=" + billingzipcode + ", billingcontactnumber="
				+ billingcontactnumber + ", billingalternativenumber=" + billingalternativenumber + ", billingemailid="
				+ billingemailid + ", creditperiod=" + creditperiod + ", creditinterest=" + creditinterest
				+ ", debitlimit=" + debitlimit + ", debitperiod=" + debitperiod + ", debitinterest=" + debitinterest
				+ ", openingbalance=" + openingbalance + ", openingbalancetype=" + openingbalancetype
				+ ", openingbalancedate=" + openingbalancedate + ", surityname=" + surityname + ", suritycontactnumber="
				+ suritycontactnumber + ", surityaddress=" + surityaddress + ", customFieldID=" + customFieldID
				+ ", customfieldName=" + customfieldName + ", customfieldtype=" + customfieldtype
				+ ", CustomeFieldIndex=" + CustomeFieldIndex + ", PerformedOn=" + PerformedOn + ", PerformedBy="
				+ PerformedBy + ", outstandingAmount=" + outstandingAmount + ", loginname=" + loginname
				+ ", chequeDate=" + chequeDate + ", transactionStatus=" + transactionStatus + ", single=" + single
				+ ", Cc=" + Cc + ", Sno=" + Sno + ", CustomerName=" + CustomerName + ", Place=" + Place
				+ ", CustomerType=" + CustomerType + ", SalesRepresentative=" + SalesRepresentative
				+ ", OutstandingAmount=" + OutstandingAmount + ", CustomerId=" + CustomerId + ", CustomerImage="
				+ CustomerImage + ", TransactionDate=" + TransactionDate + ", TransactionType=" + TransactionType
				+ ", CreditAmount=" + CreditAmount + ", Amount=" + Amount + ", DebittAmount=" + DebittAmount
				+ ", TransactionNumber=" + TransactionNumber + ", Status=" + Status + ", TransactionStatus="
				+ TransactionStatus + ", IndexValue=" + IndexValue + ", CreditInterestAmount=" + CreditInterestAmount
				+ ", DebitInterestAmount=" + DebitInterestAmount + ", TransactionFromDate=" + TransactionFromDate
				+ ", TransactionToDate=" + TransactionToDate + ", TotalDays=" + TotalDays + ", CreditInterestRate="
				+ CreditInterestRate + ", DebitInterestRate=" + DebitInterestRate + ", OpeningBalance=" + OpeningBalance
				+ ", Debitlimit=" + Debitlimit + ", creditinterestrate=" + creditinterestrate + ", debitinterestrate="
				+ debitinterestrate + ", totalCommision=" + totalCommision + ", payDate=" + payDate
				+ ", paymenttypeAmount=" + paymenttypeAmount + ", cashAmount=" + cashAmount + ", paymentMode="
				+ paymentMode + "]";
	}

	private String text;

	private String transactionid;
	private String trtoDate;

	private long totalDays;

	private String quickAmount;
	private String paymentID;
	private String customerType;

	private int paymentmode;

	private String totalAmount;

	// CASH
	private String amount;
	// CARD

	private String cadrAmount;
	private String cardCommision;
	private String cardHName;
	private String cardRNumber;
	private String cardBName;

	// CHEQUE

	private String chequeAmount;
	private String chequeNumber;
	private String chequeRNumber;
	private String chequeBName;
	private String chequeCommision;

	// NET BANKING

	private String netBankingAmount;
	private String nBNumber;
	private String nBRNumber;
	private String nBCommision;

	// FOOD COUPON

	private String fCAmount;
	private String fCCommission;

	// GIFT CARD
	private String giftCardAmount;
	private String giftcardNumber;
	private String giftCardRNumber;
	private String giftCardCommision;
	private String giftCardBankName;

	private String totalCommission;

	private String status;
	private String indexvalue;

	private String debitaccount;
	private String pricelistname;

	private String debitAcountID;
	private String creditAccountName;
	private String creditAccountID;
	private String customerid;
	private String firstname;
	private String lastname;
	private String place;
	private String vatnumber;
	private String cstnumber;
	private String tinnumber;
	private String pannumber;
	private String performedid;
	private String idtype;
	private String birthdate;
	private String customergroup;
	private String salesexecutiveid;
	private String customerImage;

	private String shippingaddress1;
	private String shippingaddress2;
	private String shippingcity;
	private String shippingstate;
	private String shippingzipcode;
	private String shippingcontactnumber;
	private String shippingalternativenumber;
	private String shippingemailid;

	private String billingaddress1;
	private String billingaddress2;
	private String billingcity;
	private String billingstate;
	private String billingzipcode;
	private String billingcontactnumber;
	private String billingalternativenumber;
	private String billingemailid;

	private String creditperiod;
	private String creditinterest;
	private String debitlimit;
	private String debitperiod;
	private String debitinterest;
	private String openingbalance;
	private String openingbalancetype;
	private String openingbalancedate;

	private String surityname;
	private String suritycontactnumber;
	private String surityaddress;

	private String customFieldID;
	private String customfieldName;
	private String customfieldtype;
	private String CustomeFieldIndex;
	private String PerformedOn;
	private String PerformedBy;
	private String outstandingAmount;

	private String loginname;

	private String chequeDate;

	private String transactionStatus;

	private boolean single;

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public BooleanProperty Cc = new SimpleBooleanProperty(false);
	public BooleanProperty selectedProperty() {
         return Cc;
     }

     public void setSelected(boolean Cc) {
         this.Cc.set(Cc);
     }

     public boolean isSelected() {
         return Cc.get();
         
     }
     
	public Customers(String customerid, String firstname, String lastname,
			String place, String vatnumber, String cstnumber, String tinnumber,
			String pannumber, String performedid, String idtype,
			String birthdate, String customergroup, String salesexecutiveid,
			String customerImage, String shippingaddress1,
			String shippingaddress2, String shippingcity, String shippingstate,
			String shippingzipcode, String shippingcontactnumber,
			String shippingalternativenumber, String shippingemailid,
			String billingaddress1, String billingaddress2, String billingcity,
			String billingstate, String billingzipcode,
			String billingcontactnumber, String billingalternativenumber,
			String billingemailid, String creditperiod, String creditinterest,
			String debitlimit, String debitperiod, String debitinterest,
			String openingbalance, String openingbalancetype,
			String openingbalancedate, String surityname,
			String suritycontactnumber, String surityaddress,
			String customFieldID, String customfieldName,
			String customfieldtype, String customeFieldIndex,
			String performedOn, String performedBy, String outstandingAmount,
			String loginname, String chequeDate, String transactionStatus,
			boolean single, BooleanProperty cc, String paymentID,
			String customerType, int paymentmode, String totalAmount,
			String amount, String cadrAmount, String cardCommision,
			String cardHName, String cardRNumber, String cardBName,
			String chequeAmount, String chequeNumber, String chequeRNumber,
			String chequeBName, String chequeCommision,
			String netBankingAmount, String nBNumber, String nBRNumber,
			String nBCommision, String fCAmount, String fCCommission,
			String giftCardAmount, String giftcardNumber,
			String giftCardRNumber, String giftCardCommision,
			String giftCardBankName, String totalCommission, String status,
			String indexvalue, String debitaccount, String pricelistname,
			String debitAcountID, String creditAccountName,
			String creditAccountID, String totalCommision, String payDate,
			String paymenttypeAmount, String cashAmount, String paymentMode2) {
		super();
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.place = place;
		this.vatnumber = vatnumber;
		this.cstnumber = cstnumber;
		this.tinnumber = tinnumber;
		this.pannumber = pannumber;
		this.performedid = performedid;
		this.idtype = idtype;
		this.birthdate = birthdate;
		this.customergroup = customergroup;
		this.salesexecutiveid = salesexecutiveid;
		this.customerImage = customerImage;
		this.shippingaddress1 = shippingaddress1;
		this.shippingaddress2 = shippingaddress2;
		this.shippingcity = shippingcity;
		this.shippingstate = shippingstate;
		this.shippingzipcode = shippingzipcode;
		this.shippingcontactnumber = shippingcontactnumber;
		this.shippingalternativenumber = shippingalternativenumber;
		this.shippingemailid = shippingemailid;
		this.billingaddress1 = billingaddress1;
		this.billingaddress2 = billingaddress2;
		this.billingcity = billingcity;
		this.billingstate = billingstate;
		this.billingzipcode = billingzipcode;
		this.billingcontactnumber = billingcontactnumber;
		this.billingalternativenumber = billingalternativenumber;
		this.billingemailid = billingemailid;
		this.creditperiod = creditperiod;
		this.creditinterest = creditinterest;
		this.debitlimit = debitlimit;
		this.debitperiod = debitperiod;
		this.debitinterest = debitinterest;
		this.openingbalance = openingbalance;
		this.openingbalancetype = openingbalancetype;
		this.openingbalancedate = openingbalancedate;
		this.surityname = surityname;
		this.suritycontactnumber = suritycontactnumber;
		this.surityaddress = surityaddress;
		this.customFieldID = customFieldID;
		this.customfieldName = customfieldName;
		this.customfieldtype = customfieldtype;
		CustomeFieldIndex = customeFieldIndex;
		PerformedOn = performedOn;
		PerformedBy = performedBy;
		this.outstandingAmount = outstandingAmount;
		this.loginname = loginname;
		this.chequeDate = chequeDate;
		this.transactionStatus = transactionStatus;
		this.single = single;
		Cc = cc;
		this.paymentID = paymentID;
		this.customerType = customerType;
		this.paymentmode = paymentmode;
		this.totalAmount = totalAmount;
		this.amount = amount;
		this.cadrAmount = cadrAmount;
		this.cardCommision = cardCommision;
		this.cardHName = cardHName;
		this.cardRNumber = cardRNumber;
		this.cardBName = cardBName;
		this.chequeAmount = chequeAmount;
		this.chequeNumber = chequeNumber;
		this.chequeRNumber = chequeRNumber;
		this.chequeBName = chequeBName;
		this.chequeCommision = chequeCommision;
		this.netBankingAmount = netBankingAmount;
		this.nBNumber = nBNumber;
		this.nBRNumber = nBRNumber;
		this.nBCommision = nBCommision;
		this.fCAmount = fCAmount;
		this.fCCommission = fCCommission;
		this.giftCardAmount = giftCardAmount;
		this.giftcardNumber = giftcardNumber;
		this.giftCardRNumber = giftCardRNumber;
		this.giftCardCommision = giftCardCommision;
		this.giftCardBankName = giftCardBankName;
		this.totalCommission = totalCommission;
		this.status = status;
		this.indexvalue = indexvalue;
		this.debitaccount = debitaccount;
		this.pricelistname = pricelistname;
		this.debitAcountID = debitAcountID;
		this.creditAccountName = creditAccountName;
		this.creditAccountID = creditAccountID;
		this.totalCommision = totalCommision;
		this.payDate = payDate;
		this.paymenttypeAmount = paymenttypeAmount;
		this.cashAmount = cashAmount;
		paymentMode = paymentMode2;
	}

	public Customers() {
		super();
	}

	public SimpleStringProperty Sno = new SimpleStringProperty();
	public SimpleStringProperty CustomerName = new SimpleStringProperty();
	public SimpleStringProperty Place = new SimpleStringProperty();
	public SimpleStringProperty CustomerType = new SimpleStringProperty();
	public SimpleStringProperty SalesRepresentative = new SimpleStringProperty();
	public SimpleStringProperty OutstandingAmount = new SimpleStringProperty();
	public SimpleStringProperty CustomerId = new SimpleStringProperty();
	public SimpleStringProperty CustomerImage = new SimpleStringProperty();

	public SimpleStringProperty TransactionDate = new SimpleStringProperty();
	public SimpleStringProperty TransactionType = new SimpleStringProperty();
	public SimpleStringProperty CreditAmount = new SimpleStringProperty();
	public SimpleStringProperty Amount = new SimpleStringProperty();
	public SimpleStringProperty DebittAmount = new SimpleStringProperty();
	public SimpleStringProperty TransactionNumber = new SimpleStringProperty();
	public SimpleStringProperty Status = new SimpleStringProperty();
	public SimpleStringProperty TransactionStatus = new SimpleStringProperty();
	public SimpleStringProperty IndexValue = new SimpleStringProperty();

	public SimpleStringProperty CreditInterestAmount = new SimpleStringProperty();
	public SimpleStringProperty DebitInterestAmount = new SimpleStringProperty();
	public SimpleStringProperty TransactionFromDate = new SimpleStringProperty();
	public SimpleStringProperty TransactionToDate = new SimpleStringProperty();
	public SimpleStringProperty TotalDays = new SimpleStringProperty();
	public SimpleStringProperty CreditInterestRate = new SimpleStringProperty();
	public SimpleStringProperty DebitInterestRate = new SimpleStringProperty();
	public SimpleStringProperty OpeningBalance = new SimpleStringProperty();
	public SimpleStringProperty Debitlimit = new SimpleStringProperty();

	/* public SimpleBooleanProperty Cc = new SimpleBooleanProperty(); */

	public String getTransactionDate() {
		return TransactionDate.get();
	}

	public String getTransactionType() {
		return TransactionType.get();
	}

	public String getCreditAmount() {
		return CreditAmount.get();
	}

	public String getCustomerId() {
		return CustomerId.get();
	}

	public String getCustomerImage() {
		return CustomerImage.get();
	}

	public String getAmount() {
		return Amount.get();
	}

	public String getDebittAmount() {
		return DebittAmount.get();
	}

	public String getTransactionNumber() {
		return TransactionNumber.get();
	}

	public String getStatus() {
		return Status.get();
	}

	public String getTransactionStatus() {
		return TransactionStatus.get();
	}

	public String getIndexValue() {
		return IndexValue.get();
	}

	public String getCreditInterestAmount() {
		return CreditInterestAmount.get();
	}

	public String getDebitInterestAmount() {
		return DebitInterestAmount.get();
	}

	public String getTransactionToDate() {
		return TransactionToDate.get();
	}

	public String getTotalDays() {
		return TotalDays.get();
	}

	public String getTransactionFromDate() {
		return TransactionFromDate.get();
	}

	public String getCreditInterestRate() {
		return CreditInterestRate.get();
	}

	public String getDebitInterestRate() {
		return DebitInterestRate.get();
	}

	public String getOpeningBalance() {
		return OpeningBalance.get();
	}

	public String getDebitlimit() {
		return Debitlimit.get();
	}

	public String getOutstandingAmount() {
		return OutstandingAmount.get();
	}

	public String getSalesRepresentative() {
		return SalesRepresentative.get();
	}

	public String getCustomerType() {
		return CustomerType.get();
	}

	public String getPlace() {
		return Place.get();
	}

	public String getCustomerName() {
		return CustomerName.get();
	}

	public String getSno() {
		return Sno.get();
	}

	private String creditinterestrate;

	public String getCreditinterestrate() {
		return creditinterestrate;
	}

	public void setCreditinterestrate(String creditinterestrate) {
		this.creditinterestrate = creditinterestrate;
	}

	public String getDebitinterestrate() {
		return debitinterestrate;
	}

	public void setDebitinterestrate(String debitinterestrate) {
		this.debitinterestrate = debitinterestrate;
	}

	private String debitinterestrate;

	public String getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}

	public void setOutstandingAmount(String outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}


	public String getDebitAcountID() {
		return debitAcountID;
	}

	public void setDebitAcountID(String debitAcountID) {
		this.debitAcountID = debitAcountID;
	}

	public String getCreditAccountName() {
		return creditAccountName;
	}

	public void setCreditAccountName(String creditAccountName) {
		this.creditAccountName = creditAccountName;
	}

	public String getCreditAccountID() {
		return creditAccountID;
	}

	public void setCreditAccountID(String creditAccountID) {
		this.creditAccountID = creditAccountID;
	}

	public String getIndexvalue() {
		return indexvalue;
	}

	public void setIndexvalue(String indexvalue) {
		this.indexvalue = indexvalue;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalCommission() {
		return totalCommission;
	}

	public void setTotalCommission(String totalCommission) {
		this.totalCommission = totalCommission;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCadrAmount() {
		return cadrAmount;
	}

	public void setCadrAmount(String cadrAmount) {
		this.cadrAmount = cadrAmount;
	}

	public String getCardCommision() {
		return cardCommision;
	}

	public void setCardCommision(String cardCommision) {
		this.cardCommision = cardCommision;
	}

	public String getCardHName() {
		return cardHName;
	}

	public void setCardHName(String cardHName) {
		this.cardHName = cardHName;
	}

	public String getCardRNumber() {
		return cardRNumber;
	}

	public void setCardRNumber(String cardRNumber) {
		this.cardRNumber = cardRNumber;
	}

	public String getCardBName() {
		return cardBName;
	}

	public void setCardBName(String cardBName) {
		this.cardBName = cardBName;
	}

	public String getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(String chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequeRNumber() {
		return chequeRNumber;
	}

	public void setChequeRNumber(String chequeRNumber) {
		this.chequeRNumber = chequeRNumber;
	}

	public String getChequeBName() {
		return chequeBName;
	}

	public void setChequeBName(String chequeBName) {
		this.chequeBName = chequeBName;
	}

	public String getChequeCommision() {
		return chequeCommision;
	}

	public void setChequeCommision(String chequeCommision) {
		this.chequeCommision = chequeCommision;
	}

	public String getNetBankingAmount() {
		return netBankingAmount;
	}

	public void setNetBankingAmount(String netBankingAmount) {
		this.netBankingAmount = netBankingAmount;
	}

	public String getnBNumber() {
		return nBNumber;
	}

	public void setnBNumber(String nBNumber) {
		this.nBNumber = nBNumber;
	}

	public String getnBRNumber() {
		return nBRNumber;
	}

	public void setnBRNumber(String nBRNumber) {
		this.nBRNumber = nBRNumber;
	}

	public String getnBCommision() {
		return nBCommision;
	}

	public void setnBCommision(String nBCommision) {
		this.nBCommision = nBCommision;
	}

	public String getfCAmount() {
		return fCAmount;
	}

	public void setfCAmount(String fCAmount) {
		this.fCAmount = fCAmount;
	}

	public String getfCCommission() {
		return fCCommission;
	}

	public void setfCCommission(String fCCommission) {
		this.fCCommission = fCCommission;
	}

	public String getGiftCardAmount() {
		return giftCardAmount;
	}

	public void setGiftCardAmount(String giftCardAmount) {
		this.giftCardAmount = giftCardAmount;
	}

	public String getGiftcardNumber() {
		return giftcardNumber;
	}

	public void setGiftcardNumber(String giftcardNumber) {
		this.giftcardNumber = giftcardNumber;
	}

	public String getGiftCardRNumber() {
		return giftCardRNumber;
	}

	public void setGiftCardRNumber(String giftCardRNumber) {
		this.giftCardRNumber = giftCardRNumber;
	}

	public String getGiftCardCommision() {
		return giftCardCommision;
	}

	public void setGiftCardCommision(String giftCardCommision) {
		this.giftCardCommision = giftCardCommision;
	}

	public String getGiftCardBankName() {
		return giftCardBankName;
	}

	public void setGiftCardBankName(String giftCardBankName) {
		this.giftCardBankName = giftCardBankName;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(int paymentmode) {
		this.paymentmode = paymentmode;
	}

	public void setDebittAmount(String debittAmount) {
		if (debittAmount.equals(""))
			debittAmount = "0";
		this.debittAmount = debittAmount;
	}

	public String getTrType() {
		return trType;
	}

	public void setTrType(String trType) {
		this.trType = trType;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public String getTrDate() {
		return trDate;
	}

	public void setTrDate(String trDate) {
		this.trDate = trDate;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public String getTrtoDate() {
		return trtoDate;
	}

	public void setTrtoDate(String trtoDate) {
		this.trtoDate = trtoDate;
	}

	public void setTotalDays(long totalDays) {
		this.totalDays = totalDays;
	}

	public String getQuickAmount() {
		return quickAmount;
	}

	public void setQuickAmount(String quickAmount) {
		this.quickAmount = quickAmount;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getTotalCommision() {
		return totalCommision;
	}

	public void setTotalCommision(String totalCommision) {
		this.totalCommision = totalCommision;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPaymenttypeAmount() {
		return paymenttypeAmount;
	}

	public void setPaymenttypeAmount(String paymenttypeAmount) {
		this.paymenttypeAmount = paymenttypeAmount;
	}

	public String getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(String cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	private String totalCommision;
	private String payDate;
	private String paymenttypeAmount;
	private String cashAmount;
	private String paymentMode;

	public String getCustomFieldVaue() {
		return CustomFieldVaue;
	}

	public void setCustomFieldVaue(String customFieldVaue) {
		CustomFieldVaue = customFieldVaue;
	}

	public String getCustomFieldID() {
		return customFieldID;
	}

	public void setCustomFieldID(String customFieldID) {
		this.customFieldID = customFieldID;
	}

	public String getCustomfieldName() {
		return customfieldName;
	}

	public void setCustomfieldName(String customfieldName) {
		this.customfieldName = customfieldName;
	}

	public String getCustomfieldtype() {
		return customfieldtype;
	}

	public void setCustomfieldtype(String customfieldtype) {
		this.customfieldtype = customfieldtype;
	}

	public String getCustomeFieldIndex() {
		return CustomeFieldIndex;
	}

	public void setCustomeFieldIndex(String customeFieldIndex) {
		CustomeFieldIndex = customeFieldIndex;
	}

	public String getPerformedOn() {
		return PerformedOn;
	}

	public void setPerformedOn(String performedOn) {
		PerformedOn = performedOn;
	}

	public String getPerformedBy() {
		return PerformedBy;
	}

	public void setPerformedBy(String performedBy) {
		PerformedBy = performedBy;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getVatnumber() {
		return vatnumber;
	}

	public void setVatnumber(String vatnumber) {
		this.vatnumber = vatnumber;
	}

	public String getCstnumber() {
		return cstnumber;
	}

	public void setCstnumber(String cstnumber) {
		this.cstnumber = cstnumber;
	}

	public String getTinnumber() {
		return tinnumber;
	}

	public void setTinnumber(String tinnumber) {
		this.tinnumber = tinnumber;
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getPerformedid() {
		return performedid;
	}

	public void setPerformedid(String performedid) {
		this.performedid = performedid;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getCustomergroup() {
		return customergroup;
	}

	public void setCustomergroup(String customergroup) {
		if (customergroup.isEmpty())
			customergroup = "";
		this.customergroup = customergroup;
	}

	public String getShippingaddress1() {
		return shippingaddress1;
	}

	public void setShippingaddress1(String shippingaddress1) {
		this.shippingaddress1 = shippingaddress1;
	}

	public String getShippingaddress2() {
		return shippingaddress2;
	}

	public void setShippingaddress2(String shippingaddress2) {
		this.shippingaddress2 = shippingaddress2;
	}

	public String getShippingcity() {
		return shippingcity;
	}

	public void setShippingcity(String shippingcity) {
		this.shippingcity = shippingcity;
	}

	public String getShippingstate() {
		return shippingstate;
	}

	public void setShippingstate(String shippingstate) {
		this.shippingstate = shippingstate;
	}

	public String getShippingzipcode() {
		return shippingzipcode;
	}

	public void setShippingzipcode(String shippingzipcode) {
		this.shippingzipcode = shippingzipcode;
	}

	public String getShippingcontactnumber() {
		return shippingcontactnumber;
	}

	public void setShippingcontactnumber(String shippingcontactnumber) {
		this.shippingcontactnumber = shippingcontactnumber;
	}

	public String getShippingalternativenumber() {
		return shippingalternativenumber;
	}

	public void setShippingalternativenumber(String shippingalternativenumber) {
		this.shippingalternativenumber = shippingalternativenumber;
	}

	public String getShippingemailid() {
		return shippingemailid;
	}

	public void setShippingemailid(String shippingemailid) {
		this.shippingemailid = shippingemailid;
	}

	public String getBillingaddress1() {
		return billingaddress1;
	}

	public void setBillingaddress1(String billingaddress1) {
		this.billingaddress1 = billingaddress1;
	}

	public String getBillingaddress2() {
		return billingaddress2;
	}

	public void setBillingaddress2(String billingaddress2) {
		this.billingaddress2 = billingaddress2;
	}

	public String getBillingcity() {
		return billingcity;
	}

	public void setBillingcity(String billingcity) {
		this.billingcity = billingcity;
	}

	public String getBillingstate() {
		return billingstate;
	}

	public void setBillingstate(String billingstate) {
		this.billingstate = billingstate;
	}

	public String getBillingzipcode() {
		return billingzipcode;
	}

	public void setBillingzipcode(String billingzipcode) {
		this.billingzipcode = billingzipcode;
	}

	public String getBillingcontactnumber() {
		return billingcontactnumber;
	}

	public void setBillingcontactnumber(String billingcontactnumber) {
		this.billingcontactnumber = billingcontactnumber;
	}

	public String getBillingalternativenumber() {
		return billingalternativenumber;
	}

	public void setBillingalternativenumber(String billingalternativenumber) {
		this.billingalternativenumber = billingalternativenumber;
	}

	public String getBillingemailid() {
		return billingemailid;
	}

	public void setBillingemailid(String billingemailid) {
		this.billingemailid = billingemailid;
	}

	public String getCreditperiod() {
		return creditperiod;
	}

	public void setCreditperiod(String creditperiod) {
		if (creditperiod.isEmpty())
			creditperiod = "0";
		this.creditperiod = creditperiod;
	}

	public String getCreditinterest() {
		return creditinterest;
	}

	public void setCreditinterest(String creditinterest) {
		if (creditinterest.isEmpty())
			creditinterest = "0";
		this.creditinterest = creditinterest;
	}

	public void setDebitlimit(String debitlimit) {
		if (debitlimit.equals(""))
			debitlimit = "0";
		this.debitlimit = debitlimit;
	}

	public String getDebitperiod() {
		return debitperiod;
	}

	public void setDebitperiod(String debitperiod) {
		if (debitperiod.isEmpty())
			debitperiod = "0";
		this.debitperiod = debitperiod;
	}

	public String getDebitinterest() {
		return debitinterest;
	}

	public void setDebitinterest(String debitinterest) {
		if (debitinterest.isEmpty())
			debitinterest = "0";
		this.debitinterest = debitinterest;
	}

	public String getOpeningbalance() {
		return openingbalance;
	}

	public void setOpeningbalance(String openingbalance) {
		if (openingbalance.isEmpty())
			openingbalance = "0";
		this.openingbalance = openingbalance;
	}

	public String getOpeningbalancetype() {
		return openingbalancetype;
	}

	public void setOpeningbalancetype(String openingbalancetype) {
		if (openingbalancetype.equals(""))
			openingbalancetype = "Debit";
		this.openingbalancetype = openingbalancetype;
	}

	public String getOpeningbalancedate() {
		return openingbalancedate;
	}

	public void setOpeningbalancedate(String openingbalancedate) {
		this.openingbalancedate = openingbalancedate;
	}

	public String getSalesexecutiveid() {
		return salesexecutiveid;
	}

	public void setSalesexecutiveid(String salesexecutiveid) {
		this.salesexecutiveid = salesexecutiveid;
	}

	public String getSurityname() {
		return surityname;
	}

	public void setSurityname(String surityname) {
		this.surityname = surityname;
	}

	public String getSuritycontactnumber() {
		return suritycontactnumber;
	}

	public void setSuritycontactnumber(String suritycontactnumber) {
		this.suritycontactnumber = suritycontactnumber;
	}

	public String getSurityaddress() {
		return surityaddress;
	}

	public void setSurityaddress(String surityaddress) {
		this.surityaddress = surityaddress;
	}

	public void setCustomerImage(String customerImage) {
		this.customerImage = customerImage;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getDebitaccount() {
		return debitaccount;
	}

	public void setDebitaccount(String debitaccount) {
		this.debitaccount = debitaccount;
	}

	public String getPricelistname() {
		return pricelistname;
	}

	public void setPricelistname(String pricelistname) {
		this.pricelistname = pricelistname;
	}
}
