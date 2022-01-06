// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicesubkeysRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // 分页参数
    @NameInMap("page_size")
    @Validation(required = true)
    public String pageSize;

    // 分页参数
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 区域ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static QuerySgServicesubkeysRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicesubkeysRequest self = new QuerySgServicesubkeysRequest();
        return TeaModel.build(map, self);
    }

    public QuerySgServicesubkeysRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySgServicesubkeysRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySgServicesubkeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySgServicesubkeysRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QuerySgServicesubkeysRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QuerySgServicesubkeysRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QuerySgServicesubkeysRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
