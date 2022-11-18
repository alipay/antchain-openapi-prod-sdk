// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ba5301f7d07245d1bd01dc432d3de4b1.models;

import com.aliyun.tea.*;

public class ExecAntchainBbpContractReconciliationResponse extends TeaModel {
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

    public static ExecAntchainBbpContractReconciliationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntchainBbpContractReconciliationResponse self = new ExecAntchainBbpContractReconciliationResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntchainBbpContractReconciliationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntchainBbpContractReconciliationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntchainBbpContractReconciliationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntchainBbpContractReconciliationResponse setReconciliation(Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
        return this;
    }
    public Reconciliation getReconciliation() {
        return this.reconciliation;
    }

}
