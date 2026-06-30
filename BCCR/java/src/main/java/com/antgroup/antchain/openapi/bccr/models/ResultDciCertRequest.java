// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ResultDciCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DCI证书凭证核验ID
    @NameInMap("certificate_verify_id")
    @Validation(required = true)
    public String certificateVerifyId;

    public static ResultDciCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ResultDciCertRequest self = new ResultDciCertRequest();
        return TeaModel.build(map, self);
    }

    public ResultDciCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResultDciCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResultDciCertRequest setCertificateVerifyId(String certificateVerifyId) {
        this.certificateVerifyId = certificateVerifyId;
        return this;
    }
    public String getCertificateVerifyId() {
        return this.certificateVerifyId;
    }

}
