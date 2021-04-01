// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryUnionMemberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果信息
    @NameInMap("result")
    public ALiYunUnion result;

    public static QueryUnionMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionMemberResponse self = new QueryUnionMemberResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionMemberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnionMemberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnionMemberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnionMemberResponse setResult(ALiYunUnion result) {
        this.result = result;
        return this;
    }
    public ALiYunUnion getResult() {
        return this.result;
    }

}
