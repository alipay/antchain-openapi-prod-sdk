// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightTablesactivereceiverResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据洞察链上活跃接收地址响应
    @NameInMap("result")
    public ChainInsightActiveAddressesResponse result;

    public static QueryChaininsightTablesactivereceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightTablesactivereceiverResponse self = new QueryChaininsightTablesactivereceiverResponse();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightTablesactivereceiverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChaininsightTablesactivereceiverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChaininsightTablesactivereceiverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChaininsightTablesactivereceiverResponse setResult(ChainInsightActiveAddressesResponse result) {
        this.result = result;
        return this;
    }
    public ChainInsightActiveAddressesResponse getResult() {
        return this.result;
    }

}
