package com.hzit.satisfaction.vo;

/**
 * 
 * @author zhangfu
 */
public class SimpleCommentVo implements java.io.Serializable{



	private String comTime;

	/**
	 *  评论的模块
	 */
	private String comModule;
	/**
	 *  当前模块的总得分
	 */
	private Integer comScore;
	/**
	 *  被评论人
	 */
	private String codPeople;
	/**
	 *  评论来自的班级
	 */
	private String comClass;


	/**
	 * 评论时间
	 * @param comTime
	 */
	public void setComTime(String comTime){
		this.comTime = comTime;
	}
	
    /**
     * 评论时间
     * @return java.util.Date
     */	
    public String getComTime(){
    	return comTime;
    }

	/**
	 * 评论的模块
	 * @param comModule
	 */
	public void setComModule(String comModule){
		this.comModule = comModule;
	}
	
    /**
     * 评论的模块
     * @return String
     */	
    public String getComModule(){
    	return comModule;
    }
	/**
	 * 当前模块的总得分
	 * @param comScore
	 */
	public void setComScore(Integer comScore){
		this.comScore = comScore;
	}
	
    /**
     * 当前模块的总得分
     * @return Integer
     */	
    public Integer getComScore(){
    	return comScore;
    }
	/**
	 * 被评论人
	 * @param codPeople
	 */
	public void setCodPeople(String codPeople){
		this.codPeople = codPeople;
	}
	
    /**
     * 被评论人
     * @return String
     */	
    public String getCodPeople(){
    	return codPeople;
    }
	/**
	 * 评论来自的班级
	 * @param comClass
	 */
	public void setComClass(String comClass){
		this.comClass = comClass;
	}
	
    /**
     * 评论来自的班级
     * @return String
     */	
    public String getComClass(){
    	return comClass;
    }
}