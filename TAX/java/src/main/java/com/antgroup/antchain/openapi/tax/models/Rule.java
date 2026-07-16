// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class Rule extends TeaModel {
    // 字段值的类型，常见有 string | number| boolean | _array_
    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // type 为 string 类型时，表示字符串长度；number 类型时表示确定数字； array 类型时表示数组长度
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("len")
    @Validation(required = true)
    public Long len;

    // type 为 string 类型时，表示字符串最大长度；number 类型时表示最大值；array 类型时表示数组最大长度
    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("max")
    @Validation(required = true)
    public Long max;

    // type 为 string 类型时，表示字符串最小长度；number 类型时表示最小值；array 类型时表示数组最小长度
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("min")
    @Validation(required = true)
    public Long min;

    // 校验出错时显示的错误消息
    /**
     * <strong>example:</strong>
     * <p>重新输入</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 是否必填
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 正则表达式,
    /**
     * <strong>example:</strong>
     * <p>d</p>
     */
    @NameInMap("reg_pattern")
    @Validation(required = true)
    public String regPattern;

    public static Rule build(java.util.Map<String, ?> map) throws Exception {
        Rule self = new Rule();
        return TeaModel.build(map, self);
    }

    public Rule setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Rule setLen(Long len) {
        this.len = len;
        return this;
    }
    public Long getLen() {
        return this.len;
    }

    public Rule setMax(Long max) {
        this.max = max;
        return this;
    }
    public Long getMax() {
        return this.max;
    }

    public Rule setMin(Long min) {
        this.min = min;
        return this;
    }
    public Long getMin() {
        return this.min;
    }

    public Rule setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Rule setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public Rule setRegPattern(String regPattern) {
        this.regPattern = regPattern;
        return this;
    }
    public String getRegPattern() {
        return this.regPattern;
    }

}
