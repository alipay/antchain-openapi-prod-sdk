// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class EquityDetail extends TeaModel {
    // 权益描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 权益描述图片OSS地址（分号;分隔）
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 权益ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 权益名称
    @NameInMap("equity_name")
    @Validation(required = true)
    public String equityName;

    // 权益类型
    @NameInMap("equity_type")
    @Validation(required = true)
    public String equityType;

    // 权益面值(元)
    @NameInMap("equity_value")
    @Validation(required = true)
    public String equityValue;

    // 权益主图片OSS地址（分号;分隔）
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 对客价(元)
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 权益SKU
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static EquityDetail build(java.util.Map<String, ?> map) throws Exception {
        EquityDetail self = new EquityDetail();
        return TeaModel.build(map, self);
    }

    public EquityDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EquityDetail setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public EquityDetail setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public EquityDetail setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public EquityDetail setEquityType(String equityType) {
        this.equityType = equityType;
        return this;
    }
    public String getEquityType() {
        return this.equityType;
    }

    public EquityDetail setEquityValue(String equityValue) {
        this.equityValue = equityValue;
        return this;
    }
    public String getEquityValue() {
        return this.equityValue;
    }

    public EquityDetail setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public EquityDetail setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public EquityDetail setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
