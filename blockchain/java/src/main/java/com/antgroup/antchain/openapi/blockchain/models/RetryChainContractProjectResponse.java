// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RetryChainContractProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public ALiYunContractProjectDuplicate result;

    public static RetryChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryChainContractProjectResponse self = new RetryChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public RetryChainContractProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetryChainContractProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryChainContractProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetryChainContractProjectResponse setResult(ALiYunContractProjectDuplicate result) {
        this.result = result;
        return this;
    }
    public ALiYunContractProjectDuplicate getResult() {
        return this.result;
    }

}
