// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRealpersonFacevrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信实人认证的唯一标识
    @NameInMap("real_person_verification_code")
    @Validation(required = true)
    public String realPersonVerificationCode;

    public static QueryRealpersonFacevrfRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRealpersonFacevrfRequest self = new QueryRealpersonFacevrfRequest();
        return TeaModel.build(map, self);
    }

    public QueryRealpersonFacevrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRealpersonFacevrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRealpersonFacevrfRequest setRealPersonVerificationCode(String realPersonVerificationCode) {
        this.realPersonVerificationCode = realPersonVerificationCode;
        return this;
    }
    public String getRealPersonVerificationCode() {
        return this.realPersonVerificationCode;
    }

}
