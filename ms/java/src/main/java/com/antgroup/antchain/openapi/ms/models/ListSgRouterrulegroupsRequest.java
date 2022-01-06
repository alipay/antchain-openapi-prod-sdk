// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgRouterrulegroupsRequest extends TeaModel {
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

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 页码
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListSgRouterrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgRouterrulegroupsRequest self = new ListSgRouterrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSgRouterrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgRouterrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgRouterrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgRouterrulegroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgRouterrulegroupsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgRouterrulegroupsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSgRouterrulegroupsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListSgRouterrulegroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
