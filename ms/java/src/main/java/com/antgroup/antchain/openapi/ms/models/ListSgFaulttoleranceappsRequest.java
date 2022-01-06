// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaulttoleranceappsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app名称
    // 
    @NameInMap("app_name")
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

    public static ListSgFaulttoleranceappsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaulttoleranceappsRequest self = new ListSgFaulttoleranceappsRequest();
        return TeaModel.build(map, self);
    }

    public ListSgFaulttoleranceappsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgFaulttoleranceappsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgFaulttoleranceappsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgFaulttoleranceappsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgFaulttoleranceappsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSgFaulttoleranceappsRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListSgFaulttoleranceappsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgFaulttoleranceappsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
