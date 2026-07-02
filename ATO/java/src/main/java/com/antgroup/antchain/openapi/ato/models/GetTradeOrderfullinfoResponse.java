// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetTradeOrderfullinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回对象
    @NameInMap("response_data")
    public String responseData;

    public static GetTradeOrderfullinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTradeOrderfullinfoResponse self = new GetTradeOrderfullinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTradeOrderfullinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTradeOrderfullinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTradeOrderfullinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTradeOrderfullinfoResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

}
