package club.inger.entity;

import java.util.ArrayList;
import java.util.List;

public class ZanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZanExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeIsNull() {
            addCriterion("acclaim_type is null");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeIsNotNull() {
            addCriterion("acclaim_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeEqualTo(Integer value) {
            addCriterion("acclaim_type =", value, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeNotEqualTo(Integer value) {
            addCriterion("acclaim_type <>", value, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeGreaterThan(Integer value) {
            addCriterion("acclaim_type >", value, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("acclaim_type >=", value, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeLessThan(Integer value) {
            addCriterion("acclaim_type <", value, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeLessThanOrEqualTo(Integer value) {
            addCriterion("acclaim_type <=", value, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeIn(List<Integer> values) {
            addCriterion("acclaim_type in", values, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeNotIn(List<Integer> values) {
            addCriterion("acclaim_type not in", values, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeBetween(Integer value1, Integer value2) {
            addCriterion("acclaim_type between", value1, value2, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andAcclaimTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("acclaim_type not between", value1, value2, "acclaimType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusIsNull() {
            addCriterion("acclaim_status is null");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusIsNotNull() {
            addCriterion("acclaim_status is not null");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusEqualTo(Integer value) {
            addCriterion("acclaim_status =", value, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusNotEqualTo(Integer value) {
            addCriterion("acclaim_status <>", value, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusGreaterThan(Integer value) {
            addCriterion("acclaim_status >", value, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("acclaim_status >=", value, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusLessThan(Integer value) {
            addCriterion("acclaim_status <", value, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusLessThanOrEqualTo(Integer value) {
            addCriterion("acclaim_status <=", value, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusIn(List<Integer> values) {
            addCriterion("acclaim_status in", values, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusNotIn(List<Integer> values) {
            addCriterion("acclaim_status not in", values, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusBetween(Integer value1, Integer value2) {
            addCriterion("acclaim_status between", value1, value2, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("acclaim_status not between", value1, value2, "acclaimStatus");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountIsNull() {
            addCriterion("acclaim_count is null");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountIsNotNull() {
            addCriterion("acclaim_count is not null");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountEqualTo(Long value) {
            addCriterion("acclaim_count =", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountNotEqualTo(Long value) {
            addCriterion("acclaim_count <>", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountGreaterThan(Long value) {
            addCriterion("acclaim_count >", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountGreaterThanOrEqualTo(Long value) {
            addCriterion("acclaim_count >=", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountLessThan(Long value) {
            addCriterion("acclaim_count <", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountLessThanOrEqualTo(Long value) {
            addCriterion("acclaim_count <=", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountIn(List<Long> values) {
            addCriterion("acclaim_count in", values, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountNotIn(List<Long> values) {
            addCriterion("acclaim_count not in", values, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountBetween(Long value1, Long value2) {
            addCriterion("acclaim_count between", value1, value2, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountNotBetween(Long value1, Long value2) {
            addCriterion("acclaim_count not between", value1, value2, "acclaimCount");
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

        public Criteria andCommentUniqueKeyIsNull() {
            addCriterion("comment_unique_key is null");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyIsNotNull() {
            addCriterion("comment_unique_key is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyEqualTo(String value) {
            addCriterion("comment_unique_key =", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyNotEqualTo(String value) {
            addCriterion("comment_unique_key <>", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyGreaterThan(String value) {
            addCriterion("comment_unique_key >", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyGreaterThanOrEqualTo(String value) {
            addCriterion("comment_unique_key >=", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyLessThan(String value) {
            addCriterion("comment_unique_key <", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyLessThanOrEqualTo(String value) {
            addCriterion("comment_unique_key <=", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyLike(String value) {
            addCriterion("comment_unique_key like", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyNotLike(String value) {
            addCriterion("comment_unique_key not like", value, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyIn(List<String> values) {
            addCriterion("comment_unique_key in", values, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyNotIn(List<String> values) {
            addCriterion("comment_unique_key not in", values, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyBetween(String value1, String value2) {
            addCriterion("comment_unique_key between", value1, value2, "commentUniqueKey");
            return (Criteria) this;
        }

        public Criteria andCommentUniqueKeyNotBetween(String value1, String value2) {
            addCriterion("comment_unique_key not between", value1, value2, "commentUniqueKey");
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