package com.withme.vo;

import java.sql.Date;

import com.withme.vo.PartylistVO;
public class PartylistVO {
	
	private String party_title;
	private String u_id;
	private Date p_date;
	private int party_id;
	
	//pick목록 추가, 제거기능을 위해 추가함.
	private int png_chk;
   	
	

	public String getParty_title() {
		return party_title;
	}
	public void setParty_title(String party_title) {
		this.party_title = party_title;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}

	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
	
	//pick목록 추가, 제거기능을 위해 추가함.

	public int getPng_chk() {
		return png_chk;
	}
	public void setPng_chk(int png_chk) {
		this.png_chk = png_chk;
	}

	
	@Override
	public String toString() {
		return "PartylistVO [party_title=" + party_title +
				", u_id=" + u_id +", p_date=" + p_date +", party_id=" + party_id +"]";
	}
}
