// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryUnionChainResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 联盟内链数据
    @NameInMap("result")
    public ALiYunUnion result;

    public static QueryUnionChainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionChainResponse self = new QueryUnionChainResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionChainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnionChainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnionChainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnionChainResponse setResult(ALiYunUnion result) {
        this.result = result;
        return this;
    }
    public ALiYunUnion getResult() {
        return this.result;
    }

}
