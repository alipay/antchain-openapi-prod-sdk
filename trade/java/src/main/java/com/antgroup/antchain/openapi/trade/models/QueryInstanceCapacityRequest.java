// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryInstanceCapacityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID，和租户名称二选一必填	
    @NameInMap("tenant_id")
    public String tenantId;

    // 8位租户名，和租户ID二选一必填	
    @NameInMap("tenant_name")
    public String tenantName;

    // 资源包状态，不传则默认查询有效；Valid：有效；Closed：已用完；Expired：已到期	
    // 
    @NameInMap("status")
    public String status;

    // 资源包商品码
    @NameInMap("commodity_code")
    public String commodityCode;

    public static QueryInstanceCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceCapacityRequest self = new QueryInstanceCapacityRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceCapacityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInstanceCapacityRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInstanceCapacityRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryInstanceCapacityRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInstanceCapacityRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
