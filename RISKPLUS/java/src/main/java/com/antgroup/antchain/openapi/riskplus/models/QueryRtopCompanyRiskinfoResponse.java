// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyRiskinfoResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 企业列表
    @NameInMap("data")
    public java.util.List<RtopCompanyRiskInfo> data;

    public static QueryRtopCompanyRiskinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyRiskinfoResponse self = new QueryRtopCompanyRiskinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyRiskinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyRiskinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyRiskinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyRiskinfoResponse setData(java.util.List<RtopCompanyRiskInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RtopCompanyRiskInfo> getData() {
        return this.data;
    }

}
