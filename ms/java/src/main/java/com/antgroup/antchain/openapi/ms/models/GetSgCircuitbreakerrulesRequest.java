// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetSgCircuitbreakerrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名，数组形式
    @NameInMap("app_names")
    @Validation(required = true)
    public String appNames;

    // 服务资源id
    @NameInMap("data_id")
    public String dataId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名
    @NameInMap("name")
    public String name;

    // 排序规则，JSON字符串,，数组形式
    @NameInMap("orders")
    public String orders;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static GetSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSgCircuitbreakerrulesRequest self = new GetSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public GetSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSgCircuitbreakerrulesRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public GetSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSgCircuitbreakerrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSgCircuitbreakerrulesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public GetSgCircuitbreakerrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetSgCircuitbreakerrulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
