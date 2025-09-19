// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubReportEffectiveResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否存在有效订单0无1有
    @NameInMap("report_valid")
    public String reportValid;

    // 报告生成时间
    @NameInMap("report_valid_from")
    public String reportValidFrom;

    // 报告过期时间
    @NameInMap("report_valid_to")
    public String reportValidTo;

    public static QueryBenefithubReportEffectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubReportEffectiveResponse self = new QueryBenefithubReportEffectiveResponse();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubReportEffectiveResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBenefithubReportEffectiveResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBenefithubReportEffectiveResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBenefithubReportEffectiveResponse setReportValid(String reportValid) {
        this.reportValid = reportValid;
        return this;
    }
    public String getReportValid() {
        return this.reportValid;
    }

    public QueryBenefithubReportEffectiveResponse setReportValidFrom(String reportValidFrom) {
        this.reportValidFrom = reportValidFrom;
        return this;
    }
    public String getReportValidFrom() {
        return this.reportValidFrom;
    }

    public QueryBenefithubReportEffectiveResponse setReportValidTo(String reportValidTo) {
        this.reportValidTo = reportValidTo;
        return this;
    }
    public String getReportValidTo() {
        return this.reportValidTo;
    }

}
