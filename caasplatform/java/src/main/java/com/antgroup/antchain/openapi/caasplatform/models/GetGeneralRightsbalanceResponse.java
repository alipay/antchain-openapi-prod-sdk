// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class GetGeneralRightsbalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 执行结果，0:成功
    @NameInMap("code")
    public Long code;

    // 合约接口返回结果
    @NameInMap("result")
    public String result;

    public static GetGeneralRightsbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralRightsbalanceResponse self = new GetGeneralRightsbalanceResponse();
        return TeaModel.build(map, self);
    }

    public GetGeneralRightsbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetGeneralRightsbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGeneralRightsbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetGeneralRightsbalanceResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public GetGeneralRightsbalanceResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public GetGeneralRightsbalanceResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetGeneralRightsbalanceResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
