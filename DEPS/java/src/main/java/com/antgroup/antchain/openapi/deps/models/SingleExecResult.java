// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SingleExecResult extends TeaModel {
    // 执行结果详情。如果成功，为执行日志；如果失败，为错误信息
    @NameInMap("execute_details")
    public String executeDetails;

    // 执行结束时间
    @NameInMap("finish_time")
    public Integer finishTime;

    // 执行开始时间
    @NameInMap("start_time")
    public Integer startTime;

    // 执行结果状态。取值列表：
    //                     EXECUTING：执行中；
    //                     SUCCESS：执行成功；
    //                     FAILED：执行失败；
    //                     IGNORED：已忽略；
    //                     TIME_OUT：已超时
    //                 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 执行对象。比如一台机器的ip 
    @NameInMap("target")
    @Validation(required = true)
    public String target;

    public static SingleExecResult build(java.util.Map<String, ?> map) throws Exception {
        SingleExecResult self = new SingleExecResult();
        return TeaModel.build(map, self);
    }

    public SingleExecResult setExecuteDetails(String executeDetails) {
        this.executeDetails = executeDetails;
        return this;
    }
    public String getExecuteDetails() {
        return this.executeDetails;
    }

    public SingleExecResult setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Integer getFinishTime() {
        return this.finishTime;
    }

    public SingleExecResult setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public SingleExecResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SingleExecResult setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
