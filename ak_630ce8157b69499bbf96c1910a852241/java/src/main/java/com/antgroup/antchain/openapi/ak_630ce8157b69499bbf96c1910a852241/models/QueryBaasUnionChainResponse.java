// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class QueryBaasUnionChainResponse extends TeaModel {
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

    public static QueryBaasUnionChainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasUnionChainResponse self = new QueryBaasUnionChainResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasUnionChainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasUnionChainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasUnionChainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasUnionChainResponse setResult(ALiYunUnion result) {
        this.result = result;
        return this;
    }
    public ALiYunUnion getResult() {
        return this.result;
    }

}
