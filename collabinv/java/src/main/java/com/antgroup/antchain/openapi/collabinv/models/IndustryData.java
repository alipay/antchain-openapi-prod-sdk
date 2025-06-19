// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class IndustryData extends TeaModel {
    // 行业
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 区域
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 日期
    @NameInMap("trade_date")
    @Validation(required = true)
    public String tradeDate;

    // 线上线下 1:线下，0:线上，-1:全部
    @NameInMap("ofp_type")
    @Validation(required = true)
    public String ofpType;

    // 消费规模指数(销售金额)
    @NameInMap("trade_scale")
    @Validation(required = true)
    public String tradeScale;

    // 交易活跃指数(次数)
    @NameInMap("trade_activity")
    @Validation(required = true)
    public String tradeActivity;

    // 消费价值指数(金额/次数)
    @NameInMap("trade_value")
    @Validation(required = true)
    public String tradeValue;

    // 交易覆盖指数(去重人数)
    @NameInMap("trade_coverage")
    @Validation(required = true)
    public String tradeCoverage;

    public static IndustryData build(java.util.Map<String, ?> map) throws Exception {
        IndustryData self = new IndustryData();
        return TeaModel.build(map, self);
    }

    public IndustryData setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public IndustryData setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public IndustryData setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }

    public IndustryData setOfpType(String ofpType) {
        this.ofpType = ofpType;
        return this;
    }
    public String getOfpType() {
        return this.ofpType;
    }

    public IndustryData setTradeScale(String tradeScale) {
        this.tradeScale = tradeScale;
        return this;
    }
    public String getTradeScale() {
        return this.tradeScale;
    }

    public IndustryData setTradeActivity(String tradeActivity) {
        this.tradeActivity = tradeActivity;
        return this;
    }
    public String getTradeActivity() {
        return this.tradeActivity;
    }

    public IndustryData setTradeValue(String tradeValue) {
        this.tradeValue = tradeValue;
        return this;
    }
    public String getTradeValue() {
        return this.tradeValue;
    }

    public IndustryData setTradeCoverage(String tradeCoverage) {
        this.tradeCoverage = tradeCoverage;
        return this;
    }
    public String getTradeCoverage() {
        return this.tradeCoverage;
    }

}
