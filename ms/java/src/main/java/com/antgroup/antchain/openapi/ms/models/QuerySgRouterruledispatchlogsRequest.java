// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgRouterruledispatchlogsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 分页参数
    @NameInMap("limit")
    public Long limit;

    // 分页参数
    @NameInMap("start")
    public Long start;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QuerySgRouterruledispatchlogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySgRouterruledispatchlogsRequest self = new QuerySgRouterruledispatchlogsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySgRouterruledispatchlogsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySgRouterruledispatchlogsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySgRouterruledispatchlogsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QuerySgRouterruledispatchlogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySgRouterruledispatchlogsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public QuerySgRouterruledispatchlogsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QuerySgRouterruledispatchlogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
