// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class TaskStatus extends TeaModel {
    // The current state of this task.
    /**
     * <strong>example:</strong>
     * <p>TASK_STATE_COMPLETED</p>
     */
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // A message associated with the status.
    @NameInMap("message")
    @Validation(required = true)
    public Message message;

    public static TaskStatus build(java.util.Map<String, ?> map) throws Exception {
        TaskStatus self = new TaskStatus();
        return TeaModel.build(map, self);
    }

    public TaskStatus setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public TaskStatus setMessage(Message message) {
        this.message = message;
        return this;
    }
    public Message getMessage() {
        return this.message;
    }

}
