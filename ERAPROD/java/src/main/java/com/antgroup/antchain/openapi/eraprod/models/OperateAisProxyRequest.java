// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class OperateAisProxyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参json
    @NameInMap("biz_data")
    @Validation(required = true)
    public String bizData;

    // 系统参数
    @NameInMap("system_data")
    @Validation(required = true)
    public String systemData;

    public static OperateAisProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAisProxyRequest self = new OperateAisProxyRequest();
        return TeaModel.build(map, self);
    }

    public OperateAisProxyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateAisProxyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateAisProxyRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public OperateAisProxyRequest setSystemData(String systemData) {
        this.systemData = systemData;
        return this;
    }
    public String getSystemData() {
        return this.systemData;
    }

}
