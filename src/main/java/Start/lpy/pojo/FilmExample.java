package Start.lpy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FilmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNull() {
            addCriterion("film_name is null");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNotNull() {
            addCriterion("film_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilmNameEqualTo(String value) {
            addCriterion("film_name =", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotEqualTo(String value) {
            addCriterion("film_name <>", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThan(String value) {
            addCriterion("film_name >", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThanOrEqualTo(String value) {
            addCriterion("film_name >=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThan(String value) {
            addCriterion("film_name <", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThanOrEqualTo(String value) {
            addCriterion("film_name <=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLike(String value) {
            addCriterion("film_name like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotLike(String value) {
            addCriterion("film_name not like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameIn(List<String> values) {
            addCriterion("film_name in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotIn(List<String> values) {
            addCriterion("film_name not in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameBetween(String value1, String value2) {
            addCriterion("film_name between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotBetween(String value1, String value2) {
            addCriterion("film_name not between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmPictureIsNull() {
            addCriterion("film_picture is null");
            return (Criteria) this;
        }

        public Criteria andFilmPictureIsNotNull() {
            addCriterion("film_picture is not null");
            return (Criteria) this;
        }

        public Criteria andFilmPictureEqualTo(String value) {
            addCriterion("film_picture =", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureNotEqualTo(String value) {
            addCriterion("film_picture <>", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureGreaterThan(String value) {
            addCriterion("film_picture >", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureGreaterThanOrEqualTo(String value) {
            addCriterion("film_picture >=", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureLessThan(String value) {
            addCriterion("film_picture <", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureLessThanOrEqualTo(String value) {
            addCriterion("film_picture <=", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureLike(String value) {
            addCriterion("film_picture like", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureNotLike(String value) {
            addCriterion("film_picture not like", value, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureIn(List<String> values) {
            addCriterion("film_picture in", values, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureNotIn(List<String> values) {
            addCriterion("film_picture not in", values, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureBetween(String value1, String value2) {
            addCriterion("film_picture between", value1, value2, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmPictureNotBetween(String value1, String value2) {
            addCriterion("film_picture not between", value1, value2, "filmPicture");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIsNull() {
            addCriterion("film_length is null");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIsNotNull() {
            addCriterion("film_length is not null");
            return (Criteria) this;
        }

        public Criteria andFilmLengthEqualTo(Date value) {
            addCriterionForJDBCTime("film_length =", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotEqualTo(Date value) {
            addCriterionForJDBCTime("film_length <>", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthGreaterThan(Date value) {
            addCriterionForJDBCTime("film_length >", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("film_length >=", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLessThan(Date value) {
            addCriterionForJDBCTime("film_length <", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("film_length <=", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIn(List<Date> values) {
            addCriterionForJDBCTime("film_length in", values, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotIn(List<Date> values) {
            addCriterionForJDBCTime("film_length not in", values, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("film_length between", value1, value2, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("film_length not between", value1, value2, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeIsNull() {
            addCriterion("film_releasetime is null");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeIsNotNull() {
            addCriterion("film_releasetime is not null");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeEqualTo(Date value) {
            addCriterion("film_releasetime =", value, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeNotEqualTo(Date value) {
            addCriterion("film_releasetime <>", value, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeGreaterThan(Date value) {
            addCriterion("film_releasetime >", value, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("film_releasetime >=", value, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeLessThan(Date value) {
            addCriterion("film_releasetime <", value, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("film_releasetime <=", value, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeIn(List<Date> values) {
            addCriterion("film_releasetime in", values, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeNotIn(List<Date> values) {
            addCriterion("film_releasetime not in", values, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeBetween(Date value1, Date value2) {
            addCriterion("film_releasetime between", value1, value2, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("film_releasetime not between", value1, value2, "filmReleasetime");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorIsNull() {
            addCriterion("film_director is null");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorIsNotNull() {
            addCriterion("film_director is not null");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorEqualTo(String value) {
            addCriterion("film_director =", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorNotEqualTo(String value) {
            addCriterion("film_director <>", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorGreaterThan(String value) {
            addCriterion("film_director >", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("film_director >=", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorLessThan(String value) {
            addCriterion("film_director <", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorLessThanOrEqualTo(String value) {
            addCriterion("film_director <=", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorLike(String value) {
            addCriterion("film_director like", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorNotLike(String value) {
            addCriterion("film_director not like", value, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorIn(List<String> values) {
            addCriterion("film_director in", values, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorNotIn(List<String> values) {
            addCriterion("film_director not in", values, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorBetween(String value1, String value2) {
            addCriterion("film_director between", value1, value2, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmDirectorNotBetween(String value1, String value2) {
            addCriterion("film_director not between", value1, value2, "filmDirector");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsIsNull() {
            addCriterion("film_mainactors is null");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsIsNotNull() {
            addCriterion("film_mainactors is not null");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsEqualTo(String value) {
            addCriterion("film_mainactors =", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsNotEqualTo(String value) {
            addCriterion("film_mainactors <>", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsGreaterThan(String value) {
            addCriterion("film_mainactors >", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsGreaterThanOrEqualTo(String value) {
            addCriterion("film_mainactors >=", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsLessThan(String value) {
            addCriterion("film_mainactors <", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsLessThanOrEqualTo(String value) {
            addCriterion("film_mainactors <=", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsLike(String value) {
            addCriterion("film_mainactors like", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsNotLike(String value) {
            addCriterion("film_mainactors not like", value, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsIn(List<String> values) {
            addCriterion("film_mainactors in", values, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsNotIn(List<String> values) {
            addCriterion("film_mainactors not in", values, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsBetween(String value1, String value2) {
            addCriterion("film_mainactors between", value1, value2, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmMainactorsNotBetween(String value1, String value2) {
            addCriterion("film_mainactors not between", value1, value2, "filmMainactors");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryIsNull() {
            addCriterion("film_productorcountry is null");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryIsNotNull() {
            addCriterion("film_productorcountry is not null");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryEqualTo(String value) {
            addCriterion("film_productorcountry =", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryNotEqualTo(String value) {
            addCriterion("film_productorcountry <>", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryGreaterThan(String value) {
            addCriterion("film_productorcountry >", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryGreaterThanOrEqualTo(String value) {
            addCriterion("film_productorcountry >=", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryLessThan(String value) {
            addCriterion("film_productorcountry <", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryLessThanOrEqualTo(String value) {
            addCriterion("film_productorcountry <=", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryLike(String value) {
            addCriterion("film_productorcountry like", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryNotLike(String value) {
            addCriterion("film_productorcountry not like", value, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryIn(List<String> values) {
            addCriterion("film_productorcountry in", values, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryNotIn(List<String> values) {
            addCriterion("film_productorcountry not in", values, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryBetween(String value1, String value2) {
            addCriterion("film_productorcountry between", value1, value2, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmProductorcountryNotBetween(String value1, String value2) {
            addCriterion("film_productorcountry not between", value1, value2, "filmProductorcountry");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionIsNull() {
            addCriterion("film_description is null");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionIsNotNull() {
            addCriterion("film_description is not null");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionEqualTo(String value) {
            addCriterion("film_description =", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionNotEqualTo(String value) {
            addCriterion("film_description <>", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionGreaterThan(String value) {
            addCriterion("film_description >", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("film_description >=", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionLessThan(String value) {
            addCriterion("film_description <", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionLessThanOrEqualTo(String value) {
            addCriterion("film_description <=", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionLike(String value) {
            addCriterion("film_description like", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionNotLike(String value) {
            addCriterion("film_description not like", value, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionIn(List<String> values) {
            addCriterion("film_description in", values, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionNotIn(List<String> values) {
            addCriterion("film_description not in", values, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionBetween(String value1, String value2) {
            addCriterion("film_description between", value1, value2, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmDescriptionNotBetween(String value1, String value2) {
            addCriterion("film_description not between", value1, value2, "filmDescription");
            return (Criteria) this;
        }

        public Criteria andFilmPriceIsNull() {
            addCriterion("film_price is null");
            return (Criteria) this;
        }

        public Criteria andFilmPriceIsNotNull() {
            addCriterion("film_price is not null");
            return (Criteria) this;
        }

        public Criteria andFilmPriceEqualTo(Double value) {
            addCriterion("film_price =", value, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceNotEqualTo(Double value) {
            addCriterion("film_price <>", value, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceGreaterThan(Double value) {
            addCriterion("film_price >", value, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("film_price >=", value, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceLessThan(Double value) {
            addCriterion("film_price <", value, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceLessThanOrEqualTo(Double value) {
            addCriterion("film_price <=", value, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceIn(List<Double> values) {
            addCriterion("film_price in", values, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceNotIn(List<Double> values) {
            addCriterion("film_price not in", values, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceBetween(Double value1, Double value2) {
            addCriterion("film_price between", value1, value2, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmPriceNotBetween(Double value1, Double value2) {
            addCriterion("film_price not between", value1, value2, "filmPrice");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountIsNull() {
            addCriterion("film_clickcount is null");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountIsNotNull() {
            addCriterion("film_clickcount is not null");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountEqualTo(Integer value) {
            addCriterion("film_clickcount =", value, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountNotEqualTo(Integer value) {
            addCriterion("film_clickcount <>", value, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountGreaterThan(Integer value) {
            addCriterion("film_clickcount >", value, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_clickcount >=", value, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountLessThan(Integer value) {
            addCriterion("film_clickcount <", value, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountLessThanOrEqualTo(Integer value) {
            addCriterion("film_clickcount <=", value, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountIn(List<Integer> values) {
            addCriterion("film_clickcount in", values, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountNotIn(List<Integer> values) {
            addCriterion("film_clickcount not in", values, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountBetween(Integer value1, Integer value2) {
            addCriterion("film_clickcount between", value1, value2, "filmClickcount");
            return (Criteria) this;
        }

        public Criteria andFilmClickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("film_clickcount not between", value1, value2, "filmClickcount");
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