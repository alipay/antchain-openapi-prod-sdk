// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitIdentificationEnterpriseFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用于内部统计的参数，外部用户请忽略
    @NameInMap("biz_info")
    public BizInfo bizInfo;

    // 回调通知地址
    @NameInMap("call_back_url")
    public String callBackUrl;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
    @NameInMap("ep_cert_type")
    @Validation(required = true)
    public String epCertType;

    // 企业法人姓名
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 企业法人身份证号（目前只支持身份证号）
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 认证完成后回跳地址
    @NameInMap("merchant_url")
    public String merchantUrl;

    public static InitIdentificationEnterpriseFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIdentificationEnterpriseFaceauthRequest self = new InitIdentificationEnterpriseFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public InitIdentificationEnterpriseFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIdentificationEnterpriseFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIdentificationEnterpriseFaceauthRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public InitIdentificationEnterpriseFaceauthRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public InitIdentificationEnterpriseFaceauthRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public InitIdentificationEnterpriseFaceauthRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public InitIdentificationEnterpriseFaceauthRequest setEpCertType(String epCertType) {
        this.epCertType = epCertType;
        return this;
    }
    public String getEpCertType() {
        return this.epCertType;
    }

    public InitIdentificationEnterpriseFaceauthRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public InitIdentificationEnterpriseFaceauthRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public InitIdentificationEnterpriseFaceauthRequest setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
        return this;
    }
    public String getMerchantUrl() {
        return this.merchantUrl;
    }

}
