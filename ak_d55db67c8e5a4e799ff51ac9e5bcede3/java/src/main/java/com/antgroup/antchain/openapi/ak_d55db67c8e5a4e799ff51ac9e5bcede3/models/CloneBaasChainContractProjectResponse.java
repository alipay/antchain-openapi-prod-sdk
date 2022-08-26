// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class CloneBaasChainContractProjectResponse extends TeaModel {
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
    public ALiYunContractProject result;

    public static CloneBaasChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneBaasChainContractProjectResponse self = new CloneBaasChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public CloneBaasChainContractProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CloneBaasChainContractProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CloneBaasChainContractProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CloneBaasChainContractProjectResponse setResult(ALiYunContractProject result) {
        this.result = result;
        return this;
    }
    public ALiYunContractProject getResult() {
        return this.result;
    }

}
