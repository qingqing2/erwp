package model;

public class Mingxi {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_mingxi.id
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_mingxi.orderId
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	private Integer orderid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_mingxi.goodsId
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	private Integer goodsid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_mingxi.goodsShuliang
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	private Integer goodsshuliang;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mingxi.id
	 * @return  the value of t_mingxi.id
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mingxi.id
	 * @param id  the value for t_mingxi.id
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mingxi.orderId
	 * @return  the value of t_mingxi.orderId
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Integer getOrderid() {
		return orderid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mingxi.orderId
	 * @param orderid  the value for t_mingxi.orderId
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mingxi.goodsId
	 * @return  the value of t_mingxi.goodsId
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Integer getGoodsid() {
		return goodsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mingxi.goodsId
	 * @param goodsid  the value for t_mingxi.goodsId
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mingxi.goodsShuliang
	 * @return  the value of t_mingxi.goodsShuliang
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Integer getGoodsshuliang() {
		return goodsshuliang;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mingxi.goodsShuliang
	 * @param goodsshuliang  the value for t_mingxi.goodsShuliang
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setGoodsshuliang(Integer goodsshuliang) {
		this.goodsshuliang = goodsshuliang;
	}


	private String mingcheng;
	private Integer tejia;

	public String getMingcheng() {
		return mingcheng;
	}

	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}

	public Integer getTejia() {
		return tejia;
	}

	public void setTejia(Integer tejia) {
		this.tejia = tejia;
	}
}