// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotsuccessProductPluginBindingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<OpenApiBoundPluginInfo> items;

    public static ListIotsuccessProductPluginBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIotsuccessProductPluginBindingResponse self = new ListIotsuccessProductPluginBindingResponse();
        return TeaModel.build(map, self);
    }

    public ListIotsuccessProductPluginBindingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIotsuccessProductPluginBindingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIotsuccessProductPluginBindingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIotsuccessProductPluginBindingResponse setItems(java.util.List<OpenApiBoundPluginInfo> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OpenApiBoundPluginInfo> getItems() {
        return this.items;
    }

}
