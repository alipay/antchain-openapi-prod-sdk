// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncDubbridgeCustomResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 信息同步结果， Y-成功；N-失败
    @NameInMap("sync_result")
    public String syncResult;

    // 同步失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 客户号
    @NameInMap("customer_no")
    public String customerNo;

    public static SyncDubbridgeCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDubbridgeCustomResponse self = new SyncDubbridgeCustomResponse();
        return TeaModel.build(map, self);
    }

    public SyncDubbridgeCustomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncDubbridgeCustomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncDubbridgeCustomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncDubbridgeCustomResponse setSyncResult(String syncResult) {
        this.syncResult = syncResult;
        return this;
    }
    public String getSyncResult() {
        return this.syncResult;
    }

    public SyncDubbridgeCustomResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public SyncDubbridgeCustomResponse setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

}
