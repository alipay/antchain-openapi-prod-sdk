// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class SetGeneralDivideResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证交易Hash
    @NameInMap("tx_hash")
    public String txHash;

    // 区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 合约接口返回结果
    @NameInMap("result")
    public String result;

    public static SetGeneralDivideResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGeneralDivideResponse self = new SetGeneralDivideResponse();
        return TeaModel.build(map, self);
    }

    public SetGeneralDivideResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetGeneralDivideResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetGeneralDivideResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetGeneralDivideResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public SetGeneralDivideResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public SetGeneralDivideResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SetGeneralDivideResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
