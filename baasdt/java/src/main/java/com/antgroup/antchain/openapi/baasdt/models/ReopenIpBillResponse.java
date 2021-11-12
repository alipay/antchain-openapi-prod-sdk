// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ReopenIpBillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账单ID
    @NameInMap("ip_bill_id")
    public String ipBillId;

    // 新的支付链接
    @NameInMap("pay_url")
    public String payUrl;

    public static ReopenIpBillResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenIpBillResponse self = new ReopenIpBillResponse();
        return TeaModel.build(map, self);
    }

    public ReopenIpBillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReopenIpBillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReopenIpBillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReopenIpBillResponse setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public ReopenIpBillResponse setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

}
