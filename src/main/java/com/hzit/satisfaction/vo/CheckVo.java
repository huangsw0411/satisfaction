package com.hzit.satisfaction.vo;

/**
 * 
 * @author zhangfu
 */
public class CheckVo {
	/**
	 *  ID自增长
	 */
	private Integer checkId;
	/**
	 *  评价的班级
	 */
	private String checkClass;
	/**
	 *  评价的老师
	 */
	private String checkTeacher;
	/**
	 *  密码
	 */
	private String checkPwd;
	/**
	 *  创建时间
	 */
	private java.util.Date createTime;
	/**
	 *  考察模块，0代表餐饮 1代表讲师 2 代表班主任
	 */
	private Integer checkModule;
	/**
	 * ID自增长
	 * @param checkId
	 */
	public void setCheckId(Integer checkId){
		this.checkId = checkId;
	}
	
    /**
     * ID自增长
     * @return Integer
     */	
    public Integer getCheckId(){
    	return checkId;
    }
	/**
	 * 评价的班级
	 * @param checkClass
	 */
	public void setCheckClass(String checkClass){
		this.checkClass = checkClass;
	}
	
    /**
     * 评价的班级
     * @return String
     */	
    public String getCheckClass(){
    	return checkClass;
    }
	/**
	 * 评价的老师
	 * @param checkTeacher
	 */
	public void setCheckTeacher(String checkTeacher){
		this.checkTeacher = checkTeacher;
	}
	
    /**
     * 评价的老师
     * @return String
     */	
    public String getCheckTeacher(){
    	return checkTeacher;
    }
	/**
	 * 密码
	 * @param checkPwd
	 */
	public void setCheckPwd(String checkPwd){
		this.checkPwd = checkPwd;
	}
	
    /**
     * 密码
     * @return String
     */	
    public String getCheckPwd(){
    	return checkPwd;
    }
	/**
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
    /**
     * 创建时间
     * @return java.util.Date
     */	
    public java.util.Date getCreateTime(){
    	return createTime;
    }
	/**
	 * 考察模块，0代表餐饮 1代表讲师 2 代表班主任
	 * @param checkModule
	 */
	public void setCheckModule(Integer checkModule){
		this.checkModule = checkModule;
	}
	
    /**
     * 考察模块，0代表餐饮 1代表讲师 2 代表班主任
     * @return Integer
     */	
    public Integer getCheckModule(){
    	return checkModule;
    }
}