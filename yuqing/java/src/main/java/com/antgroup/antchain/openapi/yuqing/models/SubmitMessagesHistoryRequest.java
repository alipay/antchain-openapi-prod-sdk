// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SubmitMessagesHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询条件
    @NameInMap("search_condition")
    @Validation(required = true)
    public SearchCondition searchCondition;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    // team_hash_id
    @NameInMap("team_hash_id")
    public String teamHashId;

    public static SubmitMessagesHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMessagesHistoryRequest self = new SubmitMessagesHistoryRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMessagesHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitMessagesHistoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitMessagesHistoryRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    public SubmitMessagesHistoryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMessagesHistoryRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
