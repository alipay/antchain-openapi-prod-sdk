// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class RetryBaasChainContractProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public ALiYunContractProjectDuplicate result;

    public static RetryBaasChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryBaasChainContractProjectResponse self = new RetryBaasChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public RetryBaasChainContractProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetryBaasChainContractProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryBaasChainContractProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetryBaasChainContractProjectResponse setResult(ALiYunContractProjectDuplicate result) {
        this.result = result;
        return this;
    }
    public ALiYunContractProjectDuplicate getResult() {
        return this.result;
    }

}
