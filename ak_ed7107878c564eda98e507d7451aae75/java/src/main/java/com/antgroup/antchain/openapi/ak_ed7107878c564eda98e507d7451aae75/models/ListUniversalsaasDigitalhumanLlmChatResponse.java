// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanLlmChatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 大模型对话列表
    @NameInMap("item_list")
    public java.util.List<AvatarLlmChatInfo> itemList;

    public static ListUniversalsaasDigitalhumanLlmChatResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanLlmChatResponse self = new ListUniversalsaasDigitalhumanLlmChatResponse();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanLlmChatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUniversalsaasDigitalhumanLlmChatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUniversalsaasDigitalhumanLlmChatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUniversalsaasDigitalhumanLlmChatResponse setItemList(java.util.List<AvatarLlmChatInfo> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<AvatarLlmChatInfo> getItemList() {
        return this.itemList;
    }

}
