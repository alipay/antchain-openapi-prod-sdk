// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryMeiyouAudittopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主题ID
    @NameInMap("topic_ids")
    @Validation(required = true)
    public java.util.List<Long> topicIds;

    // 美柚itag关联状态
    @NameInMap("topic_state")
    @Validation(required = true)
    public String topicState;

    public static QueryMeiyouAudittopicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeiyouAudittopicRequest self = new QueryMeiyouAudittopicRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeiyouAudittopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeiyouAudittopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeiyouAudittopicRequest setTopicIds(java.util.List<Long> topicIds) {
        this.topicIds = topicIds;
        return this;
    }
    public java.util.List<Long> getTopicIds() {
        return this.topicIds;
    }

    public QueryMeiyouAudittopicRequest setTopicState(String topicState) {
        this.topicState = topicState;
        return this;
    }
    public String getTopicState() {
        return this.topicState;
    }

}
