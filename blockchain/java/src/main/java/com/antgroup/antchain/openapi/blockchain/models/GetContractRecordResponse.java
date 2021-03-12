// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetContractRecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 合约部署记录
    @NameInMap("result")
    public ContractRecord result;

    public static GetContractRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractRecordResponse self = new GetContractRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetContractRecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetContractRecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetContractRecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetContractRecordResponse setResult(ContractRecord result) {
        this.result = result;
        return this;
    }
    public ContractRecord getResult() {
        return this.result;
    }

}
