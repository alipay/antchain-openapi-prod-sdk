// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureQuotationOfferPrice extends TeaModel {
    // 定价条件
    @NameInMap("condition_attrs")
    public java.util.List<ExpenditureQuotationOfferPriceConditionAttr> conditionAttrs;

    // 阶梯起始值
    @NameInMap("ladder_start")
    @Validation(required = true)
    public String ladderStart;

    // 阶梯结束值
    @NameInMap("ladder_end")
    @Validation(required = true)
    public String ladderEnd;

    // 价格
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    public static ExpenditureQuotationOfferPrice build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotationOfferPrice self = new ExpenditureQuotationOfferPrice();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotationOfferPrice setConditionAttrs(java.util.List<ExpenditureQuotationOfferPriceConditionAttr> conditionAttrs) {
        this.conditionAttrs = conditionAttrs;
        return this;
    }
    public java.util.List<ExpenditureQuotationOfferPriceConditionAttr> getConditionAttrs() {
        return this.conditionAttrs;
    }

    public ExpenditureQuotationOfferPrice setLadderStart(String ladderStart) {
        this.ladderStart = ladderStart;
        return this;
    }
    public String getLadderStart() {
        return this.ladderStart;
    }

    public ExpenditureQuotationOfferPrice setLadderEnd(String ladderEnd) {
        this.ladderEnd = ladderEnd;
        return this;
    }
    public String getLadderEnd() {
        return this.ladderEnd;
    }

    public ExpenditureQuotationOfferPrice setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public ExpenditureQuotationOfferPrice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
