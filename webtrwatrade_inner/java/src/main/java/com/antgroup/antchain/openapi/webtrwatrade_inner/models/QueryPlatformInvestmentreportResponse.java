// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class QueryPlatformInvestmentreportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部投资者报表数据
    @NameInMap("data")
    public InvestmentReportInner data;

    public static QueryPlatformInvestmentreportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPlatformInvestmentreportResponse self = new QueryPlatformInvestmentreportResponse();
        return TeaModel.build(map, self);
    }

    public QueryPlatformInvestmentreportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPlatformInvestmentreportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPlatformInvestmentreportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPlatformInvestmentreportResponse setData(InvestmentReportInner data) {
        this.data = data;
        return this;
    }
    public InvestmentReportInner getData() {
        return this.data;
    }

}
