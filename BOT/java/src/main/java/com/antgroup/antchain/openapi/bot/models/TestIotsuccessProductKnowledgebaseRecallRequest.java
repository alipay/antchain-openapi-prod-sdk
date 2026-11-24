// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TestIotsuccessProductKnowledgebaseRecallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    @NameInMap("query")
    @Validation(required = true)
    public String query;

    @NameInMap("top_k")
    public Long topK;

    public static TestIotsuccessProductKnowledgebaseRecallRequest build(java.util.Map<String, ?> map) throws Exception {
        TestIotsuccessProductKnowledgebaseRecallRequest self = new TestIotsuccessProductKnowledgebaseRecallRequest();
        return TeaModel.build(map, self);
    }

    public TestIotsuccessProductKnowledgebaseRecallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestIotsuccessProductKnowledgebaseRecallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TestIotsuccessProductKnowledgebaseRecallRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public TestIotsuccessProductKnowledgebaseRecallRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public TestIotsuccessProductKnowledgebaseRecallRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

}
