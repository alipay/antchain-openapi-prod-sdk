// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteIotsuccessProductKnowledgebaseContentResponse extends TeaModel {
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

    public static DeleteIotsuccessProductKnowledgebaseContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIotsuccessProductKnowledgebaseContentResponse self = new DeleteIotsuccessProductKnowledgebaseContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIotsuccessProductKnowledgebaseContentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteIotsuccessProductKnowledgebaseContentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteIotsuccessProductKnowledgebaseContentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteIotsuccessProductKnowledgebaseContentResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public DeleteIotsuccessProductKnowledgebaseContentResponse setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public DeleteIotsuccessProductKnowledgebaseContentResponse setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

}
