// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyRiskyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 全局动态中的企业列表
    @NameInMap("risky_companies")
    public java.util.List<RtopRiskyCompany> riskyCompanies;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // 总条数
    @NameInMap("total_num")
    public Long totalNum;

    public static QueryRtopCompanyRiskyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyRiskyResponse self = new QueryRtopCompanyRiskyResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyRiskyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyRiskyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyRiskyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyRiskyResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopCompanyRiskyResponse setRiskyCompanies(java.util.List<RtopRiskyCompany> riskyCompanies) {
        this.riskyCompanies = riskyCompanies;
        return this;
    }
    public java.util.List<RtopRiskyCompany> getRiskyCompanies() {
        return this.riskyCompanies;
    }

    public QueryRtopCompanyRiskyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopCompanyRiskyResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}
