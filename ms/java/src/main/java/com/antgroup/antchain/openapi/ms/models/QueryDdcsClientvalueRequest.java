// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsClientvalueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 属性自增长 ID，可以通过查询属性接口获取 ID
    @NameInMap("attribute_id")
    @Validation(required = true)
    public Long attributeId;

    // 系统字段：环境实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 查询的 IP 列表，英文逗号隔开
    @NameInMap("ips")
    @Validation(required = true)
    public String ips;

    public static QueryDdcsClientvalueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsClientvalueRequest self = new QueryDdcsClientvalueRequest();
        return TeaModel.build(map, self);
    }

    public QueryDdcsClientvalueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDdcsClientvalueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDdcsClientvalueRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public QueryDdcsClientvalueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDdcsClientvalueRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

}
