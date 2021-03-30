// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 被转让的对象
    @NameInMap("transferee")
    @Validation(required = true)
    public String transferee;

    // 转让金额
    @NameInMap("monetary_amount")
    @Validation(required = true)
    public String monetaryAmount;

    // 用户的标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransferRequest self = new CreateTransferRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTransferRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CreateTransferRequest setTransferee(String transferee) {
        this.transferee = transferee;
        return this;
    }
    public String getTransferee() {
        return this.transferee;
    }

    public CreateTransferRequest setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
        return this;
    }
    public String getMonetaryAmount() {
        return this.monetaryAmount;
    }

    public CreateTransferRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
