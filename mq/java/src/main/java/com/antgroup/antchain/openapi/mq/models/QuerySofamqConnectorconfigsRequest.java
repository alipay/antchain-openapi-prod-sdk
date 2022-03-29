// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorconfigsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户名称
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 代表查询的配置 是source还是sink
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 是否是克隆模式
    @NameInMap("clone")
    public Boolean clone;

    public static QuerySofamqConnectorconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorconfigsRequest self = new QuerySofamqConnectorconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorconfigsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectorconfigsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectorconfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqConnectorconfigsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QuerySofamqConnectorconfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QuerySofamqConnectorconfigsRequest setClone(Boolean clone) {
        this.clone = clone;
        return this;
    }
    public Boolean getClone() {
        return this.clone;
    }

}
