// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class QueryBaasChainContractProjectResponse extends TeaModel {
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
    public ALiYunContractProjects result;

    public static QueryBaasChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasChainContractProjectResponse self = new QueryBaasChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasChainContractProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasChainContractProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasChainContractProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasChainContractProjectResponse setResult(ALiYunContractProjects result) {
        this.result = result;
        return this;
    }
    public ALiYunContractProjects getResult() {
        return this.result;
    }

}
