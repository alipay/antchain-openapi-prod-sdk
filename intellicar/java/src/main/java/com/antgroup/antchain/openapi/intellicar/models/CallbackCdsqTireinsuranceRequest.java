// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class CallbackCdsqTireinsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static CallbackCdsqTireinsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackCdsqTireinsuranceRequest self = new CallbackCdsqTireinsuranceRequest();
        return TeaModel.build(map, self);
    }

    public CallbackCdsqTireinsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackCdsqTireinsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackCdsqTireinsuranceRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public CallbackCdsqTireinsuranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
