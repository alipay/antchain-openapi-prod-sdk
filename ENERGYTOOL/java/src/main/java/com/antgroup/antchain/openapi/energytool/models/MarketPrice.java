// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class MarketPrice extends TeaModel {
    // 市场码
    /**
     * <strong>example:</strong>
     * <p>JS</p>
     */
    @NameInMap("market_code")
    @Validation(required = true)
    public String marketCode;

    // 目标日期,格式 yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2026-07-12</p>
     */
    @NameInMap("target_date")
    @Validation(required = true)
    public String targetDate;

    // 查询类型:DAY_AHEAD/REALTIME
    /**
     * <strong>example:</strong>
     * <p>DAY_AHEAD</p>
     */
    @NameInMap("query_type")
    @Validation(required = true)
    public String queryType;

    // 价格类型
    /**
     * <strong>example:</strong>
     * <p>CLEARING</p>
     */
    @NameInMap("price_type")
    @Validation(required = true)
    public String priceType;

    // 时点编号,1~96 整数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 价格值,单位 元/MWh
    /**
     * <strong>example:</strong>
     * <p>100.50</p>
     */
    @NameInMap("price_value")
    @Validation(required = true)
    public String priceValue;

    // 数据源更新时间,ISO8601 格式
    /**
     * <strong>example:</strong>
     * <p>2026-07-12T08:00:00Z</p>
     */
    @NameInMap("source_updated_at")
    @Validation(required = true)
    public String sourceUpdatedAt;

    public static MarketPrice build(java.util.Map<String, ?> map) throws Exception {
        MarketPrice self = new MarketPrice();
        return TeaModel.build(map, self);
    }

    public MarketPrice setMarketCode(String marketCode) {
        this.marketCode = marketCode;
        return this;
    }
    public String getMarketCode() {
        return this.marketCode;
    }

    public MarketPrice setTargetDate(String targetDate) {
        this.targetDate = targetDate;
        return this;
    }
    public String getTargetDate() {
        return this.targetDate;
    }

    public MarketPrice setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public MarketPrice setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }
    public String getPriceType() {
        return this.priceType;
    }

    public MarketPrice setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public MarketPrice setPriceValue(String priceValue) {
        this.priceValue = priceValue;
        return this;
    }
    public String getPriceValue() {
        return this.priceValue;
    }

    public MarketPrice setSourceUpdatedAt(String sourceUpdatedAt) {
        this.sourceUpdatedAt = sourceUpdatedAt;
        return this;
    }
    public String getSourceUpdatedAt() {
        return this.sourceUpdatedAt;
    }

}
