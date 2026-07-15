// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetPrivatecontractSignurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有云实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 签署流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署用户的内部ID
    @NameInMap("user_inner_id")
    @Validation(required = true)
    public String userInnerId;

    // 签署平台，默认为H5页面，浏览器打开；也可填写ALIPAY，使用支付宝小程序打开
    @NameInMap("sign_platform")
    public String signPlatform;

    // 签署流程过期时间
    @NameInMap("expiration_time")
    @Validation(required = true)
    public Long expirationTime;

    public static GetPrivatecontractSignurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivatecontractSignurlRequest self = new GetPrivatecontractSignurlRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivatecontractSignurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetPrivatecontractSignurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetPrivatecontractSignurlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPrivatecontractSignurlRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetPrivatecontractSignurlRequest setUserInnerId(String userInnerId) {
        this.userInnerId = userInnerId;
        return this;
    }
    public String getUserInnerId() {
        return this.userInnerId;
    }

    public GetPrivatecontractSignurlRequest setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public GetPrivatecontractSignurlRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

}
