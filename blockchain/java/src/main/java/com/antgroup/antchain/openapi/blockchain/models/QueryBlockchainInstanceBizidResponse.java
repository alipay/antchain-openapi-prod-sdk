// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBlockchainInstanceBizidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链的相关信息
    @NameInMap("result")
    public java.util.List<CreateBlockchainInfo> result;

    public static QueryBlockchainInstanceBizidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainInstanceBizidResponse self = new QueryBlockchainInstanceBizidResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainInstanceBizidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainInstanceBizidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainInstanceBizidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainInstanceBizidResponse setResult(java.util.List<CreateBlockchainInfo> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CreateBlockchainInfo> getResult() {
        return this.result;
    }

}
