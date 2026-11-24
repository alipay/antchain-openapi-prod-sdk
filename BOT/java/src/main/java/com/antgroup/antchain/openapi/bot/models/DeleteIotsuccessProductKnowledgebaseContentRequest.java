// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteIotsuccessProductKnowledgebaseContentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    @NameInMap("doc_id")
    @Validation(required = true)
    public String docId;

    public static DeleteIotsuccessProductKnowledgebaseContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIotsuccessProductKnowledgebaseContentRequest self = new DeleteIotsuccessProductKnowledgebaseContentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIotsuccessProductKnowledgebaseContentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIotsuccessProductKnowledgebaseContentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIotsuccessProductKnowledgebaseContentRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public DeleteIotsuccessProductKnowledgebaseContentRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

}
