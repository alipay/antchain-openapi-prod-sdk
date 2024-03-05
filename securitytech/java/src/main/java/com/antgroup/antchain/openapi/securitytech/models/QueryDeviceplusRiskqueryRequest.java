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

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 加密电话号码
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 电话号码加密类型, 明文: 0; MD5加密: 1; SHA256: 2
    @NameInMap("phone_number_type")
    @Validation(required = true)
    public String phoneNumberType;

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

    public QueryDeviceplusRiskqueryRequest setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }
    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

}
