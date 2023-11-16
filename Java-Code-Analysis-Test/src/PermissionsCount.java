// A class that contains one of each count.
public class PermissionsCount
{
	private int privateNum;
	protected int protectedNum;
	public int publicNum;
	int defaultNum;
	
	public PermissionsCount(int privateNum, int protectedNum, int publicNum, int defaultNum)
	{
		this.privateNum = privateNum;
		this.protectedNum = protectedNum;
		this.publicNum = publicNum;
		this.defaultNum = defaultNum;
	}
	
	private int getPrivateNum()
	{
		return privateNum;
	}
	
	protected int getProtectedNum()
	{
		return protectedNum;
	}
	
	public int getPublicNum()
	{
		return publicNum;
	}
	
	int getDefaultNum()
	{
		return defaultNum;
	}
	
	private void setPrivateNum(int privateNum)
	{
		this.privateNum = privateNum;
	}
	
	protected void setProtectedNum(int protectedNum)
	{
		this.protectedNum = protectedNum;
	}
	
	public void setPublicNum(int publicNum)
	{
		this.publicNum = publicNum;
	}
	
	void setDefaultNum(int defaultNum)
	{
		this.defaultNum = defaultNum;
	}
}
