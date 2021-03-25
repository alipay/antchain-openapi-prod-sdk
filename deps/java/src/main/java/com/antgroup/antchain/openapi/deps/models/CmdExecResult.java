// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CmdExecResult extends TeaModel {
    // 错误信息。内容为指令无法下发到机器上的详细原因
    @NameInMap("err_msg")
    public String errMsg;

    // 执行结束时间
    @NameInMap("finish_time")
    public Integer finishTime;

    // 执行的结果
    @NameInMap("results")
    public java.util.List<SingleExecResult> results;

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

    public static CmdExecResult build(java.util.Map<String, ?> map) throws Exception {
        CmdExecResult self = new CmdExecResult();
        return TeaModel.build(map, self);
    }

    public CmdExecResult setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CmdExecResult setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Integer getFinishTime() {
        return this.finishTime;
    }

    public CmdExecResult setResults(java.util.List<SingleExecResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SingleExecResult> getResults() {
        return this.results;
    }

    public CmdExecResult setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public CmdExecResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
