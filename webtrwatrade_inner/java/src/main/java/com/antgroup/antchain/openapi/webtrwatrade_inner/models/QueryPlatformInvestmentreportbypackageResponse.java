// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class QueryPlatformInvestmentreportbypackageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部投资者报表数据(资产包维度)
    @NameInMap("data")
    public InvestmentReportInner data;

    public static QueryPlatformInvestmentreportbypackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPlatformInvestmentreportbypackageResponse self = new QueryPlatformInvestmentreportbypackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryPlatformInvestmentreportbypackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPlatformInvestmentreportbypackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPlatformInvestmentreportbypackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPlatformInvestmentreportbypackageResponse setData(InvestmentReportInner data) {
        this.data = data;
        return this;
    }
    public InvestmentReportInner getData() {
        return this.data;
    }

}
