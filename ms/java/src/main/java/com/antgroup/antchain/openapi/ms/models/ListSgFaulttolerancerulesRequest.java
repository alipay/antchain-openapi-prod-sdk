// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaulttolerancerulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 排序字段
    @NameInMap("orders")
    public String orders;

    // 页的条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 开始行
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static ListSgFaulttolerancerulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaulttolerancerulesRequest self = new ListSgFaulttolerancerulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSgFaulttolerancerulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgFaulttolerancerulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgFaulttolerancerulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgFaulttolerancerulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgFaulttolerancerulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSgFaulttolerancerulesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListSgFaulttolerancerulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgFaulttolerancerulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
