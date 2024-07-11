// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoRealpersonFacevrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信实人认证的唯一标识
    @NameInMap("real_person_verification_code")
    @Validation(required = true)
    public String realPersonVerificationCode;

    public static QueryAntchainAtoRealpersonFacevrfRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoRealpersonFacevrfRequest self = new QueryAntchainAtoRealpersonFacevrfRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setRealPersonVerificationCode(String realPersonVerificationCode) {
        this.realPersonVerificationCode = realPersonVerificationCode;
        return this;
    }
    public String getRealPersonVerificationCode() {
        return this.realPersonVerificationCode;
    }

}
