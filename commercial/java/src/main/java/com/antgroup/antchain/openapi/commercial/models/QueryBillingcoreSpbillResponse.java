// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreSpbillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ap账单
    @NameInMap("ap_bill")
    public ApBill apBill;

    public static QueryBillingcoreSpbillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreSpbillResponse self = new QueryBillingcoreSpbillResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreSpbillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBillingcoreSpbillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBillingcoreSpbillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBillingcoreSpbillResponse setApBill(ApBill apBill) {
        this.apBill = apBill;
        return this;
    }
    public ApBill getApBill() {
        return this.apBill;
    }

}
