// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ServiceSearchItem extends TeaModel {
    // 服务 ID
    /**
     * <strong>example:</strong>
     * <p>svc-example</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 公开名称
    /**
     * <strong>example:</strong>
     * <p>银行网点查询</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 公开描述
    /**
     * <strong>example:</strong>
     * <p>查询银行网点</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 服务类型
    /**
     * <strong>example:</strong>
     * <p>MCP</p>
     */
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 实际返回排名，从 1 开始
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rank")
    @Validation(required = true)
    public Long rank;

    public static ServiceSearchItem build(java.util.Map<String, ?> map) throws Exception {
        ServiceSearchItem self = new ServiceSearchItem();
        return TeaModel.build(map, self);
    }

    public ServiceSearchItem setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceSearchItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceSearchItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ServiceSearchItem setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ServiceSearchItem setRank(Long rank) {
        this.rank = rank;
        return this;
    }
    public Long getRank() {
        return this.rank;
    }

}
