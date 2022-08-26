// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class QueryBaasChainSubnetResponse extends TeaModel {
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

    public static QueryBaasChainSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasChainSubnetResponse self = new QueryBaasChainSubnetResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasChainSubnetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasChainSubnetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasChainSubnetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasChainSubnetResponse setResult(ALiYunChainSubnetList result) {
        this.result = result;
        return this;
    }
    public ALiYunChainSubnetList getResult() {
        return this.result;
    }

}
