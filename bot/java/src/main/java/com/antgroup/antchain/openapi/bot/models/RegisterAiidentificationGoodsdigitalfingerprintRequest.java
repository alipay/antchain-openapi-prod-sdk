// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterAiidentificationGoodsdigitalfingerprintRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 商品数字指纹信息
    @NameInMap("goods_info")
    @Validation(required = true)
    public GoodsDigitalFingerprintInfo goodsInfo;

    // 商品数字指纹用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public GoodsDigitalFingerprintUserInfo userInfo;

    public static RegisterAiidentificationGoodsdigitalfingerprintRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAiidentificationGoodsdigitalfingerprintRequest self = new RegisterAiidentificationGoodsdigitalfingerprintRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAiidentificationGoodsdigitalfingerprintRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAiidentificationGoodsdigitalfingerprintRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAiidentificationGoodsdigitalfingerprintRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RegisterAiidentificationGoodsdigitalfingerprintRequest setGoodsInfo(GoodsDigitalFingerprintInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public GoodsDigitalFingerprintInfo getGoodsInfo() {
        return this.goodsInfo;
    }

    public RegisterAiidentificationGoodsdigitalfingerprintRequest setUserInfo(GoodsDigitalFingerprintUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GoodsDigitalFingerprintUserInfo getUserInfo() {
        return this.userInfo;
    }

}
