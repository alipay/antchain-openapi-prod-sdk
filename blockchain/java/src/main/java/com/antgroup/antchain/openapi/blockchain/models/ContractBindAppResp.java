// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractBindAppResp extends TeaModel {
    // 合约标识
    @NameInMap("service_id")
    public String serviceId;

    // 合约名称
    @NameInMap("name")
    public String name;

    // 是否已关联
    @NameInMap("bind")
    public Boolean bind;

    public static ContractBindAppResp build(java.util.Map<String, ?> map) throws Exception {
        ContractBindAppResp self = new ContractBindAppResp();
        return TeaModel.build(map, self);
    }

    public ContractBindAppResp setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ContractBindAppResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractBindAppResp setBind(Boolean bind) {
        this.bind = bind;
        return this;
    }
    public Boolean getBind() {
        return this.bind;
    }

}
