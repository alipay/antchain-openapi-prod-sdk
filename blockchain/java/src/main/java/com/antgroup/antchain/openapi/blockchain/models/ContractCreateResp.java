// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractCreateResp extends TeaModel {
    // 合约标识
    /**
     * <strong>example:</strong>
     * <p>cme20230724104931af3a4d</p>
     */
    @NameInMap("service_id")
    public String serviceId;

    public static ContractCreateResp build(java.util.Map<String, ?> map) throws Exception {
        ContractCreateResp self = new ContractCreateResp();
        return TeaModel.build(map, self);
    }

    public ContractCreateResp setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
