// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ExecMaasChatsyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次模型调用 ID
    @NameInMap("id")
    public String id;

    // 实际使用的模型
    @NameInMap("model")
    public String model;

    // 完整文本
    @NameInMap("content")
    public String content;

    // 结束原因
    @NameInMap("finish_reason")
    public String finishReason;

    // 用量
    @NameInMap("usage")
    public ChatUsage usage;

    public static ExecMaasChatsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMaasChatsyncResponse self = new ExecMaasChatsyncResponse();
        return TeaModel.build(map, self);
    }

    public ExecMaasChatsyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecMaasChatsyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecMaasChatsyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecMaasChatsyncResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecMaasChatsyncResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecMaasChatsyncResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecMaasChatsyncResponse setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public ExecMaasChatsyncResponse setUsage(ChatUsage usage) {
        this.usage = usage;
        return this;
    }
    public ChatUsage getUsage() {
        return this.usage;
    }

}
