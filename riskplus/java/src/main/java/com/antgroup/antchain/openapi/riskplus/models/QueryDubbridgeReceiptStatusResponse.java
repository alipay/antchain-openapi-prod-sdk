// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeReceiptStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否结清结构体
    @NameInMap("data")
    public CustomReceiptStatus data;

    public static QueryDubbridgeReceiptStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeReceiptStatusResponse self = new QueryDubbridgeReceiptStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeReceiptStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeReceiptStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeReceiptStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeReceiptStatusResponse setData(CustomReceiptStatus data) {
        this.data = data;
        return this;
    }
    public CustomReceiptStatus getData() {
        return this.data;
    }

}
