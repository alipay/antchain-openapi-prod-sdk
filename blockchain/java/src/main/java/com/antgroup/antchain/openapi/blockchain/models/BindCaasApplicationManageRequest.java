// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BindCaasApplicationManageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用ID
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 合约服务标识集合
    @NameInMap("service_ids")
    public java.util.List<String> serviceIds;

    public static BindCaasApplicationManageRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCaasApplicationManageRequest self = new BindCaasApplicationManageRequest();
        return TeaModel.build(map, self);
    }

    public BindCaasApplicationManageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCaasApplicationManageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindCaasApplicationManageRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public BindCaasApplicationManageRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

}
