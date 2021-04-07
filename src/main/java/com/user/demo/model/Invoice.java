package com.user.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="invoice_detail")
public class Invoice {

	@Id
	@Column(name = "invoiceId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer invoiceId;
	
	@Column(name = "invoice_no", length = 20)
	private String invoiceNO;
	
	@Column(name = "invtotal", columnDefinition = "Decimal(8,2) default '0.00'")
	private Double invTotal;
	
	@Column(name = "bill_type", length = 10)
	private String billType;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bill_date", nullable = false)
	private Date billDate;

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceNO() {
		return invoiceNO;
	}

	public void setInvoiceNO(String invoiceNO) {
		this.invoiceNO = invoiceNO;
	}

	public Double getInvTotal() {
		return invTotal;
	}

	public void setInvTotal(Double invTotal) {
		this.invTotal = invTotal;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceNO=" + invoiceNO + ", invTotal=" + invTotal + ", billType="
				+ billType + ", billDate=" + billDate + "]";
	}

}
