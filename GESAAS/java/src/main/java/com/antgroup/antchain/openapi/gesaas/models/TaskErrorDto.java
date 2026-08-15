// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class TaskErrorDto extends TeaModel {
    // 错误码
    /**
     * <strong>example:</strong>
     * <p>402</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 错误提示信息
    /**
     * <strong>example:</strong>
     * <p>未知异常</p>
     */
    @NameInMap("message")
    public String message;

    public static TaskErrorDto build(java.util.Map<String, ?> map) throws Exception {
        TaskErrorDto self = new TaskErrorDto();
        return TeaModel.build(map, self);
    }

    public TaskErrorDto setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TaskErrorDto setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
