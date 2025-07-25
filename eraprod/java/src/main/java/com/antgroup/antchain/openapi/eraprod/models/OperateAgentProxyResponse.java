// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class OperateAgentProxyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // json 序列化的回执结果
    @NameInMap("response_json")
    public String responseJson;

    public static OperateAgentProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentProxyResponse self = new OperateAgentProxyResponse();
        return TeaModel.build(map, self);
    }

    public OperateAgentProxyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateAgentProxyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateAgentProxyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateAgentProxyResponse setResponseJson(String responseJson) {
        this.responseJson = responseJson;
        return this;
    }
    public String getResponseJson() {
        return this.responseJson;
    }

}
