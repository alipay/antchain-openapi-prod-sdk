// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotAgentSessionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户端ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 页码
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryBlockchainBotAgentSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotAgentSessionsRequest self = new QueryBlockchainBotAgentSessionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotAgentSessionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotAgentSessionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotAgentSessionsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryBlockchainBotAgentSessionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryBlockchainBotAgentSessionsRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryBlockchainBotAgentSessionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
