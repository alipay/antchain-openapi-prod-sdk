// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgTrafficmirrorappsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 源服务ID
    @NameInMap("data_id")
    public String dataId;

    // 源应用
    @NameInMap("app_name")
    public String appName;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 起始页
    @NameInMap("start")
    @Validation(required = true, minimum = 1)
    public Long start;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true, minimum = 1)
    public Long pageSize;

    public static ListSgTrafficmirrorappsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSgTrafficmirrorappsRequest self = new ListSgTrafficmirrorappsRequest();
        return TeaModel.build(map, self);
    }

    public ListSgTrafficmirrorappsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSgTrafficmirrorappsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSgTrafficmirrorappsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSgTrafficmirrorappsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListSgTrafficmirrorappsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSgTrafficmirrorappsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSgTrafficmirrorappsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListSgTrafficmirrorappsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
