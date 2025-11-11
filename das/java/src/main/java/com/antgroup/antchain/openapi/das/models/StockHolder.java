// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class StockHolder extends TeaModel {
    // 股东类型
    /**
     * <strong>example:</strong>
     * <p>自然人</p>
     */
    @NameInMap("org_holder_type")
    public String orgHolderType;

    // 出资时间
    /**
     * <strong>example:</strong>
     * <p>2047-04-19</p>
     */
    @NameInMap("invest_date")
    public String investDate;

    // 占比
    /**
     * <strong>example:</strong>
     * <p>100.00%</p>
     */
    @NameInMap("invest_rate")
    public String investRate;

    // 出资金额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("subscript_amt")
    public String subscriptAmt;

    // 股东名
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("or_holder_name")
    public String orHolderName;

    public static StockHolder build(java.util.Map<String, ?> map) throws Exception {
        StockHolder self = new StockHolder();
        return TeaModel.build(map, self);
    }

    public StockHolder setOrgHolderType(String orgHolderType) {
        this.orgHolderType = orgHolderType;
        return this;
    }
    public String getOrgHolderType() {
        return this.orgHolderType;
    }

    public StockHolder setInvestDate(String investDate) {
        this.investDate = investDate;
        return this;
    }
    public String getInvestDate() {
        return this.investDate;
    }

    public StockHolder setInvestRate(String investRate) {
        this.investRate = investRate;
        return this;
    }
    public String getInvestRate() {
        return this.investRate;
    }

    public StockHolder setSubscriptAmt(String subscriptAmt) {
        this.subscriptAmt = subscriptAmt;
        return this;
    }
    public String getSubscriptAmt() {
        return this.subscriptAmt;
    }

    public StockHolder setOrHolderName(String orHolderName) {
        this.orHolderName = orHolderName;
        return this;
    }
    public String getOrHolderName() {
        return this.orHolderName;
    }

}
