// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ResumeDataauthorizationAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权限凭证
    @NameInMap("authority_cert")
    @Validation(required = true)
    public String authorityCert;

    // 操作人ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static ResumeDataauthorizationAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeDataauthorizationAuthorizationRequest self = new ResumeDataauthorizationAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ResumeDataauthorizationAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResumeDataauthorizationAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResumeDataauthorizationAuthorizationRequest setAuthorityCert(String authorityCert) {
        this.authorityCert = authorityCert;
        return this;
    }
    public String getAuthorityCert() {
        return this.authorityCert;
    }

    public ResumeDataauthorizationAuthorizationRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
