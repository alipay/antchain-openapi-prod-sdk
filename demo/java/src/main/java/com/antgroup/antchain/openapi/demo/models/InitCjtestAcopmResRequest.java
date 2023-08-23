// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class InitCjtestAcopmResRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 111
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    // 11111
    @NameInMap("msg")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String msg;

    // 111
    @NameInMap("timeout111")
    @Validation(required = true)
    public java.util.List<String> timeout111;

    // 34134
    @NameInMap("msg1111")
    @Validation(required = true)
    public AutoCodeModel msg1111;

    public static InitCjtestAcopmResRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCjtestAcopmResRequest self = new InitCjtestAcopmResRequest();
        return TeaModel.build(map, self);
    }

    public InitCjtestAcopmResRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCjtestAcopmResRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCjtestAcopmResRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public InitCjtestAcopmResRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public InitCjtestAcopmResRequest setTimeout111(java.util.List<String> timeout111) {
        this.timeout111 = timeout111;
        return this;
    }
    public java.util.List<String> getTimeout111() {
        return this.timeout111;
    }

    public InitCjtestAcopmResRequest setMsg1111(AutoCodeModel msg1111) {
        this.msg1111 = msg1111;
        return this;
    }
    public AutoCodeModel getMsg1111() {
        return this.msg1111;
    }

}
