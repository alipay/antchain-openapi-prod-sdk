// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PriceConditionAttr extends TeaModel {
    // 属性code
    /**
     * <strong>example:</strong>
     * <p>属性code</p>
     */
    @NameInMap("attr_code")
    @Validation(required = true)
    public String attrCode;

    // 属性值code
    /**
     * <strong>example:</strong>
     * <p>属性值code</p>
     */
    @NameInMap("attr_value_code")
    @Validation(required = true)
    public String attrValueCode;

    // 属性值名称
    /**
     * <strong>example:</strong>
     * <p>属性值名称</p>
     */
    @NameInMap("attr_value_name")
    @Validation(required = true)
    public String attrValueName;

    // 运算符，只有在约束条件中会出现
    /**
     * <strong>example:</strong>
     * <p>运算符</p>
     */
    @NameInMap("operator")
    public String operator;

    public static PriceConditionAttr build(java.util.Map<String, ?> map) throws Exception {
        PriceConditionAttr self = new PriceConditionAttr();
        return TeaModel.build(map, self);
    }

    public PriceConditionAttr setAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }
    public String getAttrCode() {
        return this.attrCode;
    }

    public PriceConditionAttr setAttrValueCode(String attrValueCode) {
        this.attrValueCode = attrValueCode;
        return this;
    }
    public String getAttrValueCode() {
        return this.attrValueCode;
    }

    public PriceConditionAttr setAttrValueName(String attrValueName) {
        this.attrValueName = attrValueName;
        return this;
    }
    public String getAttrValueName() {
        return this.attrValueName;
    }

    public PriceConditionAttr setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
