// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicepubkeysRequest extends TeaModel {
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
    public Long pageSize;

    // 分页参数
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 区域ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static QuerySgServicepubkeysRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicepubkeysRequest self = new QuerySgServicepubkeysRequest();
        return TeaModel.build(map, self);
    }

    public QuerySgServicepubkeysRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySgServicepubkeysRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySgServicepubkeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySgServicepubkeysRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QuerySgServicepubkeysRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgServicepubkeysRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QuerySgServicepubkeysRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
