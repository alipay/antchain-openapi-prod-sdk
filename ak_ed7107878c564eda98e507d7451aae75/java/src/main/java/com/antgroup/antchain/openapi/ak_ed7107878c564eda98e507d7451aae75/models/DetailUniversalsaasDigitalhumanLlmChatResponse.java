// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class DetailUniversalsaasDigitalhumanLlmChatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 大模型对话配置信息
    @NameInMap("data")
    public AvatarLlmChatInfo data;

    public static DetailUniversalsaasDigitalhumanLlmChatResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailUniversalsaasDigitalhumanLlmChatResponse self = new DetailUniversalsaasDigitalhumanLlmChatResponse();
        return TeaModel.build(map, self);
    }

    public DetailUniversalsaasDigitalhumanLlmChatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailUniversalsaasDigitalhumanLlmChatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailUniversalsaasDigitalhumanLlmChatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailUniversalsaasDigitalhumanLlmChatResponse setData(AvatarLlmChatInfo data) {
        this.data = data;
        return this;
    }
    public AvatarLlmChatInfo getData() {
        return this.data;
    }

}
