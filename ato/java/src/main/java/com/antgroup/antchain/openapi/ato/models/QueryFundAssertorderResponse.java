// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundAssertorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用信订单履约信息
    @NameInMap("data")
    public java.util.List<OrderPrimiseExcelInfo> data;

    public static QueryFundAssertorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFundAssertorderResponse self = new QueryFundAssertorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryFundAssertorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFundAssertorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFundAssertorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFundAssertorderResponse setData(java.util.List<OrderPrimiseExcelInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OrderPrimiseExcelInfo> getData() {
        return this.data;
    }

}
