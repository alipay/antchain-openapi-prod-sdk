// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessAgreementSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 该合约调用返回值
    @NameInMap("data")
    public String data;

    // 该接口是否调用成功，0表示成功
    @NameInMap("status")
    public Long status;

    // 该调用对应的链上交易地址
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateBusinessAgreementSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessAgreementSignResponse self = new CreateBusinessAgreementSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessAgreementSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessAgreementSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessAgreementSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessAgreementSignResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateBusinessAgreementSignResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CreateBusinessAgreementSignResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
