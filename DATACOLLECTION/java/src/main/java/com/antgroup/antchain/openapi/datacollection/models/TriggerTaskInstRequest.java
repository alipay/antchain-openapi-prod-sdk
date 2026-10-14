// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class TriggerTaskInstRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 任务 id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 附加参数
    @NameInMap("extra")
    public String extra;

    // 幂等 id，若传了，则unique_id=inst_id
    @NameInMap("unique_id")
    public String uniqueId;

    public static TriggerTaskInstRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerTaskInstRequest self = new TriggerTaskInstRequest();
        return TeaModel.build(map, self);
    }

    public TriggerTaskInstRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TriggerTaskInstRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TriggerTaskInstRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public TriggerTaskInstRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
