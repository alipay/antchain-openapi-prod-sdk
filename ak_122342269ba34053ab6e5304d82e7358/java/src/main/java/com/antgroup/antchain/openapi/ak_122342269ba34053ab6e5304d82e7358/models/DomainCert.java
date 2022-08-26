// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class DomainCert extends TeaModel {
    // 链域名
    // 
    @NameInMap("domain")
    public String domain;

    // 签发者公钥
    @NameInMap("issuer_public_key")
    public String issuerPublicKey;

    // 签发者签名
    @NameInMap("issuer_signature")
    public String issuerSignature;

    // 接受者公钥
    @NameInMap("subject_public_key")
    public String subjectPublicKey;

    public static DomainCert build(java.util.Map<String, ?> map) throws Exception {
        DomainCert self = new DomainCert();
        return TeaModel.build(map, self);
    }

    public DomainCert setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DomainCert setIssuerPublicKey(String issuerPublicKey) {
        this.issuerPublicKey = issuerPublicKey;
        return this;
    }
    public String getIssuerPublicKey() {
        return this.issuerPublicKey;
    }

    public DomainCert setIssuerSignature(String issuerSignature) {
        this.issuerSignature = issuerSignature;
        return this;
    }
    public String getIssuerSignature() {
        return this.issuerSignature;
    }

    public DomainCert setSubjectPublicKey(String subjectPublicKey) {
        this.subjectPublicKey = subjectPublicKey;
        return this;
    }
    public String getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

}
