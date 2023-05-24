// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ExecEkytInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保险信息，包含保单的所有信息
    @NameInMap("insure_info")
    @Validation(required = true)
    public String insureInfo;

    // 投保人信息
    @NameInMap("applicant_info")
    @Validation(required = true)
    public String applicantInfo;

    // 被保人信息
    @NameInMap("assured_info")
    @Validation(required = true)
    public String assuredInfo;

    // 数据签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static ExecEkytInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecEkytInsureRequest self = new ExecEkytInsureRequest();
        return TeaModel.build(map, self);
    }

    public ExecEkytInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecEkytInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecEkytInsureRequest setInsureInfo(String insureInfo) {
        this.insureInfo = insureInfo;
        return this;
    }
    public String getInsureInfo() {
        return this.insureInfo;
    }

    public ExecEkytInsureRequest setApplicantInfo(String applicantInfo) {
        this.applicantInfo = applicantInfo;
        return this;
    }
    public String getApplicantInfo() {
        return this.applicantInfo;
    }

    public ExecEkytInsureRequest setAssuredInfo(String assuredInfo) {
        this.assuredInfo = assuredInfo;
        return this;
    }
    public String getAssuredInfo() {
        return this.assuredInfo;
    }

    public ExecEkytInsureRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
