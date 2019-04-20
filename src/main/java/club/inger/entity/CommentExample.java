package club.inger.entity;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andComposeTypeIsNull() {
            addCriterion("compose_type is null");
            return (Criteria) this;
        }

        public Criteria andComposeTypeIsNotNull() {
            addCriterion("compose_type is not null");
            return (Criteria) this;
        }

        public Criteria andComposeTypeEqualTo(String value) {
            addCriterion("compose_type =", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeNotEqualTo(String value) {
            addCriterion("compose_type <>", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeGreaterThan(String value) {
            addCriterion("compose_type >", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("compose_type >=", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeLessThan(String value) {
            addCriterion("compose_type <", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeLessThanOrEqualTo(String value) {
            addCriterion("compose_type <=", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeLike(String value) {
            addCriterion("compose_type like", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeNotLike(String value) {
            addCriterion("compose_type not like", value, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeIn(List<String> values) {
            addCriterion("compose_type in", values, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeNotIn(List<String> values) {
            addCriterion("compose_type not in", values, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeBetween(String value1, String value2) {
            addCriterion("compose_type between", value1, value2, "composeType");
            return (Criteria) this;
        }

        public Criteria andComposeTypeNotBetween(String value1, String value2) {
            addCriterion("compose_type not between", value1, value2, "composeType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Long value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Long value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Long value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Long value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Long> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Long> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Long value1, Long value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
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

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(String value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(String value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(String value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(String value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(String value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLike(String value) {
            addCriterion("comment_time like", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotLike(String value) {
            addCriterion("comment_time not like", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<String> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<String> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(String value1, String value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(String value1, String value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
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

        public Criteria andAcclaimCountEqualTo(Integer value) {
            addCriterion("acclaim_count =", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountNotEqualTo(Integer value) {
            addCriterion("acclaim_count <>", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountGreaterThan(Integer value) {
            addCriterion("acclaim_count >", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("acclaim_count >=", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountLessThan(Integer value) {
            addCriterion("acclaim_count <", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountLessThanOrEqualTo(Integer value) {
            addCriterion("acclaim_count <=", value, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountIn(List<Integer> values) {
            addCriterion("acclaim_count in", values, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountNotIn(List<Integer> values) {
            addCriterion("acclaim_count not in", values, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountBetween(Integer value1, Integer value2) {
            addCriterion("acclaim_count between", value1, value2, "acclaimCount");
            return (Criteria) this;
        }

        public Criteria andAcclaimCountNotBetween(Integer value1, Integer value2) {
            addCriterion("acclaim_count not between", value1, value2, "acclaimCount");
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