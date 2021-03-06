package model;

import java.util.ArrayList;
import java.util.List;

public class HuiyuanExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public HuiyuanExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andLoginnameIsNull() {
			addCriterion("loginname is null");
			return (Criteria) this;
		}

		public Criteria andLoginnameIsNotNull() {
			addCriterion("loginname is not null");
			return (Criteria) this;
		}

		public Criteria andLoginnameEqualTo(String value) {
			addCriterion("loginname =", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotEqualTo(String value) {
			addCriterion("loginname <>", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameGreaterThan(String value) {
			addCriterion("loginname >", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
			addCriterion("loginname >=", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLessThan(String value) {
			addCriterion("loginname <", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLessThanOrEqualTo(String value) {
			addCriterion("loginname <=", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLike(String value) {
			addCriterion("loginname like", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotLike(String value) {
			addCriterion("loginname not like", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameIn(List<String> values) {
			addCriterion("loginname in", values, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotIn(List<String> values) {
			addCriterion("loginname not in", values, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameBetween(String value1, String value2) {
			addCriterion("loginname between", value1, value2, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotBetween(String value1, String value2) {
			addCriterion("loginname not between", value1, value2, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginpwIsNull() {
			addCriterion("loginpw is null");
			return (Criteria) this;
		}

		public Criteria andLoginpwIsNotNull() {
			addCriterion("loginpw is not null");
			return (Criteria) this;
		}

		public Criteria andLoginpwEqualTo(String value) {
			addCriterion("loginpw =", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwNotEqualTo(String value) {
			addCriterion("loginpw <>", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwGreaterThan(String value) {
			addCriterion("loginpw >", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwGreaterThanOrEqualTo(String value) {
			addCriterion("loginpw >=", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwLessThan(String value) {
			addCriterion("loginpw <", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwLessThanOrEqualTo(String value) {
			addCriterion("loginpw <=", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwLike(String value) {
			addCriterion("loginpw like", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwNotLike(String value) {
			addCriterion("loginpw not like", value, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwIn(List<String> values) {
			addCriterion("loginpw in", values, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwNotIn(List<String> values) {
			addCriterion("loginpw not in", values, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwBetween(String value1, String value2) {
			addCriterion("loginpw between", value1, value2, "loginpw");
			return (Criteria) this;
		}

		public Criteria andLoginpwNotBetween(String value1, String value2) {
			addCriterion("loginpw not between", value1, value2, "loginpw");
			return (Criteria) this;
		}

		public Criteria andXingmingIsNull() {
			addCriterion("xingming is null");
			return (Criteria) this;
		}

		public Criteria andXingmingIsNotNull() {
			addCriterion("xingming is not null");
			return (Criteria) this;
		}

		public Criteria andXingmingEqualTo(String value) {
			addCriterion("xingming =", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingNotEqualTo(String value) {
			addCriterion("xingming <>", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingGreaterThan(String value) {
			addCriterion("xingming >", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingGreaterThanOrEqualTo(String value) {
			addCriterion("xingming >=", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingLessThan(String value) {
			addCriterion("xingming <", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingLessThanOrEqualTo(String value) {
			addCriterion("xingming <=", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingLike(String value) {
			addCriterion("xingming like", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingNotLike(String value) {
			addCriterion("xingming not like", value, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingIn(List<String> values) {
			addCriterion("xingming in", values, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingNotIn(List<String> values) {
			addCriterion("xingming not in", values, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingBetween(String value1, String value2) {
			addCriterion("xingming between", value1, value2, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingmingNotBetween(String value1, String value2) {
			addCriterion("xingming not between", value1, value2, "xingming");
			return (Criteria) this;
		}

		public Criteria andXingbieIsNull() {
			addCriterion("xingbie is null");
			return (Criteria) this;
		}

		public Criteria andXingbieIsNotNull() {
			addCriterion("xingbie is not null");
			return (Criteria) this;
		}

		public Criteria andXingbieEqualTo(String value) {
			addCriterion("xingbie =", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotEqualTo(String value) {
			addCriterion("xingbie <>", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieGreaterThan(String value) {
			addCriterion("xingbie >", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieGreaterThanOrEqualTo(String value) {
			addCriterion("xingbie >=", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieLessThan(String value) {
			addCriterion("xingbie <", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieLessThanOrEqualTo(String value) {
			addCriterion("xingbie <=", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieLike(String value) {
			addCriterion("xingbie like", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotLike(String value) {
			addCriterion("xingbie not like", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieIn(List<String> values) {
			addCriterion("xingbie in", values, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotIn(List<String> values) {
			addCriterion("xingbie not in", values, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieBetween(String value1, String value2) {
			addCriterion("xingbie between", value1, value2, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotBetween(String value1, String value2) {
			addCriterion("xingbie not between", value1, value2, "xingbie");
			return (Criteria) this;
		}

		public Criteria andNianlingIsNull() {
			addCriterion("nianling is null");
			return (Criteria) this;
		}

		public Criteria andNianlingIsNotNull() {
			addCriterion("nianling is not null");
			return (Criteria) this;
		}

		public Criteria andNianlingEqualTo(String value) {
			addCriterion("nianling =", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingNotEqualTo(String value) {
			addCriterion("nianling <>", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingGreaterThan(String value) {
			addCriterion("nianling >", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingGreaterThanOrEqualTo(String value) {
			addCriterion("nianling >=", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingLessThan(String value) {
			addCriterion("nianling <", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingLessThanOrEqualTo(String value) {
			addCriterion("nianling <=", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingLike(String value) {
			addCriterion("nianling like", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingNotLike(String value) {
			addCriterion("nianling not like", value, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingIn(List<String> values) {
			addCriterion("nianling in", values, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingNotIn(List<String> values) {
			addCriterion("nianling not in", values, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingBetween(String value1, String value2) {
			addCriterion("nianling between", value1, value2, "nianling");
			return (Criteria) this;
		}

		public Criteria andNianlingNotBetween(String value1, String value2) {
			addCriterion("nianling not between", value1, value2, "nianling");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andDianhuaIsNull() {
			addCriterion("dianhua is null");
			return (Criteria) this;
		}

		public Criteria andDianhuaIsNotNull() {
			addCriterion("dianhua is not null");
			return (Criteria) this;
		}

		public Criteria andDianhuaEqualTo(String value) {
			addCriterion("dianhua =", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotEqualTo(String value) {
			addCriterion("dianhua <>", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaGreaterThan(String value) {
			addCriterion("dianhua >", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaGreaterThanOrEqualTo(String value) {
			addCriterion("dianhua >=", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaLessThan(String value) {
			addCriterion("dianhua <", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaLessThanOrEqualTo(String value) {
			addCriterion("dianhua <=", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaLike(String value) {
			addCriterion("dianhua like", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotLike(String value) {
			addCriterion("dianhua not like", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaIn(List<String> values) {
			addCriterion("dianhua in", values, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotIn(List<String> values) {
			addCriterion("dianhua not in", values, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaBetween(String value1, String value2) {
			addCriterion("dianhua between", value1, value2, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotBetween(String value1, String value2) {
			addCriterion("dianhua not between", value1, value2, "dianhua");
			return (Criteria) this;
		}

		public Criteria andLeixingIsNull() {
			addCriterion("leixing is null");
			return (Criteria) this;
		}

		public Criteria andLeixingIsNotNull() {
			addCriterion("leixing is not null");
			return (Criteria) this;
		}

		public Criteria andLeixingEqualTo(String value) {
			addCriterion("leixing =", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingNotEqualTo(String value) {
			addCriterion("leixing <>", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingGreaterThan(String value) {
			addCriterion("leixing >", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingGreaterThanOrEqualTo(String value) {
			addCriterion("leixing >=", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingLessThan(String value) {
			addCriterion("leixing <", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingLessThanOrEqualTo(String value) {
			addCriterion("leixing <=", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingLike(String value) {
			addCriterion("leixing like", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingNotLike(String value) {
			addCriterion("leixing not like", value, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingIn(List<String> values) {
			addCriterion("leixing in", values, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingNotIn(List<String> values) {
			addCriterion("leixing not in", values, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingBetween(String value1, String value2) {
			addCriterion("leixing between", value1, value2, "leixing");
			return (Criteria) this;
		}

		public Criteria andLeixingNotBetween(String value1, String value2) {
			addCriterion("leixing not between", value1, value2, "leixing");
			return (Criteria) this;
		}

		public Criteria andDelIsNull() {
			addCriterion("del is null");
			return (Criteria) this;
		}

		public Criteria andDelIsNotNull() {
			addCriterion("del is not null");
			return (Criteria) this;
		}

		public Criteria andDelEqualTo(String value) {
			addCriterion("del =", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelNotEqualTo(String value) {
			addCriterion("del <>", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelGreaterThan(String value) {
			addCriterion("del >", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelGreaterThanOrEqualTo(String value) {
			addCriterion("del >=", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelLessThan(String value) {
			addCriterion("del <", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelLessThanOrEqualTo(String value) {
			addCriterion("del <=", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelLike(String value) {
			addCriterion("del like", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelNotLike(String value) {
			addCriterion("del not like", value, "del");
			return (Criteria) this;
		}

		public Criteria andDelIn(List<String> values) {
			addCriterion("del in", values, "del");
			return (Criteria) this;
		}

		public Criteria andDelNotIn(List<String> values) {
			addCriterion("del not in", values, "del");
			return (Criteria) this;
		}

		public Criteria andDelBetween(String value1, String value2) {
			addCriterion("del between", value1, value2, "del");
			return (Criteria) this;
		}

		public Criteria andDelNotBetween(String value1, String value2) {
			addCriterion("del not between", value1, value2, "del");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_huiyuan
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_huiyuan
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 10 15:56:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}