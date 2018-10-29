package com.elemeHelper.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LogPromotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logRedpacketId;
	private String phone;
	private String name;
	private String amount;
	private String sum_condition;
	private String validity_periods;
	private int type;
	private Date createDate;
	private Long creatorId;
	private int datalevel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogRedpacketId() {
		return logRedpacketId;
	}
	public void setLogRedpacketId(String logRedpacketId) {
		this.logRedpacketId = logRedpacketId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSum_condition() {
		return sum_condition;
	}
	public void setSum_condition(String sum_condition) {
		this.sum_condition = sum_condition;
	}
	public String getValidity_periods() {
		return validity_periods;
	}
	public void setValidity_periods(String validity_periods) {
		this.validity_periods = validity_periods;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
	public int getDatalevel() {
		return datalevel;
	}
	public void setDatalevel(int datalevel) {
		this.datalevel = datalevel;
	}
	
	

}
