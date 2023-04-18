// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31a66bf9ba7c431fa33f8eed7c26ebd2.models;

import com.aliyun.tea.*;

public class QueryAntcloudSmartaccountPaymentRequest extends TeaModel {
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

    public static QueryAntcloudSmartaccountPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudSmartaccountPaymentRequest self = new QueryAntcloudSmartaccountPaymentRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudSmartaccountPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudSmartaccountPaymentRequest setSysParam(SystemParam sysParam) {
        this.sysParam = sysParam;
        return this;
    }
    public SystemParam getSysParam() {
        return this.sysParam;
    }

    public QueryAntcloudSmartaccountPaymentRequest setEncodedBizParam(String encodedBizParam) {
        this.encodedBizParam = encodedBizParam;
        return this;
    }
    public String getEncodedBizParam() {
        return this.encodedBizParam;
    }

}
