// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class UploadStaffAssessmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求时间
    @NameInMap("time_stamp")
    @Validation(required = true)
    public Long timeStamp;

    // 考核信息
    @NameInMap("assessment")
    @Validation(required = true)
    public Assessment assessment;

    public static UploadStaffAssessmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadStaffAssessmentRequest self = new UploadStaffAssessmentRequest();
        return TeaModel.build(map, self);
    }

    public UploadStaffAssessmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadStaffAssessmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadStaffAssessmentRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public UploadStaffAssessmentRequest setAssessment(Assessment assessment) {
        this.assessment = assessment;
        return this;
    }
    public Assessment getAssessment() {
        return this.assessment;
    }

}
