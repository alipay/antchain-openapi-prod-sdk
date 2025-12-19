// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class AgentSessionData extends TeaModel {
    // 会话id
    /**
     * <strong>example:</strong>
     * <p>082bab66-7b04-11ef-9df1-d38fddccce14</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 会话标题
    /**
     * <strong>example:</strong>
     * <p>会话标题</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("gmt_created")
    @Validation(required = true)
    public String gmtCreated;

    // VALID("生效"),INVALID("失效"),RUNNING("进行中"),FAILED("失败"),TERMINATED("已终止"), COMPLETED("已完成");
    /**
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 任务列表
    /**
     * <strong>example:</strong>
     * <p>任务列表</p>
     */
    @NameInMap("task_list")
    public java.util.List<AgentTaskData> taskList;

    public static AgentSessionData build(java.util.Map<String, ?> map) throws Exception {
        AgentSessionData self = new AgentSessionData();
        return TeaModel.build(map, self);
    }

    public AgentSessionData setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AgentSessionData setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AgentSessionData setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public AgentSessionData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentSessionData setTaskList(java.util.List<AgentTaskData> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<AgentTaskData> getTaskList() {
        return this.taskList;
    }

}
