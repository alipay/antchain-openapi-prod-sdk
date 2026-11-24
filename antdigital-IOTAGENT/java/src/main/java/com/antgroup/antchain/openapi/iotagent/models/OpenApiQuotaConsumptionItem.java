// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiQuotaConsumptionItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-11-17T00:00:00+08:00</p>
     */
    @NameInMap("period_start")
    @Validation(required = true)
    public String periodStart;

    /**
     * <strong>example:</strong>
     * <p>2026-11-17T00:00:00+08:00</p>
     */
    @NameInMap("period_end")
    @Validation(required = true)
    public String periodEnd;

    // 实际可靠统计区间起点；未覆盖为null
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("counted_from")
    @Validation(required = true)
    public String countedFrom;

    // 实际可靠统计区间终点，不晚于asOf；未覆盖为null
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("counted_to")
    @Validation(required = true)
    public String countedTo;

    // 整个周期的已提交扣款流水有可靠覆盖；不代表所有运行消费已发送结算
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("complete")
    @Validation(required = true)
    public Boolean complete;

    // CONSUME毛消费；部分覆盖仅统计countedFrom/to，无可靠覆盖为null，不补0
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("used")
    @Validation(required = true)
    public Long used;

    // 枚举:QUOTA_POINT
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static OpenApiQuotaConsumptionItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiQuotaConsumptionItem self = new OpenApiQuotaConsumptionItem();
        return TeaModel.build(map, self);
    }

    public OpenApiQuotaConsumptionItem setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public OpenApiQuotaConsumptionItem setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public OpenApiQuotaConsumptionItem setCountedFrom(String countedFrom) {
        this.countedFrom = countedFrom;
        return this;
    }
    public String getCountedFrom() {
        return this.countedFrom;
    }

    public OpenApiQuotaConsumptionItem setCountedTo(String countedTo) {
        this.countedTo = countedTo;
        return this;
    }
    public String getCountedTo() {
        return this.countedTo;
    }

    public OpenApiQuotaConsumptionItem setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public OpenApiQuotaConsumptionItem setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public OpenApiQuotaConsumptionItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
