// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyFeedbackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业反馈列表
    @NameInMap("company_feedbacks")
    public java.util.List<RtopCompanyFeedback> companyFeedbacks;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // 总条数
    @NameInMap("total_num")
    public Long totalNum;

    public static QueryRtopCompanyFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyFeedbackResponse self = new QueryRtopCompanyFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyFeedbackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyFeedbackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyFeedbackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyFeedbackResponse setCompanyFeedbacks(java.util.List<RtopCompanyFeedback> companyFeedbacks) {
        this.companyFeedbacks = companyFeedbacks;
        return this;
    }
    public java.util.List<RtopCompanyFeedback> getCompanyFeedbacks() {
        return this.companyFeedbacks;
    }

    public QueryRtopCompanyFeedbackResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopCompanyFeedbackResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopCompanyFeedbackResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}
