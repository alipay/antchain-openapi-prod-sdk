// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ServiceProcessLog extends TeaModel {
    // Logs属性
    @NameInMap("attributes")
    @Validation(required = true)
    public String attributes;

    // 错误追溯
    @NameInMap("error_stack_traces")
    @Validation(required = true)
    public String errorStackTraces;

    // 发布阶段，INIT，PARSE， EXECUTE
    @NameInMap("exec_phase")
    @Validation(required = true)
    public String execPhase;

    // 关联对象类型，RPV2，RP_STAGE，POD
    @NameInMap("inv_object_kind")
    @Validation(required = true)
    public String invObjectKind;

    // 对应object的name
    @NameInMap("inv_object_name")
    @Validation(required = true)
    public String invObjectName;

    // 对应object的namespace
    @NameInMap("inv_object_namespace")
    @Validation(required = true)
    public String invObjectNamespace;

    // log_time
    @NameInMap("log_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String logTime;

    // Logs详情
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // Logs原因
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 关联的ldc_plan id
    @NameInMap("ref_plan")
    @Validation(required = true)
    public String refPlan;

    // 关联的lks_service id
    @NameInMap("ref_service")
    @Validation(required = true)
    public String refService;

    // Logs的来源，ldcconsole，orch_event，opsware_event
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static ServiceProcessLog build(java.util.Map<String, ?> map) throws Exception {
        ServiceProcessLog self = new ServiceProcessLog();
        return TeaModel.build(map, self);
    }

    public ServiceProcessLog setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public ServiceProcessLog setErrorStackTraces(String errorStackTraces) {
        this.errorStackTraces = errorStackTraces;
        return this;
    }
    public String getErrorStackTraces() {
        return this.errorStackTraces;
    }

    public ServiceProcessLog setExecPhase(String execPhase) {
        this.execPhase = execPhase;
        return this;
    }
    public String getExecPhase() {
        return this.execPhase;
    }

    public ServiceProcessLog setInvObjectKind(String invObjectKind) {
        this.invObjectKind = invObjectKind;
        return this;
    }
    public String getInvObjectKind() {
        return this.invObjectKind;
    }

    public ServiceProcessLog setInvObjectName(String invObjectName) {
        this.invObjectName = invObjectName;
        return this;
    }
    public String getInvObjectName() {
        return this.invObjectName;
    }

    public ServiceProcessLog setInvObjectNamespace(String invObjectNamespace) {
        this.invObjectNamespace = invObjectNamespace;
        return this;
    }
    public String getInvObjectNamespace() {
        return this.invObjectNamespace;
    }

    public ServiceProcessLog setLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }
    public String getLogTime() {
        return this.logTime;
    }

    public ServiceProcessLog setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ServiceProcessLog setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ServiceProcessLog setRefPlan(String refPlan) {
        this.refPlan = refPlan;
        return this;
    }
    public String getRefPlan() {
        return this.refPlan;
    }

    public ServiceProcessLog setRefService(String refService) {
        this.refService = refService;
        return this;
    }
    public String getRefService() {
        return this.refService;
    }

    public ServiceProcessLog setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
