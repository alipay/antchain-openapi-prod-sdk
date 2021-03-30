// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 版权登记id
    @NameInMap("register_id")
    @Validation(required = true)
    public String registerId;

    // 证书类型
    @NameInMap("certificate_type")
    @Validation(required = true)
    public String certificateType;

    // 功能类型
    @NameInMap("features_type")
    @Validation(required = true)
    public String featuresType;

    // 公证处id
    @NameInMap("org_id")
    public String orgId;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    public static CreateCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequest self = new CreateCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCertificateRequest setRegisterId(String registerId) {
        this.registerId = registerId;
        return this;
    }
    public String getRegisterId() {
        return this.registerId;
    }

    public CreateCertificateRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public CreateCertificateRequest setFeaturesType(String featuresType) {
        this.featuresType = featuresType;
        return this;
    }
    public String getFeaturesType() {
        return this.featuresType;
    }

    public CreateCertificateRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateCertificateRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

}
