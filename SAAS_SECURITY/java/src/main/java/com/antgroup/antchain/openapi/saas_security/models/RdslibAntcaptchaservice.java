// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class RdslibAntcaptchaservice extends TeaModel {
    // 是否请求成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 相应信息
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("message")
    public String message;

    // 返回数据
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("data")
    public String data;

    public static RdslibAntcaptchaservice build(java.util.Map<String, ?> map) throws Exception {
        RdslibAntcaptchaservice self = new RdslibAntcaptchaservice();
        return TeaModel.build(map, self);
    }

    public RdslibAntcaptchaservice setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RdslibAntcaptchaservice setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RdslibAntcaptchaservice setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
