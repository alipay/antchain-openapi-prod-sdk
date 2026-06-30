// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeReceiptOverdueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 逾期信息响应
    @NameInMap("data")
    public OverdueInfoResponse data;

    public static QueryDubbridgeReceiptOverdueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeReceiptOverdueResponse self = new QueryDubbridgeReceiptOverdueResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeReceiptOverdueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeReceiptOverdueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeReceiptOverdueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeReceiptOverdueResponse setData(OverdueInfoResponse data) {
        this.data = data;
        return this;
    }
    public OverdueInfoResponse getData() {
        return this.data;
    }

}
