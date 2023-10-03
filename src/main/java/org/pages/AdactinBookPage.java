package org.pages;

import org.utility.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookPage extends BaseClass {
	public AdactinBookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="first_name")
	private WebElement txtFirstname;
	
	@FindBy(name="last_name")
	private WebElement txtLastname;
	
	@FindBy(name="address")
	private WebElement txtaddress;
	
	@FindBy(name="cc_num")
	private WebElement txtcreditNo;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvno;
	
	@FindBy(id="book_now")
	private WebElement btnBook;
	
	@FindBy(xpath="//input[@id='gst']")
    private WebElement gst;
	
	@FindBy(xpath="//option[@value='VISA']")
	private WebElement selectCard;//2
	
	@FindBy(xpath="//option[@value='3']")//3
	private WebElement selectmonth;
	
	@FindBy(xpath="//option[@value='2014']")//4
	private WebElement selectYear;
	
public WebElement getSelectCard() {
		return selectCard;
	}

public WebElement getSelectmonth() {
	return selectmonth;
}

public void setSelectmonth(WebElement selectmonth) {
	this.selectmonth = selectmonth;
}



public WebElement getSelectYear() {
	return selectYear;
}



public void setSelectYear(WebElement selectYear) {
	this.selectYear = selectYear;
}



public WebElement getGst() {
		
		return gst;
	}

	public void setGst(WebElement gst) {
		this.gst = gst;
	}
	//	@FindBy(xpath="//input[@id='order_no']")
	@FindBy(name="order_no")
	private WebElement orderNo;
	
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcreditNo() {
		return txtcreditNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
}
