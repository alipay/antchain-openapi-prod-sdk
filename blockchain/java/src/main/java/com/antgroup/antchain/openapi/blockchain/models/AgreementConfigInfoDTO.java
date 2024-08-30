// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AgreementConfigInfoDTO extends TeaModel {
    // 协议名称
    @NameInMap("agreement_name")
    @Validation(required = true)
    public String agreementName;

    // 协议链接
    @NameInMap("agreement_url")
    @Validation(required = true)
    public String agreementUrl;

    // 协议描述
    @NameInMap("agreement_desc")
    @Validation(required = true)
    public String agreementDesc;

    // 协议版本
    @NameInMap("version")
    public Long version;

    public static AgreementConfigInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AgreementConfigInfoDTO self = new AgreementConfigInfoDTO();
        return TeaModel.build(map, self);
    }

    public AgreementConfigInfoDTO setAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }
    public String getAgreementName() {
        return this.agreementName;
    }

    public AgreementConfigInfoDTO setAgreementUrl(String agreementUrl) {
        this.agreementUrl = agreementUrl;
        return this;
    }
    public String getAgreementUrl() {
        return this.agreementUrl;
    }

    public AgreementConfigInfoDTO setAgreementDesc(String agreementDesc) {
        this.agreementDesc = agreementDesc;
        return this;
    }
    public String getAgreementDesc() {
        return this.agreementDesc;
    }

    public AgreementConfigInfoDTO setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
