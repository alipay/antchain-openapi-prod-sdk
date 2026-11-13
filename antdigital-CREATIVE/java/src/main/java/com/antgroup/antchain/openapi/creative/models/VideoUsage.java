// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class VideoUsage extends TeaModel {
    // 用量类型
    /**
     * <strong>example:</strong>
     * <p>VIDEO_GENERATION</p>
     */
    @NameInMap("usage_type")
    public String usageType;

    // 计量单位
    /**
     * <strong>example:</strong>
     * <p>SECOND</p>
     */
    @NameInMap("unit")
    public String unit;

    // 视频时长（秒）
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("duration_seconds")
    public String durationSeconds;

    // 本次视频生成的实际消耗金额
    /**
     * <strong>example:</strong>
     * <p>0.11</p>
     */
    @NameInMap("original_price")
    public String originalPrice;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    public String currency;

    public static VideoUsage build(java.util.Map<String, ?> map) throws Exception {
        VideoUsage self = new VideoUsage();
        return TeaModel.build(map, self);
    }

    public VideoUsage setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public VideoUsage setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public VideoUsage setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public String getDurationSeconds() {
        return this.durationSeconds;
    }

    public VideoUsage setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public VideoUsage setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
