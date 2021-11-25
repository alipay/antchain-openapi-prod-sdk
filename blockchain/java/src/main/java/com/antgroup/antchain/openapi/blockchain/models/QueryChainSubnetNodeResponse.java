// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainSubnetNodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 子链节点信息列表
    @NameInMap("result")
    public ALiYunChainSubnetCheck result;

    public static QueryChainSubnetNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainSubnetNodeResponse self = new QueryChainSubnetNodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainSubnetNodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainSubnetNodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainSubnetNodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainSubnetNodeResponse setResult(ALiYunChainSubnetCheck result) {
        this.result = result;
        return this;
    }
    public ALiYunChainSubnetCheck getResult() {
        return this.result;
    }

}
