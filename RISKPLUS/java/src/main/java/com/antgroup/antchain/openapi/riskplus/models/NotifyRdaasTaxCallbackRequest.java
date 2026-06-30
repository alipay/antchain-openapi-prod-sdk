// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyRdaasTaxCallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通知场景
    @NameInMap("notify_scene")
    @Validation(required = true)
    public String notifyScene;

    // 租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 解决方案id
    @NameInMap("solution_id")
    public String solutionId;

    // 通知回调地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 业务参数
    @NameInMap("json_biz_params")
    public String jsonBizParams;

    public static NotifyRdaasTaxCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyRdaasTaxCallbackRequest self = new NotifyRdaasTaxCallbackRequest();
        return TeaModel.build(map, self);
    }

    public NotifyRdaasTaxCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyRdaasTaxCallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyRdaasTaxCallbackRequest setNotifyScene(String notifyScene) {
        this.notifyScene = notifyScene;
        return this;
    }
    public String getNotifyScene() {
        return this.notifyScene;
    }

    public NotifyRdaasTaxCallbackRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public NotifyRdaasTaxCallbackRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public NotifyRdaasTaxCallbackRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public NotifyRdaasTaxCallbackRequest setJsonBizParams(String jsonBizParams) {
        this.jsonBizParams = jsonBizParams;
        return this;
    }
    public String getJsonBizParams() {
        return this.jsonBizParams;
    }

}
