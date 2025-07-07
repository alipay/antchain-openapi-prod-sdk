// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractBindResp extends TeaModel {
    // 合约标识
    /**
     * <strong>example:</strong>
     * <p>cme20230724104931af3a4d</p>
     */
    @NameInMap("service_id")
    public String serviceId;

    // 合约名称
    /**
     * <strong>example:</strong>
     * <p>资产合约</p>
     */
    @NameInMap("name")
    public String name;

    // 是否已关联
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("bind")
    public Boolean bind;

    public static ContractBindResp build(java.util.Map<String, ?> map) throws Exception {
        ContractBindResp self = new ContractBindResp();
        return TeaModel.build(map, self);
    }

    public ContractBindResp setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ContractBindResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractBindResp setBind(Boolean bind) {
        this.bind = bind;
        return this;
    }
    public Boolean getBind() {
        return this.bind;
    }

}
