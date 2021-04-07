// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ResourceLog extends TeaModel {
    // host
    @NameInMap("host")
    public String host;

    // log_time
    @NameInMap("log_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String logTime;

    // message
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // resource_id
    @NameInMap("resource_id")
    public String resourceId;

    // resource_type
    @NameInMap("resource_type")
    public String resourceType;

    // severity
    @NameInMap("severity")
    public String severity;

    // source
    @NameInMap("source")
    public String source;

    // task_id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // task_times
    @NameInMap("task_times")
    @Validation(required = true)
    public Long taskTimes;

    // type
    @NameInMap("type")
    public String type;

    // iaas_error_info
    @NameInMap("iaas_error_info")
    public IaasErrorInfo iaasErrorInfo;

    // iaas_request
    @NameInMap("iaas_request")
    public IaasRequest iaasRequest;

    // iaas_response
    @NameInMap("iaas_response")
    public IaasResponse iaasResponse;

    public static ResourceLog build(java.util.Map<String, ?> map) throws Exception {
        ResourceLog self = new ResourceLog();
        return TeaModel.build(map, self);
    }

    public ResourceLog setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ResourceLog setLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }
    public String getLogTime() {
        return this.logTime;
    }

    public ResourceLog setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResourceLog setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ResourceLog setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceLog setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ResourceLog setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ResourceLog setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ResourceLog setTaskTimes(Long taskTimes) {
        this.taskTimes = taskTimes;
        return this;
    }
    public Long getTaskTimes() {
        return this.taskTimes;
    }

    public ResourceLog setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ResourceLog setIaasErrorInfo(IaasErrorInfo iaasErrorInfo) {
        this.iaasErrorInfo = iaasErrorInfo;
        return this;
    }
    public IaasErrorInfo getIaasErrorInfo() {
        return this.iaasErrorInfo;
    }

    public ResourceLog setIaasRequest(IaasRequest iaasRequest) {
        this.iaasRequest = iaasRequest;
        return this;
    }
    public IaasRequest getIaasRequest() {
        return this.iaasRequest;
    }

    public ResourceLog setIaasResponse(IaasResponse iaasResponse) {
        this.iaasResponse = iaasResponse;
        return this;
    }
    public IaasResponse getIaasResponse() {
        return this.iaasResponse;
    }

}
