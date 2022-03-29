// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceWorkspaceSetting extends TeaModel {
    // 工作空间名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 是否开启采样率，false代表全采
    @NameInMap("sample_enabled")
    public Boolean sampleEnabled;

    // 采样率
    @NameInMap("sample_rate")
    public String sampleRate;

    // 是否开启链路
    @NameInMap("trace_enabled")
    public Boolean traceEnabled;

    // 是否开启异常链路全采样
    @NameInMap("error_trace_enabled")
    public Boolean errorTraceEnabled;

    // 是否开启链路瘦身
    @NameInMap("narrow_span_enabled")
    public Boolean narrowSpanEnabled;

    public static TraceWorkspaceSetting build(java.util.Map<String, ?> map) throws Exception {
        TraceWorkspaceSetting self = new TraceWorkspaceSetting();
        return TeaModel.build(map, self);
    }

    public TraceWorkspaceSetting setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public TraceWorkspaceSetting setSampleEnabled(Boolean sampleEnabled) {
        this.sampleEnabled = sampleEnabled;
        return this;
    }
    public Boolean getSampleEnabled() {
        return this.sampleEnabled;
    }

    public TraceWorkspaceSetting setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

    public TraceWorkspaceSetting setTraceEnabled(Boolean traceEnabled) {
        this.traceEnabled = traceEnabled;
        return this;
    }
    public Boolean getTraceEnabled() {
        return this.traceEnabled;
    }

    public TraceWorkspaceSetting setErrorTraceEnabled(Boolean errorTraceEnabled) {
        this.errorTraceEnabled = errorTraceEnabled;
        return this;
    }
    public Boolean getErrorTraceEnabled() {
        return this.errorTraceEnabled;
    }

    public TraceWorkspaceSetting setNarrowSpanEnabled(Boolean narrowSpanEnabled) {
        this.narrowSpanEnabled = narrowSpanEnabled;
        return this;
    }
    public Boolean getNarrowSpanEnabled() {
        return this.narrowSpanEnabled;
    }

}
