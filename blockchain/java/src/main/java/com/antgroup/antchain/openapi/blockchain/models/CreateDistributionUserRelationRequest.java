// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionUserRelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上级用户唯一标识
    @NameInMap("from_user_id")
    public String fromUserId;

    // 商品唯一标识
    @NameInMap("item_id")
    public String itemId;

    // 商户唯一标识
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 来源，微信朋友圈/微信小程序/支付宝小程序/H5/商户自有APP/其他
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 用户唯一标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateDistributionUserRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionUserRelationRequest self = new CreateDistributionUserRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionUserRelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributionUserRelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributionUserRelationRequest setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }
    public String getFromUserId() {
        return this.fromUserId;
    }

    public CreateDistributionUserRelationRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public CreateDistributionUserRelationRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public CreateDistributionUserRelationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateDistributionUserRelationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
