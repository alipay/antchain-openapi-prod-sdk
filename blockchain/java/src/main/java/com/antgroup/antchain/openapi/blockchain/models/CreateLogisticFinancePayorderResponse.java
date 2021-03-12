// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinancePayorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 链上凭证
    @NameInMap("tx_code")
    public String txCode;

    public static CreateLogisticFinancePayorderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinancePayorderResponse self = new CreateLogisticFinancePayorderResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinancePayorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLogisticFinancePayorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLogisticFinancePayorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLogisticFinancePayorderResponse setTxCode(String txCode) {
        this.txCode = txCode;
        return this;
    }
    public String getTxCode() {
        return this.txCode;
    }

}
