// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse extends TeaModel {
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

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    public static DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse self = new DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

}
