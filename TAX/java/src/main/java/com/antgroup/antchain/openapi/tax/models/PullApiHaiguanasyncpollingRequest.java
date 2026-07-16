// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PullApiHaiguanasyncpollingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号/子租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 产品类型，海关数据: ZX500
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 身份id，企业税号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 用于幂等控制
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 企业名称
    @NameInMap("corp_name")
    public String corpName;

    public static PullApiHaiguanasyncpollingRequest build(java.util.Map<String, ?> map) throws Exception {
        PullApiHaiguanasyncpollingRequest self = new PullApiHaiguanasyncpollingRequest();
        return TeaModel.build(map, self);
    }

    public PullApiHaiguanasyncpollingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullApiHaiguanasyncpollingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullApiHaiguanasyncpollingRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public PullApiHaiguanasyncpollingRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public PullApiHaiguanasyncpollingRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public PullApiHaiguanasyncpollingRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public PullApiHaiguanasyncpollingRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
