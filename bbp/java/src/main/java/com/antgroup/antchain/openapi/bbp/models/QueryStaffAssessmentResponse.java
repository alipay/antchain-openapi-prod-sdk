// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryStaffAssessmentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 考核结果
    @NameInMap("assessments")
    public java.util.List<Assessment> assessments;

    public static QueryStaffAssessmentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStaffAssessmentResponse self = new QueryStaffAssessmentResponse();
        return TeaModel.build(map, self);
    }

    public QueryStaffAssessmentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStaffAssessmentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStaffAssessmentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStaffAssessmentResponse setAssessments(java.util.List<Assessment> assessments) {
        this.assessments = assessments;
        return this;
    }
    public java.util.List<Assessment> getAssessments() {
        return this.assessments;
    }

}
