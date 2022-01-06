// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryGuardianGuardianrulepushhistorysRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // keyword
    @NameInMap("keyword")
    public String keyword;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public String pageSize;

    // 起始索引
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static QueryGuardianGuardianrulepushhistorysRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardianGuardianrulepushhistorysRequest self = new QueryGuardianGuardianrulepushhistorysRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuardianGuardianrulepushhistorysRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGuardianGuardianrulepushhistorysRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGuardianGuardianrulepushhistorysRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryGuardianGuardianrulepushhistorysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryGuardianGuardianrulepushhistorysRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryGuardianGuardianrulepushhistorysRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryGuardianGuardianrulepushhistorysRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
