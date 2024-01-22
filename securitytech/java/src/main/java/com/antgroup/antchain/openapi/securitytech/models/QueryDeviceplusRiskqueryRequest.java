// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDeviceplusRiskqueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户id
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 加密电话号码
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    public static QueryDeviceplusRiskqueryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceplusRiskqueryRequest self = new QueryDeviceplusRiskqueryRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceplusRiskqueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceplusRiskqueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceplusRiskqueryRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryDeviceplusRiskqueryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceplusRiskqueryRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryDeviceplusRiskqueryRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
