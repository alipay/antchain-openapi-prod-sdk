// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class SyncRiskplusDubbridgeCustomResponse extends TeaModel {
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

    public static SyncRiskplusDubbridgeCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRiskplusDubbridgeCustomResponse self = new SyncRiskplusDubbridgeCustomResponse();
        return TeaModel.build(map, self);
    }

    public SyncRiskplusDubbridgeCustomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncRiskplusDubbridgeCustomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncRiskplusDubbridgeCustomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncRiskplusDubbridgeCustomResponse setSyncResult(String syncResult) {
        this.syncResult = syncResult;
        return this;
    }
    public String getSyncResult() {
        return this.syncResult;
    }

    public SyncRiskplusDubbridgeCustomResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public SyncRiskplusDubbridgeCustomResponse setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

}
