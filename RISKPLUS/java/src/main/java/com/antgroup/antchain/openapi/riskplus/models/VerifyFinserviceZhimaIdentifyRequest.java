// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VerifyFinserviceZhimaIdentifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要校验的人姓名
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 需要校验的人身份证号
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 认证结束后的商户回调地址。
    @NameInMap("merchant_url")
    @Validation(required = true)
    public String merchantUrl;

    public static VerifyFinserviceZhimaIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFinserviceZhimaIdentifyRequest self = new VerifyFinserviceZhimaIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFinserviceZhimaIdentifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyFinserviceZhimaIdentifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyFinserviceZhimaIdentifyRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public VerifyFinserviceZhimaIdentifyRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public VerifyFinserviceZhimaIdentifyRequest setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
        return this;
    }
    public String getMerchantUrl() {
        return this.merchantUrl;
    }

}
