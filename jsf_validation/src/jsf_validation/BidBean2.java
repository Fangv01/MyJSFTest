package jsf_validation;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BidBean2 {
	private String userID;
	private String keyword;
	private double bidAmount;
	private Integer bidDuration;
	public BidBean2() {
		// TODO Auto-generated constructor stub
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public double getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}
	public Integer getBidDuration() {
		return bidDuration;
	}
	public void setBidDuration(Integer bidDuration) {
		this.bidDuration = bidDuration;
	}
	public String doBid() {
		return "show-bid2";
	}
}
