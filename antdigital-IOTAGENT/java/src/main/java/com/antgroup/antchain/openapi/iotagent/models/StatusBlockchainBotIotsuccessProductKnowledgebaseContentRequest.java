// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 上传返回的已有文档ID
    @NameInMap("doc_id")
    @Validation(required = true)
    public String docId;

    public static StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest self = new StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest();
        return TeaModel.build(map, self);
    }

    public StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

}
