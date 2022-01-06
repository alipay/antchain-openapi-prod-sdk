// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgAuthrulegroupservicesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 服务ID
    @NameInMap("data_id")
    public String dataId;

    // 该鉴权规则组下是否有鉴权规则
    @NameInMap("has_auth_rule")
    public Boolean hasAuthRule;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 页码
    @NameInMap("start")
    public Long start;

    public static ListSgAuthrulegroupservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgAuthrulegroupservicesRequest self = new ListSgAuthrulegroupservicesRequest();
        return TeaModel.build(map, self);
    }

    public ListSgAuthrulegroupservicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgAuthrulegroupservicesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgAuthrulegroupservicesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgAuthrulegroupservicesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgAuthrulegroupservicesRequest setHasAuthRule(Boolean hasAuthRule) {
        this.hasAuthRule = hasAuthRule;
        return this;
    }
    public Boolean getHasAuthRule() {
        return this.hasAuthRule;
    }

    public ListSgAuthrulegroupservicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgAuthrulegroupservicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgAuthrulegroupservicesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSgAuthrulegroupservicesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
