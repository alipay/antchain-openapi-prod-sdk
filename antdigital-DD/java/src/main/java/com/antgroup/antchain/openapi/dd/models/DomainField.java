// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class DomainField extends TeaModel {
    // 计量项code
    /**
     * <strong>example:</strong>
     * <p>request_num</p>
     */
    @NameInMap("code")
    public String code;

    // 计量项英文名
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("english_name")
    public String englishName;

    // 计量字段中文名称
    /**
     * <strong>example:</strong>
     * <p>调用量</p>
     */
    @NameInMap("chinese_name")
    public String chineseName;

    //    枚举，可选
    //       配置型
    //      消耗型
    //      *其他
    /**
     * <strong>example:</strong>
     * <p>config</p>
     */
    @NameInMap("field_type")
    public String fieldType;

    // 字段构成索引时的格式化长度<br>
    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("format_length")
    public String formatLength;

    // 默认值,可选
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("default_value")
    public String defaultValue;

    // 是否必填，默认必填写
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("if_null")
    public String ifNull;

    // 是否增量推送
    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("if_increment")
    public String ifIncrement;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>元</p>
     */
    @NameInMap("unit")
    public String unit;

    // 计量项说明
    /**
     * <strong>example:</strong>
     * <p>计量项说明</p>
     */
    @NameInMap("remark")
    public String remark;

    // 关联字段排序
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("column")
    public String column;

    // 计量项值约束
    @NameInMap("field_value_limit")
    public FieldValueLimit fieldValueLimit;

    // 聚合方式
    /**
     * <strong>example:</strong>
     * <p>SUM</p>
     */
    @NameInMap("aggregation_type")
    public String aggregationType;

    public static DomainField build(java.util.Map<String, ?> map) throws Exception {
        DomainField self = new DomainField();
        return TeaModel.build(map, self);
    }

    public DomainField setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DomainField setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public DomainField setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public DomainField setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

    public DomainField setFormatLength(String formatLength) {
        this.formatLength = formatLength;
        return this;
    }
    public String getFormatLength() {
        return this.formatLength;
    }

    public DomainField setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public DomainField setIfNull(String ifNull) {
        this.ifNull = ifNull;
        return this;
    }
    public String getIfNull() {
        return this.ifNull;
    }

    public DomainField setIfIncrement(String ifIncrement) {
        this.ifIncrement = ifIncrement;
        return this;
    }
    public String getIfIncrement() {
        return this.ifIncrement;
    }

    public DomainField setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DomainField setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DomainField setColumn(String column) {
        this.column = column;
        return this;
    }
    public String getColumn() {
        return this.column;
    }

    public DomainField setFieldValueLimit(FieldValueLimit fieldValueLimit) {
        this.fieldValueLimit = fieldValueLimit;
        return this;
    }
    public FieldValueLimit getFieldValueLimit() {
        return this.fieldValueLimit;
    }

    public DomainField setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }
    public String getAggregationType() {
        return this.aggregationType;
    }

}
