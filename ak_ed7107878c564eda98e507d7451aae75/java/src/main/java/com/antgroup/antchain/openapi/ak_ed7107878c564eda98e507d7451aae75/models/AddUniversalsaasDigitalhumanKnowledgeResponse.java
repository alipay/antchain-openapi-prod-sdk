// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AddUniversalsaasDigitalhumanKnowledgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识点id
    @NameInMap("data")
    public Long data;

    public static AddUniversalsaasDigitalhumanKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUniversalsaasDigitalhumanKnowledgeResponse self = new AddUniversalsaasDigitalhumanKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public AddUniversalsaasDigitalhumanKnowledgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddUniversalsaasDigitalhumanKnowledgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddUniversalsaasDigitalhumanKnowledgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddUniversalsaasDigitalhumanKnowledgeResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
