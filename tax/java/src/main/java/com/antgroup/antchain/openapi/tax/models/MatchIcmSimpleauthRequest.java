// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class MatchIcmSimpleauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 纳税人识别号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 用于幂等控制
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    public static MatchIcmSimpleauthRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchIcmSimpleauthRequest self = new MatchIcmSimpleauthRequest();
        return TeaModel.build(map, self);
    }

    public MatchIcmSimpleauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchIcmSimpleauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchIcmSimpleauthRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public MatchIcmSimpleauthRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public MatchIcmSimpleauthRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

}
