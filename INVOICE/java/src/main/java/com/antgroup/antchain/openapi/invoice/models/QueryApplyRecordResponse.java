// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryApplyRecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请记录(唯一)
    @NameInMap("data")
    public InvoiceApplyInfoVO data;

    public static QueryApplyRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplyRecordResponse self = new QueryApplyRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplyRecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplyRecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplyRecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplyRecordResponse setData(InvoiceApplyInfoVO data) {
        this.data = data;
        return this;
    }
    public InvoiceApplyInfoVO getData() {
        return this.data;
    }

}
