package Start.lpy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andReviewIsNull() {
            addCriterion("review is null");
            return (Criteria) this;
        }

        public Criteria andReviewIsNotNull() {
            addCriterion("review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEqualTo(String value) {
            addCriterion("review =", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotEqualTo(String value) {
            addCriterion("review <>", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThan(String value) {
            addCriterion("review >", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThanOrEqualTo(String value) {
            addCriterion("review >=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThan(String value) {
            addCriterion("review <", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThanOrEqualTo(String value) {
            addCriterion("review <=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLike(String value) {
            addCriterion("review like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotLike(String value) {
            addCriterion("review not like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewIn(List<String> values) {
            addCriterion("review in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotIn(List<String> values) {
            addCriterion("review not in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewBetween(String value1, String value2) {
            addCriterion("review between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotBetween(String value1, String value2) {
            addCriterion("review not between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeIsNull() {
            addCriterion("review_createtime is null");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeIsNotNull() {
            addCriterion("review_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeEqualTo(Date value) {
            addCriterion("review_createtime =", value, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeNotEqualTo(Date value) {
            addCriterion("review_createtime <>", value, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeGreaterThan(Date value) {
            addCriterion("review_createtime >", value, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("review_createtime >=", value, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeLessThan(Date value) {
            addCriterion("review_createtime <", value, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("review_createtime <=", value, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeIn(List<Date> values) {
            addCriterion("review_createtime in", values, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeNotIn(List<Date> values) {
            addCriterion("review_createtime not in", values, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeBetween(Date value1, Date value2) {
            addCriterion("review_createtime between", value1, value2, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("review_createtime not between", value1, value2, "reviewCreatetime");
            return (Criteria) this;
        }

        public Criteria andFilmScoreIsNull() {
            addCriterion("film_score is null");
            return (Criteria) this;
        }

        public Criteria andFilmScoreIsNotNull() {
            addCriterion("film_score is not null");
            return (Criteria) this;
        }

        public Criteria andFilmScoreEqualTo(Double value) {
            addCriterion("film_score =", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreNotEqualTo(Double value) {
            addCriterion("film_score <>", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreGreaterThan(Double value) {
            addCriterion("film_score >", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("film_score >=", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreLessThan(Double value) {
            addCriterion("film_score <", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreLessThanOrEqualTo(Double value) {
            addCriterion("film_score <=", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreIn(List<Double> values) {
            addCriterion("film_score in", values, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreNotIn(List<Double> values) {
            addCriterion("film_score not in", values, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreBetween(Double value1, Double value2) {
            addCriterion("film_score between", value1, value2, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreNotBetween(Double value1, Double value2) {
            addCriterion("film_score not between", value1, value2, "filmScore");
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