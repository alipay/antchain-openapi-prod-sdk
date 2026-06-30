// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dci.models;

import com.aliyun.tea.*;

public class QueryBlockchainBccrDciCertificateresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DCI证书核验ID
    @NameInMap("certificate_verify_id")
    @Validation(required = true)
    public String certificateVerifyId;

    public static QueryBlockchainBccrDciCertificateresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBccrDciCertificateresultRequest self = new QueryBlockchainBccrDciCertificateresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBccrDciCertificateresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBccrDciCertificateresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBccrDciCertificateresultRequest setCertificateVerifyId(String certificateVerifyId) {
        this.certificateVerifyId = certificateVerifyId;
        return this;
    }
    public String getCertificateVerifyId() {
        return this.certificateVerifyId;
    }

}
