// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class RdsAnalyzeResponse extends TeaModel {
    // 请求是否成功
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 返回信息
    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 返回数据
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("data")
    public String data;

    public static RdsAnalyzeResponse build(java.util.Map<String, ?> map) throws Exception {
        RdsAnalyzeResponse self = new RdsAnalyzeResponse();
        return TeaModel.build(map, self);
    }

    public RdsAnalyzeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RdsAnalyzeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RdsAnalyzeResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
