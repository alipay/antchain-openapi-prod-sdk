// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BasicCertificate extends TeaModel {
    // serverCertificateId
    @NameInMap("server_certificate_id")
    @Validation(required = true)
    public String serverCertificateId;

    // serverCertificateName
    @NameInMap("server_certificate_name")
    @Validation(required = true)
    public String serverCertificateName;

    // fingerprint
    @NameInMap("fingerprint")
    public String fingerprint;

    // cert_type
    @NameInMap("cert_type")
    @Validation(required = true)
    public Long certType;

    // 标记这个证书的Provider
    @NameInMap("provider_id")
    public String providerId;

    public static BasicCertificate build(java.util.Map<String, ?> map) throws Exception {
        BasicCertificate self = new BasicCertificate();
        return TeaModel.build(map, self);
    }

    public BasicCertificate setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public BasicCertificate setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    public BasicCertificate setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public BasicCertificate setCertType(Long certType) {
        this.certType = certType;
        return this;
    }
    public Long getCertType() {
        return this.certType;
    }

    public BasicCertificate setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
