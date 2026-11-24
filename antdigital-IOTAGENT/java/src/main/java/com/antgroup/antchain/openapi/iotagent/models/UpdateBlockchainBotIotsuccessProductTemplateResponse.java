// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotsuccessProductTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    @NameInMap("updated")
    @Validation(required = true)
    public Boolean updated;

    public static UpdateBlockchainBotIotsuccessProductTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotsuccessProductTemplateResponse self = new UpdateBlockchainBotIotsuccessProductTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotsuccessProductTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateResponse setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

}
