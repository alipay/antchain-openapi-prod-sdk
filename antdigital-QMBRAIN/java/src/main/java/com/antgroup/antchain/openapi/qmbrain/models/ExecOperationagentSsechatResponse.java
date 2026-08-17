// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ExecOperationagentSsechatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果响应
    @NameInMap("choices")
    public ChoiceData choices;

    // 请求时间
    @NameInMap("created")
    public Boolean created;

    // 请求信息
    @NameInMap("id")
    public String id;

    // 模型类型
    @NameInMap("model")
    public String model;

    // 请求方式
    @NameInMap("object")
    public String object;

    // token消耗情况
    @NameInMap("usage")
    public UsageData usage;

    public static ExecOperationagentSsechatResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecOperationagentSsechatResponse self = new ExecOperationagentSsechatResponse();
        return TeaModel.build(map, self);
    }

    public ExecOperationagentSsechatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecOperationagentSsechatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecOperationagentSsechatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecOperationagentSsechatResponse setChoices(ChoiceData choices) {
        this.choices = choices;
        return this;
    }
    public ChoiceData getChoices() {
        return this.choices;
    }

    public ExecOperationagentSsechatResponse setCreated(Boolean created) {
        this.created = created;
        return this;
    }
    public Boolean getCreated() {
        return this.created;
    }

    public ExecOperationagentSsechatResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecOperationagentSsechatResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecOperationagentSsechatResponse setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public ExecOperationagentSsechatResponse setUsage(UsageData usage) {
        this.usage = usage;
        return this;
    }
    public UsageData getUsage() {
        return this.usage;
    }

}
