package Start.lpy.pojo;

import java.util.ArrayList;
import java.util.List;

public class FilmtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmtypeExample() {
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

        public Criteria andFtidIsNull() {
            addCriterion("ftid is null");
            return (Criteria) this;
        }

        public Criteria andFtidIsNotNull() {
            addCriterion("ftid is not null");
            return (Criteria) this;
        }

        public Criteria andFtidEqualTo(Integer value) {
            addCriterion("ftid =", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotEqualTo(Integer value) {
            addCriterion("ftid <>", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidGreaterThan(Integer value) {
            addCriterion("ftid >", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftid >=", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidLessThan(Integer value) {
            addCriterion("ftid <", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidLessThanOrEqualTo(Integer value) {
            addCriterion("ftid <=", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidIn(List<Integer> values) {
            addCriterion("ftid in", values, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotIn(List<Integer> values) {
            addCriterion("ftid not in", values, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidBetween(Integer value1, Integer value2) {
            addCriterion("ftid between", value1, value2, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ftid not between", value1, value2, "ftid");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameIsNull() {
            addCriterion("film_typename is null");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameIsNotNull() {
            addCriterion("film_typename is not null");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameEqualTo(String value) {
            addCriterion("film_typename =", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameNotEqualTo(String value) {
            addCriterion("film_typename <>", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameGreaterThan(String value) {
            addCriterion("film_typename >", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("film_typename >=", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameLessThan(String value) {
            addCriterion("film_typename <", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameLessThanOrEqualTo(String value) {
            addCriterion("film_typename <=", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameLike(String value) {
            addCriterion("film_typename like", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameNotLike(String value) {
            addCriterion("film_typename not like", value, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameIn(List<String> values) {
            addCriterion("film_typename in", values, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameNotIn(List<String> values) {
            addCriterion("film_typename not in", values, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameBetween(String value1, String value2) {
            addCriterion("film_typename between", value1, value2, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypenameNotBetween(String value1, String value2) {
            addCriterion("film_typename not between", value1, value2, "filmTypename");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionIsNull() {
            addCriterion("film_typedescription is null");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionIsNotNull() {
            addCriterion("film_typedescription is not null");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionEqualTo(String value) {
            addCriterion("film_typedescription =", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionNotEqualTo(String value) {
            addCriterion("film_typedescription <>", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionGreaterThan(String value) {
            addCriterion("film_typedescription >", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("film_typedescription >=", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionLessThan(String value) {
            addCriterion("film_typedescription <", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionLessThanOrEqualTo(String value) {
            addCriterion("film_typedescription <=", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionLike(String value) {
            addCriterion("film_typedescription like", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionNotLike(String value) {
            addCriterion("film_typedescription not like", value, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionIn(List<String> values) {
            addCriterion("film_typedescription in", values, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionNotIn(List<String> values) {
            addCriterion("film_typedescription not in", values, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionBetween(String value1, String value2) {
            addCriterion("film_typedescription between", value1, value2, "filmTypedescription");
            return (Criteria) this;
        }

        public Criteria andFilmTypedescriptionNotBetween(String value1, String value2) {
            addCriterion("film_typedescription not between", value1, value2, "filmTypedescription");
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