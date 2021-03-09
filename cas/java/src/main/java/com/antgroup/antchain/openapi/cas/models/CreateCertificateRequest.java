// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateCertificateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // zoneId
    @NameInMap("zone_id")
    public String zoneId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // paas_region_id
    @NameInMap("paas_region_id")
    @Validation(required = true)
    public String paasRegionId;

    // certificate
    @NameInMap("certificate")
    @Validation(required = true)
    public String certificate;

    // privateKey
    @NameInMap("private_key")
    @Validation(required = true)
    public String privateKey;

    // cert_type
    @NameInMap("cert_type")
    public Long certType;

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

    public CreateCertificateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateCertificateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCertificateRequest setPaasRegionId(String paasRegionId) {
        this.paasRegionId = paasRegionId;
        return this;
    }
    public String getPaasRegionId() {
        return this.paasRegionId;
    }

    public CreateCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateCertificateRequest setCertType(Long certType) {
        this.certType = certType;
        return this;
    }
    public Long getCertType() {
        return this.certType;
    }

}
