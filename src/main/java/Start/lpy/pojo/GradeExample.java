package Start.lpy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeStateIsNull() {
            addCriterion("grade_state is null");
            return (Criteria) this;
        }

        public Criteria andGradeStateIsNotNull() {
            addCriterion("grade_state is not null");
            return (Criteria) this;
        }

        public Criteria andGradeStateEqualTo(Integer value) {
            addCriterion("grade_state =", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotEqualTo(Integer value) {
            addCriterion("grade_state <>", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateGreaterThan(Integer value) {
            addCriterion("grade_state >", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_state >=", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLessThan(Integer value) {
            addCriterion("grade_state <", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLessThanOrEqualTo(Integer value) {
            addCriterion("grade_state <=", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateIn(List<Integer> values) {
            addCriterion("grade_state in", values, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotIn(List<Integer> values) {
            addCriterion("grade_state not in", values, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateBetween(Integer value1, Integer value2) {
            addCriterion("grade_state between", value1, value2, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_state not between", value1, value2, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeIsNull() {
            addCriterion("grade_createtime is null");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeIsNotNull() {
            addCriterion("grade_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeEqualTo(Date value) {
            addCriterion("grade_createtime =", value, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeNotEqualTo(Date value) {
            addCriterion("grade_createtime <>", value, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeGreaterThan(Date value) {
            addCriterion("grade_createtime >", value, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_createtime >=", value, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeLessThan(Date value) {
            addCriterion("grade_createtime <", value, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("grade_createtime <=", value, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeIn(List<Date> values) {
            addCriterion("grade_createtime in", values, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeNotIn(List<Date> values) {
            addCriterion("grade_createtime not in", values, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("grade_createtime between", value1, value2, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("grade_createtime not between", value1, value2, "gradeCreatetime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeIsNull() {
            addCriterion("grade_destorytime is null");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeIsNotNull() {
            addCriterion("grade_destorytime is not null");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeEqualTo(Date value) {
            addCriterion("grade_destorytime =", value, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeNotEqualTo(Date value) {
            addCriterion("grade_destorytime <>", value, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeGreaterThan(Date value) {
            addCriterion("grade_destorytime >", value, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_destorytime >=", value, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeLessThan(Date value) {
            addCriterion("grade_destorytime <", value, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeLessThanOrEqualTo(Date value) {
            addCriterion("grade_destorytime <=", value, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeIn(List<Date> values) {
            addCriterion("grade_destorytime in", values, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeNotIn(List<Date> values) {
            addCriterion("grade_destorytime not in", values, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeBetween(Date value1, Date value2) {
            addCriterion("grade_destorytime between", value1, value2, "gradeDestorytime");
            return (Criteria) this;
        }

        public Criteria andGradeDestorytimeNotBetween(Date value1, Date value2) {
            addCriterion("grade_destorytime not between", value1, value2, "gradeDestorytime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}