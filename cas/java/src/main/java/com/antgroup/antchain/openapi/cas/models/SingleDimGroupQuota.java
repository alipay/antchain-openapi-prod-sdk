// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SingleDimGroupQuota extends TeaModel {
    // quota_id
    @NameInMap("quota_id")
    @Validation(required = true)
    public String quotaId;

    // 后端用，前端无需关心
    @NameInMap("dim_group_id")
    public String dimGroupId;

    // dim_identity
    @NameInMap("dim_identity")
    @Validation(required = true)
    public String dimIdentity;

    // resource_identity
    @NameInMap("resource_identity")
    @Validation(required = true)
    public String resourceIdentity;

    // 配额最大值，注意:1. hardLimit为 -1时 表时无限大2. hardLimit为 -2时 表时无限小
    @NameInMap("hard_limit")
    @Validation(required = true)
    public Long hardLimit;

    // 后端用，前端无需关心
    @NameInMap("sync_interface")
    public String syncInterface;

    // 创建者
    @NameInMap("creator_name")
    public String creatorName;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // 维度实例的值，比如某个workspace的ID
    @NameInMap("dim_ins_value")
    @Validation(required = true)
    public String dimInsValue;

    // 由于额度只支持整数，用这个浮点数factor表示乘数因子，
    @NameInMap("quota_factor")
    public String quotaFactor;

    public static SingleDimGroupQuota build(java.util.Map<String, ?> map) throws Exception {
        SingleDimGroupQuota self = new SingleDimGroupQuota();
        return TeaModel.build(map, self);
    }

    public SingleDimGroupQuota setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public SingleDimGroupQuota setDimGroupId(String dimGroupId) {
        this.dimGroupId = dimGroupId;
        return this;
    }
    public String getDimGroupId() {
        return this.dimGroupId;
    }

    public SingleDimGroupQuota setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public SingleDimGroupQuota setResourceIdentity(String resourceIdentity) {
        this.resourceIdentity = resourceIdentity;
        return this;
    }
    public String getResourceIdentity() {
        return this.resourceIdentity;
    }

    public SingleDimGroupQuota setHardLimit(Long hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }
    public Long getHardLimit() {
        return this.hardLimit;
    }

    public SingleDimGroupQuota setSyncInterface(String syncInterface) {
        this.syncInterface = syncInterface;
        return this;
    }
    public String getSyncInterface() {
        return this.syncInterface;
    }

    public SingleDimGroupQuota setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public SingleDimGroupQuota setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public SingleDimGroupQuota setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public SingleDimGroupQuota setDimInsValue(String dimInsValue) {
        this.dimInsValue = dimInsValue;
        return this;
    }
    public String getDimInsValue() {
        return this.dimInsValue;
    }

    public SingleDimGroupQuota setQuotaFactor(String quotaFactor) {
        this.quotaFactor = quotaFactor;
        return this;
    }
    public String getQuotaFactor() {
        return this.quotaFactor;
    }

}
