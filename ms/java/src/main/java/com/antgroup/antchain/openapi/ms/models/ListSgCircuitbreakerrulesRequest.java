// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgCircuitbreakerrulesRequest extends TeaModel {
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

    // 	
    // 熔断模式，目前有OBSERVER和REJECT两种
    @NameInMap("mode")
    public String mode;

    // 排序规则，JSON字符串
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

    // 生效状态，0为不生效，1为生效
    @NameInMap("status")
    public Long status;

    public static ListSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgCircuitbreakerrulesRequest self = new ListSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgCircuitbreakerrulesRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public ListSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgCircuitbreakerrulesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListSgCircuitbreakerrulesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListSgCircuitbreakerrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgCircuitbreakerrulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListSgCircuitbreakerrulesRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
