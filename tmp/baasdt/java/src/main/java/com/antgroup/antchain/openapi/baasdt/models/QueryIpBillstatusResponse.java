// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpBillstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 交易状态
    // (1: "交易创建,等待买家付款"),
    // (2: "未付款交易超时关闭,或支付完成后全额退款"),
    // (3: "交易支付成功"),
    @NameInMap("status")
    public Long status;

    public static QueryIpBillstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpBillstatusResponse self = new QueryIpBillstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpBillstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpBillstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpBillstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpBillstatusResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
