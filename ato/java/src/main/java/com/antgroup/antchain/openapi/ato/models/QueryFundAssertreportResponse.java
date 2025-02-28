// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundAssertreportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产报告详情
    @NameInMap("data")
    public java.util.List<FundAssertReport> data;

    public static QueryFundAssertreportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFundAssertreportResponse self = new QueryFundAssertreportResponse();
        return TeaModel.build(map, self);
    }

    public QueryFundAssertreportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFundAssertreportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFundAssertreportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFundAssertreportResponse setData(java.util.List<FundAssertReport> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FundAssertReport> getData() {
        return this.data;
    }

}
