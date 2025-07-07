// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractPageListResp extends TeaModel {
    // 服务ID
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

    // 合约类型
    /**
     * <strong>example:</strong>
     * <p>存证合约</p>
     */
    @NameInMap("type")
    public String type;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1690166971465</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    public static ContractPageListResp build(java.util.Map<String, ?> map) throws Exception {
        ContractPageListResp self = new ContractPageListResp();
        return TeaModel.build(map, self);
    }

    public ContractPageListResp setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ContractPageListResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractPageListResp setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ContractPageListResp setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
