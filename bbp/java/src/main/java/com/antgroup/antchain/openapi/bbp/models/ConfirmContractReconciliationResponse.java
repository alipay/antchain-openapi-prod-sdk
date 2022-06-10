// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class ConfirmContractReconciliationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结算单
    @NameInMap("reconciliation")
    public Reconciliation reconciliation;

    public static ConfirmContractReconciliationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmContractReconciliationResponse self = new ConfirmContractReconciliationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmContractReconciliationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmContractReconciliationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmContractReconciliationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmContractReconciliationResponse setReconciliation(Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
        return this;
    }
    public Reconciliation getReconciliation() {
        return this.reconciliation;
    }

}
