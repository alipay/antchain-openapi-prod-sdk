// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class GetFacevrfEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 某次刷脸的certifyId
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static GetFacevrfEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFacevrfEvidenceRequest self = new GetFacevrfEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public GetFacevrfEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFacevrfEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetFacevrfEvidenceRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
