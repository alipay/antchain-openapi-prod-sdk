// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractBindAppReq extends TeaModel {
    // 应用ID
    /**
     * <strong>example:</strong>
     * <p>app20230725115808679d4f</p>
     */
    @NameInMap("application_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String applicationId;

    // 合约服务标识集合
    @NameInMap("service_ids")
    public java.util.List<String> serviceIds;

    public static ContractBindAppReq build(java.util.Map<String, ?> map) throws Exception {
        ContractBindAppReq self = new ContractBindAppReq();
        return TeaModel.build(map, self);
    }

    public ContractBindAppReq setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ContractBindAppReq setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

}
