/*
 * Copyright (C) Mathieu Champlon, Tout droits réservés 
 *  
 *  
 */
package com.dust.mobile.entities;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

/**
 * The persistent class for the simcards database table.
 * Java Bean Object Serializable
 * 
 */
@Entity
@Table(name="simcards")
@NamedQuery(name="Simcard.findAll", query="SELECT s FROM Simcard s")
public class Simcard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String iccid;

	private String accessPointName;

	@Temporal(TemporalType.DATE)
	private Date creationDate;

	private String IPAddr;

	private String msisdn;

	/**
	 * @param iccid
	 * @param accessPointName
	 * @param creationDate
	 * @param iPAddr
	 * @param msisdn
	 * @param pINCode
	 * @param pUKCode
	 * @param status
	 * @param tag
	 */
	public Simcard(String iccid, String accessPointName, Date creationDate, String iPAddr, String msisdn,
			String pINCode, String pUKCode, String status, String tag) {
		super();
		this.iccid = iccid;
		this.accessPointName = accessPointName;
		this.creationDate = creationDate;
		IPAddr = iPAddr;
		this.msisdn = msisdn;
		PINCode = pINCode;
		PUKCode = pUKCode;
		this.status = status;
		this.tag = tag;
	}

	private String PINCode;

	private String PUKCode;

	private String status;

	private String tag;

	/**
	 * 
	 */

	public Simcard() {
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getAccessPointName() {
		return this.accessPointName;
	}

	public void setAccessPointName(String accessPointName) {
		this.accessPointName = accessPointName;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getIPAddr() {
		return this.IPAddr;
	}

	public void setIPAddr(String IPAddr) {
		this.IPAddr = IPAddr;
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getPINCode() {
		return this.PINCode;
	}

	public void setPINCode(String PINCode) {
		this.PINCode = PINCode;
	}

	public String getPUKCode() {
		return this.PUKCode;
	}

	public void setPUKCode(String PUKCode) {
		this.PUKCode = PUKCode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}