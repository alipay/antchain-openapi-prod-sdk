// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GetRouterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public RouterInfoVO data;

    public static GetRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRouterResponse self = new GetRouterResponse();
        return TeaModel.build(map, self);
    }

    public GetRouterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRouterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRouterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRouterResponse setData(RouterInfoVO data) {
        this.data = data;
        return this;
    }
    public RouterInfoVO getData() {
        return this.data;
    }

}
