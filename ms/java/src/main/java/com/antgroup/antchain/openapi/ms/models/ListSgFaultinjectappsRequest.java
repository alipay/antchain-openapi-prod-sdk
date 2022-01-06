// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaultinjectappsRequest extends TeaModel {
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
    public String appName;

    // 故障注入规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 页码
    @NameInMap("start")
    public Long start;

    // 页大小
    @NameInMap("page_size")
    public String pageSize;

    public static ListSgFaultinjectappsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaultinjectappsRequest self = new ListSgFaultinjectappsRequest();
        return TeaModel.build(map, self);
    }

    public ListSgFaultinjectappsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgFaultinjectappsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgFaultinjectappsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgFaultinjectappsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgFaultinjectappsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgFaultinjectappsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSgFaultinjectappsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListSgFaultinjectappsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
