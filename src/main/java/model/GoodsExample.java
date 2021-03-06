package model;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public GoodsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Wed Apr 10 15:57:18 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_goods
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

		public Criteria andLeibieidIsNull() {
			addCriterion("leibieId is null");
			return (Criteria) this;
		}

		public Criteria andLeibieidIsNotNull() {
			addCriterion("leibieId is not null");
			return (Criteria) this;
		}

		public Criteria andLeibieidEqualTo(Integer value) {
			addCriterion("leibieId =", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidNotEqualTo(Integer value) {
			addCriterion("leibieId <>", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidGreaterThan(Integer value) {
			addCriterion("leibieId >", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidGreaterThanOrEqualTo(Integer value) {
			addCriterion("leibieId >=", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidLessThan(Integer value) {
			addCriterion("leibieId <", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidLessThanOrEqualTo(Integer value) {
			addCriterion("leibieId <=", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidIn(List<Integer> values) {
			addCriterion("leibieId in", values, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidNotIn(List<Integer> values) {
			addCriterion("leibieId not in", values, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidBetween(Integer value1, Integer value2) {
			addCriterion("leibieId between", value1, value2, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidNotBetween(Integer value1, Integer value2) {
			addCriterion("leibieId not between", value1, value2, "leibieid");
			return (Criteria) this;
		}

		public Criteria andMingchengIsNull() {
			addCriterion("mingcheng is null");
			return (Criteria) this;
		}

		public Criteria andMingchengIsNotNull() {
			addCriterion("mingcheng is not null");
			return (Criteria) this;
		}

		public Criteria andMingchengEqualTo(String value) {
			addCriterion("mingcheng =", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengNotEqualTo(String value) {
			addCriterion("mingcheng <>", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengGreaterThan(String value) {
			addCriterion("mingcheng >", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengGreaterThanOrEqualTo(String value) {
			addCriterion("mingcheng >=", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengLessThan(String value) {
			addCriterion("mingcheng <", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengLessThanOrEqualTo(String value) {
			addCriterion("mingcheng <=", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengLike(String value) {
			addCriterion("mingcheng like", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengNotLike(String value) {
			addCriterion("mingcheng not like", value, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengIn(List<String> values) {
			addCriterion("mingcheng in", values, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengNotIn(List<String> values) {
			addCriterion("mingcheng not in", values, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengBetween(String value1, String value2) {
			addCriterion("mingcheng between", value1, value2, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andMingchengNotBetween(String value1, String value2) {
			addCriterion("mingcheng not between", value1, value2, "mingcheng");
			return (Criteria) this;
		}

		public Criteria andJieshaoIsNull() {
			addCriterion("jieshao is null");
			return (Criteria) this;
		}

		public Criteria andJieshaoIsNotNull() {
			addCriterion("jieshao is not null");
			return (Criteria) this;
		}

		public Criteria andJieshaoEqualTo(String value) {
			addCriterion("jieshao =", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotEqualTo(String value) {
			addCriterion("jieshao <>", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoGreaterThan(String value) {
			addCriterion("jieshao >", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoGreaterThanOrEqualTo(String value) {
			addCriterion("jieshao >=", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoLessThan(String value) {
			addCriterion("jieshao <", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoLessThanOrEqualTo(String value) {
			addCriterion("jieshao <=", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoLike(String value) {
			addCriterion("jieshao like", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotLike(String value) {
			addCriterion("jieshao not like", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoIn(List<String> values) {
			addCriterion("jieshao in", values, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotIn(List<String> values) {
			addCriterion("jieshao not in", values, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoBetween(String value1, String value2) {
			addCriterion("jieshao between", value1, value2, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotBetween(String value1, String value2) {
			addCriterion("jieshao not between", value1, value2, "jieshao");
			return (Criteria) this;
		}

		public Criteria andFujianIsNull() {
			addCriterion("fujian is null");
			return (Criteria) this;
		}

		public Criteria andFujianIsNotNull() {
			addCriterion("fujian is not null");
			return (Criteria) this;
		}

		public Criteria andFujianEqualTo(String value) {
			addCriterion("fujian =", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianNotEqualTo(String value) {
			addCriterion("fujian <>", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianGreaterThan(String value) {
			addCriterion("fujian >", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianGreaterThanOrEqualTo(String value) {
			addCriterion("fujian >=", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianLessThan(String value) {
			addCriterion("fujian <", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianLessThanOrEqualTo(String value) {
			addCriterion("fujian <=", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianLike(String value) {
			addCriterion("fujian like", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianNotLike(String value) {
			addCriterion("fujian not like", value, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianIn(List<String> values) {
			addCriterion("fujian in", values, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianNotIn(List<String> values) {
			addCriterion("fujian not in", values, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianBetween(String value1, String value2) {
			addCriterion("fujian between", value1, value2, "fujian");
			return (Criteria) this;
		}

		public Criteria andFujianNotBetween(String value1, String value2) {
			addCriterion("fujian not between", value1, value2, "fujian");
			return (Criteria) this;
		}

		public Criteria andJiageIsNull() {
			addCriterion("jiage is null");
			return (Criteria) this;
		}

		public Criteria andJiageIsNotNull() {
			addCriterion("jiage is not null");
			return (Criteria) this;
		}

		public Criteria andJiageEqualTo(Integer value) {
			addCriterion("jiage =", value, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageNotEqualTo(Integer value) {
			addCriterion("jiage <>", value, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageGreaterThan(Integer value) {
			addCriterion("jiage >", value, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageGreaterThanOrEqualTo(Integer value) {
			addCriterion("jiage >=", value, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageLessThan(Integer value) {
			addCriterion("jiage <", value, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageLessThanOrEqualTo(Integer value) {
			addCriterion("jiage <=", value, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageIn(List<Integer> values) {
			addCriterion("jiage in", values, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageNotIn(List<Integer> values) {
			addCriterion("jiage not in", values, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageBetween(Integer value1, Integer value2) {
			addCriterion("jiage between", value1, value2, "jiage");
			return (Criteria) this;
		}

		public Criteria andJiageNotBetween(Integer value1, Integer value2) {
			addCriterion("jiage not between", value1, value2, "jiage");
			return (Criteria) this;
		}

		public Criteria andTejiaIsNull() {
			addCriterion("tejia is null");
			return (Criteria) this;
		}

		public Criteria andTejiaIsNotNull() {
			addCriterion("tejia is not null");
			return (Criteria) this;
		}

		public Criteria andTejiaEqualTo(Integer value) {
			addCriterion("tejia =", value, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaNotEqualTo(Integer value) {
			addCriterion("tejia <>", value, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaGreaterThan(Integer value) {
			addCriterion("tejia >", value, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaGreaterThanOrEqualTo(Integer value) {
			addCriterion("tejia >=", value, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaLessThan(Integer value) {
			addCriterion("tejia <", value, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaLessThanOrEqualTo(Integer value) {
			addCriterion("tejia <=", value, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaIn(List<Integer> values) {
			addCriterion("tejia in", values, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaNotIn(List<Integer> values) {
			addCriterion("tejia not in", values, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaBetween(Integer value1, Integer value2) {
			addCriterion("tejia between", value1, value2, "tejia");
			return (Criteria) this;
		}

		public Criteria andTejiaNotBetween(Integer value1, Integer value2) {
			addCriterion("tejia not between", value1, value2, "tejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaIsNull() {
			addCriterion("shifoutejia is null");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaIsNotNull() {
			addCriterion("shifoutejia is not null");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaEqualTo(String value) {
			addCriterion("shifoutejia =", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaNotEqualTo(String value) {
			addCriterion("shifoutejia <>", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaGreaterThan(String value) {
			addCriterion("shifoutejia >", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaGreaterThanOrEqualTo(String value) {
			addCriterion("shifoutejia >=", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaLessThan(String value) {
			addCriterion("shifoutejia <", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaLessThanOrEqualTo(String value) {
			addCriterion("shifoutejia <=", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaLike(String value) {
			addCriterion("shifoutejia like", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaNotLike(String value) {
			addCriterion("shifoutejia not like", value, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaIn(List<String> values) {
			addCriterion("shifoutejia in", values, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaNotIn(List<String> values) {
			addCriterion("shifoutejia not in", values, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaBetween(String value1, String value2) {
			addCriterion("shifoutejia between", value1, value2, "shifoutejia");
			return (Criteria) this;
		}

		public Criteria andShifoutejiaNotBetween(String value1, String value2) {
			addCriterion("shifoutejia not between", value1, value2, "shifoutejia");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_goods
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
     * This class corresponds to the database table t_goods
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 10 15:56:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}