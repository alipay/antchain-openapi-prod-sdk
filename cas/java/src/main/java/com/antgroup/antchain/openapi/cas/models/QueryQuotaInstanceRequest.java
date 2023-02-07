// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryQuotaInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // quota类的ID，请使用Quota API查询获取
    @NameInMap("quota_id")
    public String quotaId;

    // 接入配额的时候,在配额中注册的资源标识
    @NameInMap("resource_identity")
    public String resourceIdentity;

    // 当状态为INFINITE,即无限大.当状态为INFINITESIMAL时,即为无限小
    @NameInMap("status")
    public String status;

    // 上限值
    @NameInMap("hard_limit")
    public Long hardLimit;

    // in_use
    @NameInMap("in_use")
    public Long inUse;

    // 维度实例组合ID
    @NameInMap("dim_instance_group_id")
    public String dimInstanceGroupId;

    // page_number
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 维度标记
    @NameInMap("dim_identity")
    public String dimIdentity;

    // 维度的值
    @NameInMap("dim_ins_value")
    public String dimInsValue;

    public static QueryQuotaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaInstanceRequest self = new QueryQuotaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryQuotaInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQuotaInstanceRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public QueryQuotaInstanceRequest setResourceIdentity(String resourceIdentity) {
        this.resourceIdentity = resourceIdentity;
        return this;
    }
    public String getResourceIdentity() {
        return this.resourceIdentity;
    }

    public QueryQuotaInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryQuotaInstanceRequest setHardLimit(Long hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }
    public Long getHardLimit() {
        return this.hardLimit;
    }

    public QueryQuotaInstanceRequest setInUse(Long inUse) {
        this.inUse = inUse;
        return this;
    }
    public Long getInUse() {
        return this.inUse;
    }

    public QueryQuotaInstanceRequest setDimInstanceGroupId(String dimInstanceGroupId) {
        this.dimInstanceGroupId = dimInstanceGroupId;
        return this;
    }
    public String getDimInstanceGroupId() {
        return this.dimInstanceGroupId;
    }

    public QueryQuotaInstanceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryQuotaInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryQuotaInstanceRequest setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public QueryQuotaInstanceRequest setDimInsValue(String dimInsValue) {
        this.dimInsValue = dimInsValue;
        return this;
    }
    public String getDimInsValue() {
        return this.dimInsValue;
    }

}
