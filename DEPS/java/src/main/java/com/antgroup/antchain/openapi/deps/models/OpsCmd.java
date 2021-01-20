// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsCmd extends TeaModel {
    // 执行指令的参数列表
    @NameInMap("args")
    public java.util.List<OpsCmdArg> args;

    // 失败重试的间隔，单位为秒
    @NameInMap("retry_interval")
    public Integer retryInterval;

    // 失败重试次数
    @NameInMap("retry_times")
    public Integer retryTimes;

    // 指令模板ID
    @NameInMap("template_id")
    public String templateId;

    // 单次执行的超时时间，单位为秒
    @NameInMap("time_out")
    public Integer timeOut;

    public static OpsCmd build(java.util.Map<String, ?> map) throws Exception {
        OpsCmd self = new OpsCmd();
        return TeaModel.build(map, self);
    }

    public OpsCmd setArgs(java.util.List<OpsCmdArg> args) {
        this.args = args;
        return this;
    }
    public java.util.List<OpsCmdArg> getArgs() {
        return this.args;
    }

    public OpsCmd setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public OpsCmd setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public OpsCmd setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public OpsCmd setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
        return this;
    }
    public Integer getTimeOut() {
        return this.timeOut;
    }

}
