// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class AddChaininsightStatisticResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("result")
    public ChainInsightStatisticTask result;

    public static AddChaininsightStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChaininsightStatisticResponse self = new AddChaininsightStatisticResponse();
        return TeaModel.build(map, self);
    }

    public AddChaininsightStatisticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddChaininsightStatisticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddChaininsightStatisticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddChaininsightStatisticResponse setResult(ChainInsightStatisticTask result) {
        this.result = result;
        return this;
    }
    public ChainInsightStatisticTask getResult() {
        return this.result;
    }

}
