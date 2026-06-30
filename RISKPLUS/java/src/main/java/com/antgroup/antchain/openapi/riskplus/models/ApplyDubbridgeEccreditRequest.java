// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeEccreditRequest extends TeaModel {
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

    public static ApplyDubbridgeEccreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeEccreditRequest self = new ApplyDubbridgeEccreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeEccreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeEccreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeEccreditRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public ApplyDubbridgeEccreditRequest setThirdApplyNo(String thirdApplyNo) {
        this.thirdApplyNo = thirdApplyNo;
        return this;
    }
    public String getThirdApplyNo() {
        return this.thirdApplyNo;
    }

    public ApplyDubbridgeEccreditRequest setApplicantPersonInfo(ApplicantPersonInfo applicantPersonInfo) {
        this.applicantPersonInfo = applicantPersonInfo;
        return this;
    }
    public ApplicantPersonInfo getApplicantPersonInfo() {
        return this.applicantPersonInfo;
    }

}
