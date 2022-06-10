// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryStaffAttendanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 员工工号
    @NameInMap("job_number")
    @Validation(required = true)
    public String jobNumber;

    // 考勤月份
    @NameInMap("score_dates")
    @Validation(required = true)
    public java.util.List<String> scoreDates;

    // 供应商
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    public static QueryStaffAttendanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStaffAttendanceRequest self = new QueryStaffAttendanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryStaffAttendanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStaffAttendanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStaffAttendanceRequest setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
        return this;
    }
    public String getJobNumber() {
        return this.jobNumber;
    }

    public QueryStaffAttendanceRequest setScoreDates(java.util.List<String> scoreDates) {
        this.scoreDates = scoreDates;
        return this;
    }
    public java.util.List<String> getScoreDates() {
        return this.scoreDates;
    }

    public QueryStaffAttendanceRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

}
