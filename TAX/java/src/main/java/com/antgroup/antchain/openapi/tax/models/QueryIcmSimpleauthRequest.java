// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryIcmSimpleauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户名称
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 纳税人识别号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 请求id，用于幂等控制
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 行方生成的授权编号
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 如果有的话，作为透传字段
    @NameInMap("biz_context")
    public String bizContext;

    // 机构id
    @NameInMap("institute_id")
    public String instituteId;

    public static QueryIcmSimpleauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIcmSimpleauthRequest self = new QueryIcmSimpleauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryIcmSimpleauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIcmSimpleauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIcmSimpleauthRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryIcmSimpleauthRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public QueryIcmSimpleauthRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public QueryIcmSimpleauthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryIcmSimpleauthRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public QueryIcmSimpleauthRequest setBizContext(String bizContext) {
        this.bizContext = bizContext;
        return this;
    }
    public String getBizContext() {
        return this.bizContext;
    }

    public QueryIcmSimpleauthRequest setInstituteId(String instituteId) {
        this.instituteId = instituteId;
        return this;
    }
    public String getInstituteId() {
        return this.instituteId;
    }

}
