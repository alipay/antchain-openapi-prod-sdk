// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgServiceratelimitrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 分页参数
    // 
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static ListSgServiceratelimitrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgServiceratelimitrulesRequest self = new ListSgServiceratelimitrulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSgServiceratelimitrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgServiceratelimitrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgServiceratelimitrulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgServiceratelimitrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgServiceratelimitrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgServiceratelimitrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgServiceratelimitrulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSgServiceratelimitrulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
