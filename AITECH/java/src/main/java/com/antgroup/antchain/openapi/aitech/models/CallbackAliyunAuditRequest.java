// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class CallbackAliyunAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回执原文
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    // 回执场景，固定填写 ALIYUN"
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static CallbackAliyunAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAliyunAuditRequest self = new CallbackAliyunAuditRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAliyunAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAliyunAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAliyunAuditRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public CallbackAliyunAuditRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
