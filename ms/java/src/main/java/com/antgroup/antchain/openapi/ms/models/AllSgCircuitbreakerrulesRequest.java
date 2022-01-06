// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AllSgCircuitbreakerrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称，数组形式
    @NameInMap("app_names")
    public String appNames;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 排序规则，JSON字符串
    @NameInMap("orders")
    public String orders;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 规则名
    @NameInMap("name")
    public String name;

    // 当前页
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static AllSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AllSgCircuitbreakerrulesRequest self = new AllSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public AllSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllSgCircuitbreakerrulesRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public AllSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AllSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllSgCircuitbreakerrulesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public AllSgCircuitbreakerrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AllSgCircuitbreakerrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AllSgCircuitbreakerrulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
