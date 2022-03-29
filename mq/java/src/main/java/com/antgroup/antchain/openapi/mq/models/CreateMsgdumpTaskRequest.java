// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateMsgdumpTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cell
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 对消息同步任务的描述
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 源端 event code
    @NameInMap("source_event_code")
    @Validation(required = true)
    public String sourceEventCode;

    // 源端实例 id
    @NameInMap("source_instance_id")
    @Validation(required = true)
    public String sourceInstanceId;

    // 源端 topic
    @NameInMap("source_topic")
    @Validation(required = true)
    public String sourceTopic;

    // 目标 tag
    @NameInMap("target_tag")
    @Validation(required = true)
    public String targetTag;

    // 目标 topic
    @NameInMap("target_topic")
    @Validation(required = true)
    public String targetTopic;

    // 目标 instance id 
    @NameInMap("target_instance_id")
    @Validation(required = true)
    public String targetInstanceId;

    public static CreateMsgdumpTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsgdumpTaskRequest self = new CreateMsgdumpTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsgdumpTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMsgdumpTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMsgdumpTaskRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CreateMsgdumpTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateMsgdumpTaskRequest setSourceEventCode(String sourceEventCode) {
        this.sourceEventCode = sourceEventCode;
        return this;
    }
    public String getSourceEventCode() {
        return this.sourceEventCode;
    }

    public CreateMsgdumpTaskRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateMsgdumpTaskRequest setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public CreateMsgdumpTaskRequest setTargetTag(String targetTag) {
        this.targetTag = targetTag;
        return this;
    }
    public String getTargetTag() {
        return this.targetTag;
    }

    public CreateMsgdumpTaskRequest setTargetTopic(String targetTopic) {
        this.targetTopic = targetTopic;
        return this;
    }
    public String getTargetTopic() {
        return this.targetTopic;
    }

    public CreateMsgdumpTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
