// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class CheckNftAssetbyskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 鲸探用户ID标识，OpenApi场景使用的加密格式
    @NameInMap("open_user_id")
    @Validation(required = true)
    public String openUserId;

    // 数字藏品类标识ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public Long skuId;

    public static CheckNftAssetbyskuRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckNftAssetbyskuRequest self = new CheckNftAssetbyskuRequest();
        return TeaModel.build(map, self);
    }

    public CheckNftAssetbyskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckNftAssetbyskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckNftAssetbyskuRequest setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
        return this;
    }
    public String getOpenUserId() {
        return this.openUserId;
    }

    public CheckNftAssetbyskuRequest setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

}
