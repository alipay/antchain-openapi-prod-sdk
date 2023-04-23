// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureQuotationOfferPriceConditionAttr extends TeaModel {
    // 属性code
    @NameInMap("attr_code")
    @Validation(required = true)
    public String attrCode;

    // 属性值code
    @NameInMap("attr_value_code")
    @Validation(required = true)
    public String attrValueCode;

    // 属性值名称
    @NameInMap("attr_value_name")
    @Validation(required = true)
    public String attrValueName;

    // 运算符
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static ExpenditureQuotationOfferPriceConditionAttr build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotationOfferPriceConditionAttr self = new ExpenditureQuotationOfferPriceConditionAttr();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotationOfferPriceConditionAttr setAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }
    public String getAttrCode() {
        return this.attrCode;
    }

    public ExpenditureQuotationOfferPriceConditionAttr setAttrValueCode(String attrValueCode) {
        this.attrValueCode = attrValueCode;
        return this;
    }
    public String getAttrValueCode() {
        return this.attrValueCode;
    }

    public ExpenditureQuotationOfferPriceConditionAttr setAttrValueName(String attrValueName) {
        this.attrValueName = attrValueName;
        return this;
    }
    public String getAttrValueName() {
        return this.attrValueName;
    }

    public ExpenditureQuotationOfferPriceConditionAttr setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
