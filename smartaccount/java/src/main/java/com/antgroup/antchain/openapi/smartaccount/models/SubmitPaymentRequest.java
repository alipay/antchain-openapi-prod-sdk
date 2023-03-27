// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartaccount.models;

import com.aliyun.tea.*;

public class SubmitPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 系统参数
    @NameInMap("sys_param")
    @Validation(required = true)
    public SystemParam sysParam;

    // 业务参数，与function定义相匹配
    @NameInMap("encoded_biz_param")
    @Validation(required = true)
    public String encodedBizParam;

    public static SubmitPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPaymentRequest self = new SubmitPaymentRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitPaymentRequest setSysParam(SystemParam sysParam) {
        this.sysParam = sysParam;
        return this;
    }
    public SystemParam getSysParam() {
        return this.sysParam;
    }

    public SubmitPaymentRequest setEncodedBizParam(String encodedBizParam) {
        this.encodedBizParam = encodedBizParam;
        return this;
    }
    public String getEncodedBizParam() {
        return this.encodedBizParam;
    }

}
