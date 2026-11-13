// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ImageUsage extends TeaModel {
    // 用量类型
    /**
     * <strong>example:</strong>
     * <p>IMAGE_GENERATION</p>
     */
    @NameInMap("usage_type")
    public String usageType;

    // 计量单位
    /**
     * <strong>example:</strong>
     * <p>IMAGE_COUNT</p>
     */
    @NameInMap("unit")
    public String unit;

    // 图片张数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("image_count")
    public Long imageCount;

    // 本次图片生成的实际消耗金额
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

    public static ImageUsage build(java.util.Map<String, ?> map) throws Exception {
        ImageUsage self = new ImageUsage();
        return TeaModel.build(map, self);
    }

    public ImageUsage setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public ImageUsage setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public ImageUsage setImageCount(Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Long getImageCount() {
        return this.imageCount;
    }

    public ImageUsage setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public ImageUsage setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
