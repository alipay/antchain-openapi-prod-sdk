// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class AudioUsage extends TeaModel {
    // 用量类型
    /**
     * <strong>example:</strong>
     * <p>AUDIO_GENERATION</p>
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

    // 音频时长（秒）
    /**
     * <strong>example:</strong>
     * <p>10.6</p>
     */
    @NameInMap("duration_seconds")
    public String durationSeconds;

    // 音频数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    public Long count;

    // 本次音频生成的实际消耗金额（必返）
    /**
     * <strong>example:</strong>
     * <p>10.11</p>
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

    public static AudioUsage build(java.util.Map<String, ?> map) throws Exception {
        AudioUsage self = new AudioUsage();
        return TeaModel.build(map, self);
    }

    public AudioUsage setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public AudioUsage setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public AudioUsage setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public String getDurationSeconds() {
        return this.durationSeconds;
    }

    public AudioUsage setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public AudioUsage setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public AudioUsage setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
