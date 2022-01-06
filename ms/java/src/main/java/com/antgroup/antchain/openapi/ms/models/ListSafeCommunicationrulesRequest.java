// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSafeCommunicationrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 取值(0-客户端,1-服务端)
    @NameInMap("direction")
    public String direction;

    // 模式(0-tls,1-mtls)
    @NameInMap("mode")
    public String mode;

    // 策略(0-普通,1-国密)
    @NameInMap("strategy")
    public String strategy;

    // 排序字段,key枚举范围("operateTime","name", "direction", "mode", "strategy","enabled",
    //             "scope")，dir枚举范围("DESC", "ASC")
    @NameInMap("orders")
    public String orders;

    // 开始页
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 每页条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListSafeCommunicationrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSafeCommunicationrulesRequest self = new ListSafeCommunicationrulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSafeCommunicationrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSafeCommunicationrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSafeCommunicationrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSafeCommunicationrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSafeCommunicationrulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSafeCommunicationrulesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListSafeCommunicationrulesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListSafeCommunicationrulesRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public ListSafeCommunicationrulesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListSafeCommunicationrulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListSafeCommunicationrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
