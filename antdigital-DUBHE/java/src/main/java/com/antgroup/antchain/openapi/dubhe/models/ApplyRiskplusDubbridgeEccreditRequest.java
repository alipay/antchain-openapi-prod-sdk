// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class ApplyRiskplusDubbridgeEccreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景码
    @NameInMap("business_scene")
    @Validation(required = true, maxLength = 64)
    public String businessScene;

    // 外部申请编号
    @NameInMap("third_apply_no")
    @Validation(required = true, maxLength = 64)
    public String thirdApplyNo;

    // 申请人信息
    @NameInMap("applicant_person_info")
    public ApplicantPersonInfo applicantPersonInfo;

    public static ApplyRiskplusDubbridgeEccreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRiskplusDubbridgeEccreditRequest self = new ApplyRiskplusDubbridgeEccreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRiskplusDubbridgeEccreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyRiskplusDubbridgeEccreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyRiskplusDubbridgeEccreditRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public ApplyRiskplusDubbridgeEccreditRequest setThirdApplyNo(String thirdApplyNo) {
        this.thirdApplyNo = thirdApplyNo;
        return this;
    }
    public String getThirdApplyNo() {
        return this.thirdApplyNo;
    }

    public ApplyRiskplusDubbridgeEccreditRequest setApplicantPersonInfo(ApplicantPersonInfo applicantPersonInfo) {
        this.applicantPersonInfo = applicantPersonInfo;
        return this;
    }
    public ApplicantPersonInfo getApplicantPersonInfo() {
        return this.applicantPersonInfo;
    }

}
