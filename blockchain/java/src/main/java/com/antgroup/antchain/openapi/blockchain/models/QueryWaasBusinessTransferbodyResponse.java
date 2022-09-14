// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryWaasBusinessTransferbodyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // dcep的data参数，包含用户签名信息
    @NameInMap("chain_body")
    public String chainBody;

    public static QueryWaasBusinessTransferbodyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaasBusinessTransferbodyResponse self = new QueryWaasBusinessTransferbodyResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaasBusinessTransferbodyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWaasBusinessTransferbodyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWaasBusinessTransferbodyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWaasBusinessTransferbodyResponse setChainBody(String chainBody) {
        this.chainBody = chainBody;
        return this;
    }
    public String getChainBody() {
        return this.chainBody;
    }

}
