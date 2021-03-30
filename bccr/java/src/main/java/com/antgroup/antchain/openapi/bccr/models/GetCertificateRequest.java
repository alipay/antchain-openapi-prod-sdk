// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书类型
    @NameInMap("certificate_type")
    @Validation(required = true)
    public String certificateType;

    // 功能类型
    @NameInMap("features_type")
    @Validation(required = true)
    public String featuresType;

    // 版权登记id
    @NameInMap("register_id")
    @Validation(required = true)
    public String registerId;

    public static GetCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateRequest self = new GetCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetCertificateRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public GetCertificateRequest setFeaturesType(String featuresType) {
        this.featuresType = featuresType;
        return this;
    }
    public String getFeaturesType() {
        return this.featuresType;
    }

    public GetCertificateRequest setRegisterId(String registerId) {
        this.registerId = registerId;
        return this;
    }
    public String getRegisterId() {
        return this.registerId;
    }

}
