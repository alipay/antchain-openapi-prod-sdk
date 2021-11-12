// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AutoTestLog extends TeaModel {
    // 日志id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 日志内容
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 节点执行的动作
    @NameInMap("node_action")
    @Validation(required = true)
    public String nodeAction;

    // 节点id
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点所处的阶段
    @NameInMap("stage")
    @Validation(required = true)
    public String stage;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(required = true)
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(required = true)
    public String utcModified;

    public static AutoTestLog build(java.util.Map<String, ?> map) throws Exception {
        AutoTestLog self = new AutoTestLog();
        return TeaModel.build(map, self);
    }

    public AutoTestLog setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AutoTestLog setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AutoTestLog setNodeAction(String nodeAction) {
        this.nodeAction = nodeAction;
        return this;
    }
    public String getNodeAction() {
        return this.nodeAction;
    }

    public AutoTestLog setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AutoTestLog setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public AutoTestLog setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AutoTestLog setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
