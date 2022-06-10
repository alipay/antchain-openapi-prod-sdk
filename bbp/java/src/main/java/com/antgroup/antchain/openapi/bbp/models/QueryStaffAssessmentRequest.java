// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryStaffAssessmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 员工工号
    @NameInMap("job_number")
    @Validation(required = true)
    public String jobNumber;

    // 考核月份
    @NameInMap("score_dates")
    @Validation(required = true)
    public java.util.List<String> scoreDates;

    // 供应商
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    public static QueryStaffAssessmentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStaffAssessmentRequest self = new QueryStaffAssessmentRequest();
        return TeaModel.build(map, self);
    }

    public QueryStaffAssessmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStaffAssessmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStaffAssessmentRequest setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
        return this;
    }
    public String getJobNumber() {
        return this.jobNumber;
    }

    public QueryStaffAssessmentRequest setScoreDates(java.util.List<String> scoreDates) {
        this.scoreDates = scoreDates;
        return this;
    }
    public java.util.List<String> getScoreDates() {
        return this.scoreDates;
    }

    public QueryStaffAssessmentRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

}
