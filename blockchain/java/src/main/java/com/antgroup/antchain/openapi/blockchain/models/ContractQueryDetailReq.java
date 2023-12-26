// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractQueryDetailReq extends TeaModel {
    // 服务ID
    @NameInMap("service_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String serviceId;

    public static ContractQueryDetailReq build(java.util.Map<String, ?> map) throws Exception {
        ContractQueryDetailReq self = new ContractQueryDetailReq();
        return TeaModel.build(map, self);
    }

    public ContractQueryDetailReq setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
