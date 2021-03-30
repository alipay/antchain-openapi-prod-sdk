// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SendCreditProxyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代理请求方法名
    @NameInMap("apply_method")
    @Validation(required = true)
    public String applyMethod;

    // 代理请求数据
    @NameInMap("apply_data")
    @Validation(required = true)
    public String applyData;

    public static SendCreditProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCreditProxyRequest self = new SendCreditProxyRequest();
        return TeaModel.build(map, self);
    }

    public SendCreditProxyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendCreditProxyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendCreditProxyRequest setApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
        return this;
    }
    public String getApplyMethod() {
        return this.applyMethod;
    }

    public SendCreditProxyRequest setApplyData(String applyData) {
        this.applyData = applyData;
        return this;
    }
    public String getApplyData() {
        return this.applyData;
    }

}
