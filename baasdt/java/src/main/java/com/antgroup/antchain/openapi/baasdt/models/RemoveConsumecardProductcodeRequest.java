// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class RemoveConsumecardProductcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要操作的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 	
    // 场景码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static RemoveConsumecardProductcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveConsumecardProductcodeRequest self = new RemoveConsumecardProductcodeRequest();
        return TeaModel.build(map, self);
    }

    public RemoveConsumecardProductcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveConsumecardProductcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RemoveConsumecardProductcodeRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public RemoveConsumecardProductcodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RemoveConsumecardProductcodeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
