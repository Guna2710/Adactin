package org.pages;
import org.utility.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdactionRegPage extends BaseClass{
	public AdactionRegPage() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getAroom() {
		return aroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(name="datepick_in")
	private WebElement date;
	
	@FindBy(name="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public void setDateout(WebElement dateout) {
		this.dateout = dateout;
	}
	@FindBy(id="adult_room")
	private WebElement aroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue") 
	private WebElement btnContinue;
	
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void setBtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public void setRadiobtn(WebElement radiobtn) {
		this.radiobtn = radiobtn;
	}
	@FindBy(xpath="//option[@value='Adelaide']")
	private WebElement dropLocation;//4
	@FindBy(xpath="//option[@value='Hotel Creek']")
	private WebElement dropHotel;//1
	@FindBy(xpath="//option[@value='Double']")
	private WebElement dropRoom;//2
	@FindBy(xpath="(//option[@value='2'])[1]")
	private WebElement dropNoRoom;//2
	@FindBy(xpath="(//option[@value='3'])[2]")
	private WebElement dropARoom;//3
	@FindBy(xpath="(//option[@value='1'])[3]")
	private WebElement dropCRoom;//1

	public WebElement getDropLocation() {
		return dropLocation;
	}
	public WebElement getDropHotel() {
		return dropHotel;
	}
	public WebElement getDropRoom() {
		return dropRoom;
	}
	public WebElement getDropNoRoom() {
		return dropNoRoom;
	}
	public WebElement getDropARoom() {
		return dropARoom;
	}
	public WebElement getDropCRoom() {
		return dropCRoom;
	}
	
	
}
