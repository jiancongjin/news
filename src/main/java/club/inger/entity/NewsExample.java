package club.inger.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(Date value) {
            addCriterion("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(Date value) {
            addCriterion("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(Date value) {
            addCriterion("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(Date value) {
            addCriterion("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<Date> values) {
            addCriterion("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<Date> values) {
            addCriterion("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(Date value1, Date value2) {
            addCriterion("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andCategroyIsNull() {
            addCriterion("categroy is null");
            return (Criteria) this;
        }

        public Criteria andCategroyIsNotNull() {
            addCriterion("categroy is not null");
            return (Criteria) this;
        }

        public Criteria andCategroyEqualTo(String value) {
            addCriterion("categroy =", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotEqualTo(String value) {
            addCriterion("categroy <>", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyGreaterThan(String value) {
            addCriterion("categroy >", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyGreaterThanOrEqualTo(String value) {
            addCriterion("categroy >=", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyLessThan(String value) {
            addCriterion("categroy <", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyLessThanOrEqualTo(String value) {
            addCriterion("categroy <=", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyLike(String value) {
            addCriterion("categroy like", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotLike(String value) {
            addCriterion("categroy not like", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyIn(List<String> values) {
            addCriterion("categroy in", values, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotIn(List<String> values) {
            addCriterion("categroy not in", values, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyBetween(String value1, String value2) {
            addCriterion("categroy between", value1, value2, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotBetween(String value1, String value2) {
            addCriterion("categroy not between", value1, value2, "categroy");
            return (Criteria) this;
        }

        public Criteria andAntuorNameIsNull() {
            addCriterion("antuor_name is null");
            return (Criteria) this;
        }

        public Criteria andAntuorNameIsNotNull() {
            addCriterion("antuor_name is not null");
            return (Criteria) this;
        }

        public Criteria andAntuorNameEqualTo(String value) {
            addCriterion("antuor_name =", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameNotEqualTo(String value) {
            addCriterion("antuor_name <>", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameGreaterThan(String value) {
            addCriterion("antuor_name >", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameGreaterThanOrEqualTo(String value) {
            addCriterion("antuor_name >=", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameLessThan(String value) {
            addCriterion("antuor_name <", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameLessThanOrEqualTo(String value) {
            addCriterion("antuor_name <=", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameLike(String value) {
            addCriterion("antuor_name like", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameNotLike(String value) {
            addCriterion("antuor_name not like", value, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameIn(List<String> values) {
            addCriterion("antuor_name in", values, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameNotIn(List<String> values) {
            addCriterion("antuor_name not in", values, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameBetween(String value1, String value2) {
            addCriterion("antuor_name between", value1, value2, "antuorName");
            return (Criteria) this;
        }

        public Criteria andAntuorNameNotBetween(String value1, String value2) {
            addCriterion("antuor_name not between", value1, value2, "antuorName");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyIsNull() {
            addCriterion("unique_key is null");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyIsNotNull() {
            addCriterion("unique_key is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyEqualTo(String value) {
            addCriterion("unique_key =", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyNotEqualTo(String value) {
            addCriterion("unique_key <>", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyGreaterThan(String value) {
            addCriterion("unique_key >", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyGreaterThanOrEqualTo(String value) {
            addCriterion("unique_key >=", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyLessThan(String value) {
            addCriterion("unique_key <", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyLessThanOrEqualTo(String value) {
            addCriterion("unique_key <=", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyLike(String value) {
            addCriterion("unique_key like", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyNotLike(String value) {
            addCriterion("unique_key not like", value, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyIn(List<String> values) {
            addCriterion("unique_key in", values, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyNotIn(List<String> values) {
            addCriterion("unique_key not in", values, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyBetween(String value1, String value2) {
            addCriterion("unique_key between", value1, value2, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andUniqueKeyNotBetween(String value1, String value2) {
            addCriterion("unique_key not between", value1, value2, "uniqueKey");
            return (Criteria) this;
        }

        public Criteria andNewsCountIsNull() {
            addCriterion("news_count is null");
            return (Criteria) this;
        }

        public Criteria andNewsCountIsNotNull() {
            addCriterion("news_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewsCountEqualTo(Long value) {
            addCriterion("news_count =", value, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountNotEqualTo(Long value) {
            addCriterion("news_count <>", value, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountGreaterThan(Long value) {
            addCriterion("news_count >", value, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountGreaterThanOrEqualTo(Long value) {
            addCriterion("news_count >=", value, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountLessThan(Long value) {
            addCriterion("news_count <", value, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountLessThanOrEqualTo(Long value) {
            addCriterion("news_count <=", value, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountIn(List<Long> values) {
            addCriterion("news_count in", values, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountNotIn(List<Long> values) {
            addCriterion("news_count not in", values, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountBetween(Long value1, Long value2) {
            addCriterion("news_count between", value1, value2, "newsCount");
            return (Criteria) this;
        }

        public Criteria andNewsCountNotBetween(Long value1, Long value2) {
            addCriterion("news_count not between", value1, value2, "newsCount");
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