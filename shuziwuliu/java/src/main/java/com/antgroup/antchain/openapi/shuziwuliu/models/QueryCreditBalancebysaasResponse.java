// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditBalancebysaasResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否有信用流转额度
    @NameInMap("has_balance")
    public Boolean hasBalance;

    public static QueryCreditBalancebysaasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditBalancebysaasResponse self = new QueryCreditBalancebysaasResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditBalancebysaasResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditBalancebysaasResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditBalancebysaasResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditBalancebysaasResponse setHasBalance(Boolean hasBalance) {
        this.hasBalance = hasBalance;
        return this;
    }
    public Boolean getHasBalance() {
        return this.hasBalance;
    }

}
