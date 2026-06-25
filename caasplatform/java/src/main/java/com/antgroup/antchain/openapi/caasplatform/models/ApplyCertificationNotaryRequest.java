// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class ApplyCertificationNotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 申请主体信息（公证处Identity结构）
    @NameInMap("applicant")
    @Validation(required = true)
    public ApplicantInfo applicant;

    // 环节明细列表
    @NameInMap("step_detail_infos")
    @Validation(required = true)
    public java.util.List<StepDetailInfo> stepDetailInfos;

    public static ApplyCertificationNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificationNotaryRequest self = new ApplyCertificationNotaryRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCertificationNotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCertificationNotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCertificationNotaryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ApplyCertificationNotaryRequest setApplicant(ApplicantInfo applicant) {
        this.applicant = applicant;
        return this;
    }
    public ApplicantInfo getApplicant() {
        return this.applicant;
    }

    public ApplyCertificationNotaryRequest setStepDetailInfos(java.util.List<StepDetailInfo> stepDetailInfos) {
        this.stepDetailInfos = stepDetailInfos;
        return this;
    }
    public java.util.List<StepDetailInfo> getStepDetailInfos() {
        return this.stepDetailInfos;
    }

}
