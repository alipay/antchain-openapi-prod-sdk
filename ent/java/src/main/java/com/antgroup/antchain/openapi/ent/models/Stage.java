// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class Stage extends TeaModel {
    // 票数区间上限
    @NameInMap("upper_limit")
    @Validation(required = true)
    public Long upperLimit;

    // 票数区间下限
    @NameInMap("lower_limit")
    @Validation(required = true)
    public Long lowerLimit;

    // 当前区间粉丝粒数量，单位分个
    @NameInMap("token_amount")
    @Validation(required = true)
    public Long tokenAmount;

    // 当前区间粉丝粒价格，单位分
    @NameInMap("token_price")
    @Validation(required = true)
    public Long tokenPrice;

    public static Stage build(java.util.Map<String, ?> map) throws Exception {
        Stage self = new Stage();
        return TeaModel.build(map, self);
    }

    public Stage setUpperLimit(Long upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }
    public Long getUpperLimit() {
        return this.upperLimit;
    }

    public Stage setLowerLimit(Long lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }
    public Long getLowerLimit() {
        return this.lowerLimit;
    }

    public Stage setTokenAmount(Long tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public Long getTokenAmount() {
        return this.tokenAmount;
    }

    public Stage setTokenPrice(Long tokenPrice) {
        this.tokenPrice = tokenPrice;
        return this;
    }
    public Long getTokenPrice() {
        return this.tokenPrice;
    }

}
