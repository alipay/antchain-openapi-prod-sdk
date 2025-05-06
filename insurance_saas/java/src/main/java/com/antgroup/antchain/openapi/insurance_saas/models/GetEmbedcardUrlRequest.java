// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetEmbedcardUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 险种编码
    @NameInMap("insurance_type_code")
    @Validation(required = true, maxLength = 32)
    public String insuranceTypeCode;

    // 保司编码
    @NameInMap("insurance_company_no")
    @Validation(required = true, maxLength = 32)
    public String insuranceCompanyNo;

    // 嵌入式产品编码
    @NameInMap("embed_product_code")
    @Validation(required = true, maxLength = 32)
    public String embedProductCode;

    // 是否需要询价
    @NameInMap("is_need_inquiry")
    @Validation(required = true)
    public Boolean isNeedInquiry;

    // 交易流水号，调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 128)
    public String tradeNo;

    // 方案名称
    @NameInMap("scheme_name")
    @Validation(required = true, maxLength = 32)
    public String schemeName;

    // 投保人
    @NameInMap("applicant")
    @Validation(required = true)
    public Applicant applicant;

    // 被保人
    @NameInMap("insured")
    @Validation(required = true)
    public Insured insured;

    // 投保标的
    @NameInMap("subject_info")
    @Validation(required = true, maxLength = 1000)
    public String subjectInfo;

    public static GetEmbedcardUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmbedcardUrlRequest self = new GetEmbedcardUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetEmbedcardUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetEmbedcardUrlRequest setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

    public GetEmbedcardUrlRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public GetEmbedcardUrlRequest setEmbedProductCode(String embedProductCode) {
        this.embedProductCode = embedProductCode;
        return this;
    }
    public String getEmbedProductCode() {
        return this.embedProductCode;
    }

    public GetEmbedcardUrlRequest setIsNeedInquiry(Boolean isNeedInquiry) {
        this.isNeedInquiry = isNeedInquiry;
        return this;
    }
    public Boolean getIsNeedInquiry() {
        return this.isNeedInquiry;
    }

    public GetEmbedcardUrlRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public GetEmbedcardUrlRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public GetEmbedcardUrlRequest setApplicant(Applicant applicant) {
        this.applicant = applicant;
        return this;
    }
    public Applicant getApplicant() {
        return this.applicant;
    }

    public GetEmbedcardUrlRequest setInsured(Insured insured) {
        this.insured = insured;
        return this;
    }
    public Insured getInsured() {
        return this.insured;
    }

    public GetEmbedcardUrlRequest setSubjectInfo(String subjectInfo) {
        this.subjectInfo = subjectInfo;
        return this;
    }
    public String getSubjectInfo() {
        return this.subjectInfo;
    }

}
