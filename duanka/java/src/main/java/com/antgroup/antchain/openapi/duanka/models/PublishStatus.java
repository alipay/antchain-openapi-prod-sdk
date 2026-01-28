// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class PublishStatus extends TeaModel {
    // status
    /**
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // errorCode
    /**
     * <strong>example:</strong>
     * <p>errorCode</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // message
    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // errorData
    /**
     * <strong>example:</strong>
     * <p>errorData</p>
     */
    @NameInMap("error_data")
    @Validation(required = true)
    public String errorData;

    public static PublishStatus build(java.util.Map<String, ?> map) throws Exception {
        PublishStatus self = new PublishStatus();
        return TeaModel.build(map, self);
    }

    public PublishStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PublishStatus setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PublishStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishStatus setErrorData(String errorData) {
        this.errorData = errorData;
        return this;
    }
    public String getErrorData() {
        return this.errorData;
    }

}
