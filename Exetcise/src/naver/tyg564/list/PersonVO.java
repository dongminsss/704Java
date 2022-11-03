package naver.tyg564.list;

import java.util.Date;

public class PersonVO {
	private long num;
	private String name;
	private Date birthday;
	private String phone;
	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonVO(long num, String name, Date birthday, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
	}
	public long getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + "]";
	}
	
	
}
