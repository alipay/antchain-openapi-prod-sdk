// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryUnionUnionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云联盟查询结果
    @NameInMap("result")
    public ALiYunUnion result;

    public static QueryUnionUnionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionUnionResponse self = new QueryUnionUnionResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionUnionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnionUnionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnionUnionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnionUnionResponse setResult(ALiYunUnion result) {
        this.result = result;
        return this;
    }
    public ALiYunUnion getResult() {
        return this.result;
    }

}
