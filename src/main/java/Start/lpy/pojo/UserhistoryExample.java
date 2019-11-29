package Start.lpy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserhistoryExample() {
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

        public Criteria andHistoryidIsNull() {
            addCriterion("historyid is null");
            return (Criteria) this;
        }

        public Criteria andHistoryidIsNotNull() {
            addCriterion("historyid is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryidEqualTo(Integer value) {
            addCriterion("historyid =", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidNotEqualTo(Integer value) {
            addCriterion("historyid <>", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidGreaterThan(Integer value) {
            addCriterion("historyid >", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("historyid >=", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidLessThan(Integer value) {
            addCriterion("historyid <", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("historyid <=", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidIn(List<Integer> values) {
            addCriterion("historyid in", values, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidNotIn(List<Integer> values) {
            addCriterion("historyid not in", values, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidBetween(Integer value1, Integer value2) {
            addCriterion("historyid between", value1, value2, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("historyid not between", value1, value2, "historyid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andFilmidIsNull() {
            addCriterion("filmid is null");
            return (Criteria) this;
        }

        public Criteria andFilmidIsNotNull() {
            addCriterion("filmid is not null");
            return (Criteria) this;
        }

        public Criteria andFilmidEqualTo(String value) {
            addCriterion("filmid =", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotEqualTo(String value) {
            addCriterion("filmid <>", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidGreaterThan(String value) {
            addCriterion("filmid >", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidGreaterThanOrEqualTo(String value) {
            addCriterion("filmid >=", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLessThan(String value) {
            addCriterion("filmid <", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLessThanOrEqualTo(String value) {
            addCriterion("filmid <=", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLike(String value) {
            addCriterion("filmid like", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotLike(String value) {
            addCriterion("filmid not like", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidIn(List<String> values) {
            addCriterion("filmid in", values, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotIn(List<String> values) {
            addCriterion("filmid not in", values, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidBetween(String value1, String value2) {
            addCriterion("filmid between", value1, value2, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotBetween(String value1, String value2) {
            addCriterion("filmid not between", value1, value2, "filmid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andFilmnameIsNull() {
            addCriterion("filmname is null");
            return (Criteria) this;
        }

        public Criteria andFilmnameIsNotNull() {
            addCriterion("filmname is not null");
            return (Criteria) this;
        }

        public Criteria andFilmnameEqualTo(String value) {
            addCriterion("filmname =", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotEqualTo(String value) {
            addCriterion("filmname <>", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameGreaterThan(String value) {
            addCriterion("filmname >", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameGreaterThanOrEqualTo(String value) {
            addCriterion("filmname >=", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLessThan(String value) {
            addCriterion("filmname <", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLessThanOrEqualTo(String value) {
            addCriterion("filmname <=", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLike(String value) {
            addCriterion("filmname like", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotLike(String value) {
            addCriterion("filmname not like", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameIn(List<String> values) {
            addCriterion("filmname in", values, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotIn(List<String> values) {
            addCriterion("filmname not in", values, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameBetween(String value1, String value2) {
            addCriterion("filmname between", value1, value2, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotBetween(String value1, String value2) {
            addCriterion("filmname not between", value1, value2, "filmname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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