// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgRouterrulegroupappsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 起始页
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListSgRouterrulegroupappsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgRouterrulegroupappsRequest self = new ListSgRouterrulegroupappsRequest();
        return TeaModel.build(map, self);
    }

    public ListSgRouterrulegroupappsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgRouterrulegroupappsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgRouterrulegroupappsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgRouterrulegroupappsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgRouterrulegroupappsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgRouterrulegroupappsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSgRouterrulegroupappsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListSgRouterrulegroupappsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
