// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StatusIotsuccessProductKnowledgebaseContentRequest extends TeaModel {
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

    public static StatusIotsuccessProductKnowledgebaseContentRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusIotsuccessProductKnowledgebaseContentRequest self = new StatusIotsuccessProductKnowledgebaseContentRequest();
        return TeaModel.build(map, self);
    }

    public StatusIotsuccessProductKnowledgebaseContentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusIotsuccessProductKnowledgebaseContentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StatusIotsuccessProductKnowledgebaseContentRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public StatusIotsuccessProductKnowledgebaseContentRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

}
