// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CheckAiidentificationGoodspointRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户调用标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 品类
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 品牌
    @NameInMap("brand")
    @Validation(required = true)
    public String brand;

    // 款式
    @NameInMap("style")
    @Validation(required = true)
    public String style;

    // 鉴定点信息
    @NameInMap("point_info")
    @Validation(required = true)
    public BaiGoodsPoint pointInfo;

    public static CheckAiidentificationGoodspointRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAiidentificationGoodspointRequest self = new CheckAiidentificationGoodspointRequest();
        return TeaModel.build(map, self);
    }

    public CheckAiidentificationGoodspointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAiidentificationGoodspointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckAiidentificationGoodspointRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CheckAiidentificationGoodspointRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CheckAiidentificationGoodspointRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public CheckAiidentificationGoodspointRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public CheckAiidentificationGoodspointRequest setPointInfo(BaiGoodsPoint pointInfo) {
        this.pointInfo = pointInfo;
        return this;
    }
    public BaiGoodsPoint getPointInfo() {
        return this.pointInfo;
    }

}
