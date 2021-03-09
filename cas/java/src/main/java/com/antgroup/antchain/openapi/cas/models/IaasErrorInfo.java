// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class IaasErrorInfo extends TeaModel {
    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // error_message
    @NameInMap("error_message")
    public String errorMessage;

    // status_code
    @NameInMap("status_code")
    public Long statusCode;

    // host_id
    @NameInMap("host_id")
    public String hostId;

    // requestId
    @NameInMap("request_id")
    public String requestId;

    public static IaasErrorInfo build(java.util.Map<String, ?> map) throws Exception {
        IaasErrorInfo self = new IaasErrorInfo();
        return TeaModel.build(map, self);
    }

    public IaasErrorInfo setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public IaasErrorInfo setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public IaasErrorInfo setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public IaasErrorInfo setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public IaasErrorInfo setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
