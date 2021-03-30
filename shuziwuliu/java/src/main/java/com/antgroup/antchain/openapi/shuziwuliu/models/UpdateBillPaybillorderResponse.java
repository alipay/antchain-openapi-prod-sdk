// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateBillPaybillorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上凭证
    @NameInMap("tx_codes")
    public java.util.List<TxDto> txCodes;

    public static UpdateBillPaybillorderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBillPaybillorderResponse self = new UpdateBillPaybillorderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBillPaybillorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBillPaybillorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBillPaybillorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBillPaybillorderResponse setTxCodes(java.util.List<TxDto> txCodes) {
        this.txCodes = txCodes;
        return this;
    }
    public java.util.List<TxDto> getTxCodes() {
        return this.txCodes;
    }

}
