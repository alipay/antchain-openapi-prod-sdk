// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainSubnetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 子链列表信息
    @NameInMap("result")
    public ALiYunChainSubnetList result;

    public static QueryChainSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainSubnetResponse self = new QueryChainSubnetResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainSubnetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainSubnetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainSubnetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainSubnetResponse setResult(ALiYunChainSubnetList result) {
        this.result = result;
        return this;
    }
    public ALiYunChainSubnetList getResult() {
        return this.result;
    }

}
