// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    @NameInMap("doc_id")
    @Validation(required = true)
    public String docId;

    @NameInMap("deleted")
    @Validation(required = true)
    public Boolean deleted;

    public static DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse self = new DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

}
