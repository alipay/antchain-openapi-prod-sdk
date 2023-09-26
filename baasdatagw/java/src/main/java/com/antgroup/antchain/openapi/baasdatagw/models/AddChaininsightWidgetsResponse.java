// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class AddChaininsightWidgetsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据洞察看板
    @NameInMap("result")
    public ChainInsightWidget result;

    public static AddChaininsightWidgetsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChaininsightWidgetsResponse self = new AddChaininsightWidgetsResponse();
        return TeaModel.build(map, self);
    }

    public AddChaininsightWidgetsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddChaininsightWidgetsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddChaininsightWidgetsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddChaininsightWidgetsResponse setResult(ChainInsightWidget result) {
        this.result = result;
        return this;
    }
    public ChainInsightWidget getResult() {
        return this.result;
    }

}
