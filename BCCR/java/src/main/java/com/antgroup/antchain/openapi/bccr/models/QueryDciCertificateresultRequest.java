// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciCertificateresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DCI证书核验ID
    @NameInMap("certificate_verify_id")
    @Validation(required = true)
    public String certificateVerifyId;

    public static QueryDciCertificateresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciCertificateresultRequest self = new QueryDciCertificateresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciCertificateresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciCertificateresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciCertificateresultRequest setCertificateVerifyId(String certificateVerifyId) {
        this.certificateVerifyId = certificateVerifyId;
        return this;
    }
    public String getCertificateVerifyId() {
        return this.certificateVerifyId;
    }

}
