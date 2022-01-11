package bestWay.object;

public class Object {
	protected int ObjectId;
	protected String ObjectName;
	protected String Status;
	protected String Image;
	protected float Price;
	protected String AboutObject;
	
	public String getAboutObject() {
		return AboutObject;
	}
	public void setAboutObject(String aboutObject) {
		AboutObject = aboutObject;
	}
	
	
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	protected int UserId;
	
	public int getObjectId() {
		return ObjectId;
	}
	public void setObjectId(int objectId) {
		ObjectId = objectId;
	}
	public String getObjectName() {
		return ObjectName;
	}
	public void setObjectName(String objectName) {
		ObjectName = objectName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	} 

}
