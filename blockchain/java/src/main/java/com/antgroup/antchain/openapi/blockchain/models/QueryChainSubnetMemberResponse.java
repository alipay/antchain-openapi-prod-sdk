// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainSubnetMemberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 子链机构信息
    @NameInMap("result")
    public ALiYunChainSubnetCheck result;

    public static QueryChainSubnetMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainSubnetMemberResponse self = new QueryChainSubnetMemberResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainSubnetMemberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainSubnetMemberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainSubnetMemberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainSubnetMemberResponse setResult(ALiYunChainSubnetCheck result) {
        this.result = result;
        return this;
    }
    public ALiYunChainSubnetCheck getResult() {
        return this.result;
    }

}
