// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class InitCpfVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 核身初始化请求信息
    @NameInMap("certification_request")
    @Validation(required = true)
    public String certificationRequest;

    public static InitCpfVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCpfVerifyRequest self = new InitCpfVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitCpfVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCpfVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCpfVerifyRequest setCertificationRequest(String certificationRequest) {
        this.certificationRequest = certificationRequest;
        return this;
    }
    public String getCertificationRequest() {
        return this.certificationRequest;
    }

}
