// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AiPanelPushResponse extends TeaModel {
    // 是否已成功进入设备下发链路
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("accepted")
    public Boolean accepted;

    // 任务标识，与请求消息标识一致
    /**
     * <strong>example:</strong>
     * <p>ac1002c017876357242061390225</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static AiPanelPushResponse build(java.util.Map<String, ?> map) throws Exception {
        AiPanelPushResponse self = new AiPanelPushResponse();
        return TeaModel.build(map, self);
    }

    public AiPanelPushResponse setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public AiPanelPushResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
