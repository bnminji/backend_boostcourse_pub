package kr.or.connect.jdbcexam.dto;

public class Role {
	private Integer roleID;
	private String description;
	
	public Role(Integer roleID, String description) {
		super();
		this.roleID = roleID;
		this.description = description;
	}
	
	public Integer getRoleID() {
		return roleID;
	}
	
	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", description=" + description + "]";
	}
}
