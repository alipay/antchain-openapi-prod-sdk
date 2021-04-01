// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionProductItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分销比例  10 表示 10%
    @NameInMap("distribution_rate")
    @Validation(required = true)
    public String distributionRate;

    // 上架时间戳
    @NameInMap("enable_date")
    @Validation(required = true)
    public String enableDate;

    // 划线价格
    @NameInMap("line_price")
    @Validation(required = true)
    public String linePrice;

    // 商品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商品封面图片url
    @NameInMap("product_img")
    @Validation(required = true)
    public String productImg;

    // 商品信息
    @NameInMap("product_info")
    @Validation(required = true)
    public String productInfo;

    // 商品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 商品价格
    @NameInMap("product_price")
    @Validation(required = true)
    public String productPrice;

    // 商品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 商户id
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    public static CreateDistributionProductItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionProductItemRequest self = new CreateDistributionProductItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionProductItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributionProductItemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributionProductItemRequest setDistributionRate(String distributionRate) {
        this.distributionRate = distributionRate;
        return this;
    }
    public String getDistributionRate() {
        return this.distributionRate;
    }

    public CreateDistributionProductItemRequest setEnableDate(String enableDate) {
        this.enableDate = enableDate;
        return this;
    }
    public String getEnableDate() {
        return this.enableDate;
    }

    public CreateDistributionProductItemRequest setLinePrice(String linePrice) {
        this.linePrice = linePrice;
        return this;
    }
    public String getLinePrice() {
        return this.linePrice;
    }

    public CreateDistributionProductItemRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateDistributionProductItemRequest setProductImg(String productImg) {
        this.productImg = productImg;
        return this;
    }
    public String getProductImg() {
        return this.productImg;
    }

    public CreateDistributionProductItemRequest setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public String getProductInfo() {
        return this.productInfo;
    }

    public CreateDistributionProductItemRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateDistributionProductItemRequest setProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public String getProductPrice() {
        return this.productPrice;
    }

    public CreateDistributionProductItemRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateDistributionProductItemRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
