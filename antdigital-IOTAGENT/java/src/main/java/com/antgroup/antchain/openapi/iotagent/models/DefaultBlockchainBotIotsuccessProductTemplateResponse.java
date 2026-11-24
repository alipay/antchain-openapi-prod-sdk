// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DefaultBlockchainBotIotsuccessProductTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 枚举:NEW_TEMPLATE_SELECTIONS
    @NameInMap("effective_for")
    @Validation(required = true)
    public String effectiveFor;

    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static DefaultBlockchainBotIotsuccessProductTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DefaultBlockchainBotIotsuccessProductTemplateResponse self = new DefaultBlockchainBotIotsuccessProductTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DefaultBlockchainBotIotsuccessProductTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateResponse setEffectiveFor(String effectiveFor) {
        this.effectiveFor = effectiveFor;
        return this;
    }
    public String getEffectiveFor() {
        return this.effectiveFor;
    }

    public DefaultBlockchainBotIotsuccessProductTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
