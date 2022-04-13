// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsComputerTask extends TeaModel {
    // 任务描述
    @NameInMap("description")
    public String description;

    // 执行详情。如果任务成功，为执行日志；如果任务失败，为错误信息
    @NameInMap("execute_details")
    public String executeDetails;

    // 任务结束时间
    @NameInMap("finish_time")
    public String finishTime;

    // 任务名称
    @NameInMap("name")
    public String name;

    // 任务开始时间
    @NameInMap("start_time")
    public String startTime;

    // 任务状态。取值列表： EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败
    @NameInMap("status")
    public String status;

    public static OpsComputerTask build(java.util.Map<String, ?> map) throws Exception {
        OpsComputerTask self = new OpsComputerTask();
        return TeaModel.build(map, self);
    }

    public OpsComputerTask setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpsComputerTask setExecuteDetails(String executeDetails) {
        this.executeDetails = executeDetails;
        return this;
    }
    public String getExecuteDetails() {
        return this.executeDetails;
    }

    public OpsComputerTask setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public OpsComputerTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsComputerTask setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public OpsComputerTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
