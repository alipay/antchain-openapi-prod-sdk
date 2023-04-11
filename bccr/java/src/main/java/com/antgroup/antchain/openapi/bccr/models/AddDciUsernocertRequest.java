// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddDciUsernocertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户名称
    @NameInMap("certificate_name")
    @Validation(required = true)
    public String certificateName;

    // 证件类型
    @NameInMap("certificate_type")
    @Validation(required = true)
    public String certificateType;

    // 证件号
    @NameInMap("certificate_number")
    @Validation(required = true)
    public String certificateNumber;

    // 企业用户必填
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 企业用户必填
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 企业用户必填
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 代理信息
    @NameInMap("proxy_data")
    public ProxyData proxyData;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static AddDciUsernocertRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDciUsernocertRequest self = new AddDciUsernocertRequest();
        return TeaModel.build(map, self);
    }

    public AddDciUsernocertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDciUsernocertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDciUsernocertRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public AddDciUsernocertRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public AddDciUsernocertRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public AddDciUsernocertRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public AddDciUsernocertRequest setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public AddDciUsernocertRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public AddDciUsernocertRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AddDciUsernocertRequest setProxyData(ProxyData proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public ProxyData getProxyData() {
        return this.proxyData;
    }

    public AddDciUsernocertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
