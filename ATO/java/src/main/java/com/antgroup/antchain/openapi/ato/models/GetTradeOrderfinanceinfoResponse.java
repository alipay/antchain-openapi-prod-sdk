// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetTradeOrderfinanceinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单融资信息
    @NameInMap("response_data")
    public String responseData;

    public static GetTradeOrderfinanceinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTradeOrderfinanceinfoResponse self = new GetTradeOrderfinanceinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTradeOrderfinanceinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTradeOrderfinanceinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTradeOrderfinanceinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTradeOrderfinanceinfoResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

}
