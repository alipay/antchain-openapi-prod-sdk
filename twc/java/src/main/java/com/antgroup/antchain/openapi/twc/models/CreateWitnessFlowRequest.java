// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateWitnessFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景，最大255长度
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 客户端名称，比如签章客户端，最长长度50
    @NameInMap("client_name")
    public String clientName;

    // 客户端版本
    @NameInMap("client_version")
    public String clientVersion;

    // 合同有效截止时间，时间戳
    @NameInMap("contract_validity")
    public String contractValidity;

    // 流程id
    @NameInMap("flow_id")
    public String flowId;

    // 发起方账号id
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    // 发起端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
    @NameInMap("launch_endpoint")
    @Validation(required = true)
    public String launchEndpoint;

    // 发起ip
    @NameInMap("launch_ip")
    @Validation(required = true)
    public String launchIp;

    // 手机盾逻辑版本，0-不支持用印审批、需要扣费，1-支持用印审批、无需扣费，默认0
    @NameInMap("mobile_shield_version")
    public Long mobileShieldVersion;

    // 扣费方账号id
    @NameInMap("payer_account_id")
    public String payerAccountId;

    // 签署截止时间，时间戳
    @NameInMap("sign_deadline")
    public String signDeadline;

    // 签署顺序，SIGN_SEQUENCE-顺序签署，SIGN_NON_SEQUENCE-无序签署
    @NameInMap("sign_order")
    @Validation(required = true)
    public String signOrder;

    // 流程类型，0-签署流程，1-作废流程，默认0
    @NameInMap("type")
    public Long type;

    // 发起请求的实例应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 发起请求的鉴权token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static CreateWitnessFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWitnessFlowRequest self = new CreateWitnessFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateWitnessFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWitnessFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWitnessFlowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CreateWitnessFlowRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public CreateWitnessFlowRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateWitnessFlowRequest setContractValidity(String contractValidity) {
        this.contractValidity = contractValidity;
        return this;
    }
    public String getContractValidity() {
        return this.contractValidity;
    }

    public CreateWitnessFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateWitnessFlowRequest setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public CreateWitnessFlowRequest setLaunchEndpoint(String launchEndpoint) {
        this.launchEndpoint = launchEndpoint;
        return this;
    }
    public String getLaunchEndpoint() {
        return this.launchEndpoint;
    }

    public CreateWitnessFlowRequest setLaunchIp(String launchIp) {
        this.launchIp = launchIp;
        return this;
    }
    public String getLaunchIp() {
        return this.launchIp;
    }

    public CreateWitnessFlowRequest setMobileShieldVersion(Long mobileShieldVersion) {
        this.mobileShieldVersion = mobileShieldVersion;
        return this;
    }
    public Long getMobileShieldVersion() {
        return this.mobileShieldVersion;
    }

    public CreateWitnessFlowRequest setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public CreateWitnessFlowRequest setSignDeadline(String signDeadline) {
        this.signDeadline = signDeadline;
        return this;
    }
    public String getSignDeadline() {
        return this.signDeadline;
    }

    public CreateWitnessFlowRequest setSignOrder(String signOrder) {
        this.signOrder = signOrder;
        return this;
    }
    public String getSignOrder() {
        return this.signOrder;
    }

    public CreateWitnessFlowRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public CreateWitnessFlowRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateWitnessFlowRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
