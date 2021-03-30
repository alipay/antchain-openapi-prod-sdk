// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchcreateTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产id列表
    @NameInMap("asset_id_list")
    @Validation(required = true)
    public java.util.List<String> assetIdList;

    // 接收人id
    @NameInMap("transferee")
    @Validation(required = true)
    public String transferee;

    // 转让金额
    @NameInMap("monetary_amount")
    @Validation(required = true)
    public String monetaryAmount;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static BatchcreateTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTransferRequest self = new BatchcreateTransferRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateTransferRequest setAssetIdList(java.util.List<String> assetIdList) {
        this.assetIdList = assetIdList;
        return this;
    }
    public java.util.List<String> getAssetIdList() {
        return this.assetIdList;
    }

    public BatchcreateTransferRequest setTransferee(String transferee) {
        this.transferee = transferee;
        return this;
    }
    public String getTransferee() {
        return this.transferee;
    }

    public BatchcreateTransferRequest setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
        return this;
    }
    public String getMonetaryAmount() {
        return this.monetaryAmount;
    }

    public BatchcreateTransferRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
