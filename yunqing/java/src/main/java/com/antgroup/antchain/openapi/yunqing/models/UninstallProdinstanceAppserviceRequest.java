// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class UninstallProdinstanceAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用服务实例id。
    @NameInMap("app_service_id")
    @Validation(required = true)
    public String appServiceId;

    public static UninstallProdinstanceAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallProdinstanceAppserviceRequest self = new UninstallProdinstanceAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public UninstallProdinstanceAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UninstallProdinstanceAppserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UninstallProdinstanceAppserviceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
