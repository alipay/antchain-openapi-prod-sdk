// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryIdentificationRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证流程ID
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 授权码，针对某些特定场景使用，非必填
    @NameInMap("auth_code")
    public String authCode;

    public static QueryIdentificationRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationRealpersonRequest self = new QueryIdentificationRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentificationRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentificationRealpersonRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryIdentificationRealpersonRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
