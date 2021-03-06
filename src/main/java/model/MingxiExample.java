package model;

import java.util.ArrayList;
import java.util.List;

public class MingxiExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public MingxiExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mingxi
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_mingxi
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

		public Criteria andOrderidIsNull() {
			addCriterion("orderId is null");
			return (Criteria) this;
		}

		public Criteria andOrderidIsNotNull() {
			addCriterion("orderId is not null");
			return (Criteria) this;
		}

		public Criteria andOrderidEqualTo(Integer value) {
			addCriterion("orderId =", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotEqualTo(Integer value) {
			addCriterion("orderId <>", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidGreaterThan(Integer value) {
			addCriterion("orderId >", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
			addCriterion("orderId >=", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidLessThan(Integer value) {
			addCriterion("orderId <", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidLessThanOrEqualTo(Integer value) {
			addCriterion("orderId <=", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidIn(List<Integer> values) {
			addCriterion("orderId in", values, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotIn(List<Integer> values) {
			addCriterion("orderId not in", values, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidBetween(Integer value1, Integer value2) {
			addCriterion("orderId between", value1, value2, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
			addCriterion("orderId not between", value1, value2, "orderid");
			return (Criteria) this;
		}

		public Criteria andGoodsidIsNull() {
			addCriterion("goodsId is null");
			return (Criteria) this;
		}

		public Criteria andGoodsidIsNotNull() {
			addCriterion("goodsId is not null");
			return (Criteria) this;
		}

		public Criteria andGoodsidEqualTo(Integer value) {
			addCriterion("goodsId =", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidNotEqualTo(Integer value) {
			addCriterion("goodsId <>", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidGreaterThan(Integer value) {
			addCriterion("goodsId >", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
			addCriterion("goodsId >=", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidLessThan(Integer value) {
			addCriterion("goodsId <", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
			addCriterion("goodsId <=", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidIn(List<Integer> values) {
			addCriterion("goodsId in", values, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidNotIn(List<Integer> values) {
			addCriterion("goodsId not in", values, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidBetween(Integer value1, Integer value2) {
			addCriterion("goodsId between", value1, value2, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
			addCriterion("goodsId not between", value1, value2, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangIsNull() {
			addCriterion("goodsShuliang is null");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangIsNotNull() {
			addCriterion("goodsShuliang is not null");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangEqualTo(Integer value) {
			addCriterion("goodsShuliang =", value, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangNotEqualTo(Integer value) {
			addCriterion("goodsShuliang <>", value, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangGreaterThan(Integer value) {
			addCriterion("goodsShuliang >", value, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangGreaterThanOrEqualTo(Integer value) {
			addCriterion("goodsShuliang >=", value, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangLessThan(Integer value) {
			addCriterion("goodsShuliang <", value, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangLessThanOrEqualTo(Integer value) {
			addCriterion("goodsShuliang <=", value, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangIn(List<Integer> values) {
			addCriterion("goodsShuliang in", values, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangNotIn(List<Integer> values) {
			addCriterion("goodsShuliang not in", values, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangBetween(Integer value1, Integer value2) {
			addCriterion("goodsShuliang between", value1, value2, "goodsshuliang");
			return (Criteria) this;
		}

		public Criteria andGoodsshuliangNotBetween(Integer value1, Integer value2) {
			addCriterion("goodsShuliang not between", value1, value2, "goodsshuliang");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_mingxi
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
     * This class corresponds to the database table t_mingxi
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 10 15:56:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}