// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMsgdumpTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 源 event code
    @NameInMap("source_event_code")
    public String sourceEventCode;

    // 源实例 id
    @NameInMap("source_instance_id")
    public String sourceInstanceId;

    // 源 topic
    @NameInMap("source_topic")
    public String sourceTopic;

    // 任务状态
    @NameInMap("status")
    public Long status;

    // 目标 instance id
    @NameInMap("target_instance_id")
    public String targetInstanceId;

    // 目标 tag
    @NameInMap("target_tag")
    public String targetTag;

    // 目标 topic
    @NameInMap("target_topic")
    public String targetTopic;

    public static QueryMsgdumpTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgdumpTaskRequest self = new QueryMsgdumpTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsgdumpTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMsgdumpTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMsgdumpTaskRequest setSourceEventCode(String sourceEventCode) {
        this.sourceEventCode = sourceEventCode;
        return this;
    }
    public String getSourceEventCode() {
        return this.sourceEventCode;
    }

    public QueryMsgdumpTaskRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public QueryMsgdumpTaskRequest setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public QueryMsgdumpTaskRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryMsgdumpTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public QueryMsgdumpTaskRequest setTargetTag(String targetTag) {
        this.targetTag = targetTag;
        return this;
    }
    public String getTargetTag() {
        return this.targetTag;
    }

    public QueryMsgdumpTaskRequest setTargetTopic(String targetTopic) {
        this.targetTopic = targetTopic;
        return this;
    }
    public String getTargetTopic() {
        return this.targetTopic;
    }

}
