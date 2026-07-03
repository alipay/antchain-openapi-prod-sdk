// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotAgentchatHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 页码
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryBlockchainBotAgentchatHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotAgentchatHistoryRequest self = new QueryBlockchainBotAgentchatHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotAgentchatHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotAgentchatHistoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotAgentchatHistoryRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryBlockchainBotAgentchatHistoryRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryBlockchainBotAgentchatHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
