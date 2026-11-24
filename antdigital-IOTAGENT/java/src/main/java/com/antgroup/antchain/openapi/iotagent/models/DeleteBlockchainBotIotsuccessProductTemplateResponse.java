// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DeleteBlockchainBotIotsuccessProductTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("deleted")
    @Validation(required = true)
    public Boolean deleted;

    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static DeleteBlockchainBotIotsuccessProductTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainBotIotsuccessProductTemplateResponse self = new DeleteBlockchainBotIotsuccessProductTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainBotIotsuccessProductTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteBlockchainBotIotsuccessProductTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteBlockchainBotIotsuccessProductTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteBlockchainBotIotsuccessProductTemplateResponse setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteBlockchainBotIotsuccessProductTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
