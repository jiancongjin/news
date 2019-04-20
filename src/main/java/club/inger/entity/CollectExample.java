package club.inger.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterion("collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterion("collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterion("collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterion("collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterion("collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterion("collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterion("collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("news_url is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("news_url is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("news_url =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("news_url <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("news_url >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("news_url >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("news_url <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("news_url <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("news_url like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("news_url not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("news_url in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("news_url not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("news_url between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("news_url not between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNull() {
            addCriterion("news_type is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNotNull() {
            addCriterion("news_type is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeEqualTo(String value) {
            addCriterion("news_type =", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotEqualTo(String value) {
            addCriterion("news_type <>", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThan(String value) {
            addCriterion("news_type >", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("news_type >=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThan(String value) {
            addCriterion("news_type <", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThanOrEqualTo(String value) {
            addCriterion("news_type <=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLike(String value) {
            addCriterion("news_type like", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotLike(String value) {
            addCriterion("news_type not like", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIn(List<String> values) {
            addCriterion("news_type in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotIn(List<String> values) {
            addCriterion("news_type not in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeBetween(String value1, String value2) {
            addCriterion("news_type between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotBetween(String value1, String value2) {
            addCriterion("news_type not between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyIsNull() {
            addCriterion("user_unique_key is null");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyIsNotNull() {
            addCriterion("user_unique_key is not null");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyEqualTo(String value) {
            addCriterion("user_unique_key =", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyNotEqualTo(String value) {
            addCriterion("user_unique_key <>", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyGreaterThan(String value) {
            addCriterion("user_unique_key >", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyGreaterThanOrEqualTo(String value) {
            addCriterion("user_unique_key >=", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyLessThan(String value) {
            addCriterion("user_unique_key <", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyLessThanOrEqualTo(String value) {
            addCriterion("user_unique_key <=", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyLike(String value) {
            addCriterion("user_unique_key like", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyNotLike(String value) {
            addCriterion("user_unique_key not like", value, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyIn(List<String> values) {
            addCriterion("user_unique_key in", values, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyNotIn(List<String> values) {
            addCriterion("user_unique_key not in", values, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyBetween(String value1, String value2) {
            addCriterion("user_unique_key between", value1, value2, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andUserUniqueKeyNotBetween(String value1, String value2) {
            addCriterion("user_unique_key not between", value1, value2, "userUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyIsNull() {
            addCriterion("news_unique_key is null");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyIsNotNull() {
            addCriterion("news_unique_key is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyEqualTo(String value) {
            addCriterion("news_unique_key =", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyNotEqualTo(String value) {
            addCriterion("news_unique_key <>", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyGreaterThan(String value) {
            addCriterion("news_unique_key >", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyGreaterThanOrEqualTo(String value) {
            addCriterion("news_unique_key >=", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyLessThan(String value) {
            addCriterion("news_unique_key <", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyLessThanOrEqualTo(String value) {
            addCriterion("news_unique_key <=", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyLike(String value) {
            addCriterion("news_unique_key like", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyNotLike(String value) {
            addCriterion("news_unique_key not like", value, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyIn(List<String> values) {
            addCriterion("news_unique_key in", values, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyNotIn(List<String> values) {
            addCriterion("news_unique_key not in", values, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyBetween(String value1, String value2) {
            addCriterion("news_unique_key between", value1, value2, "newsUniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsUniqueKeyNotBetween(String value1, String value2) {
            addCriterion("news_unique_key not between", value1, value2, "newsUniqueKey");
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