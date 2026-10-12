// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class GetRiskplusDubbridgeJumpurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跳转URL，请求成功返回
    @NameInMap("url")
    public String url;

    public static GetRiskplusDubbridgeJumpurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskplusDubbridgeJumpurlResponse self = new GetRiskplusDubbridgeJumpurlResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskplusDubbridgeJumpurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRiskplusDubbridgeJumpurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRiskplusDubbridgeJumpurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRiskplusDubbridgeJumpurlResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
