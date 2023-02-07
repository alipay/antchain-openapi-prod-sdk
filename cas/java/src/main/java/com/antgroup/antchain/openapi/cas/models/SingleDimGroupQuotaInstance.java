// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SingleDimGroupQuotaInstance extends TeaModel {
    // 配额实例所属的 配额id
    @NameInMap("quota_id")
    @Validation(required = true)
    public String quotaId;

    // 配额实例id
    @NameInMap("quota_ins_id")
    @Validation(required = true)
    public String quotaInsId;

    // 维度实例组合id
    @NameInMap("dim_ins_group_id")
    public String dimInsGroupId;

    // 维度标识
    @NameInMap("dim_identity")
    public String dimIdentity;

    // 维度实例的值，比如某个具体的workspace_id
    @NameInMap("dim_ins_value")
    public String dimInsValue;

    // resource
    @NameInMap("resource")
    @Validation(required = true)
    public String resource;

    // 表示是无限大还是无限小
    @NameInMap("status")
    public String status;

    // 限额值
    @NameInMap("hard_limit")
    @Validation(required = true)
    public Long hardLimit;

    // 已经使用的额度
    @NameInMap("in_use")
    @Validation(required = true)
    public Long inUse;

    // 预分配的额度
    @NameInMap("reserved")
    public Long reserved;

    // 保留额度
    @NameInMap("remain")
    public Long remain;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // quota乘数因子，用以解决k8s资源可以用小数表示的问题。由于OP不支持浮点数，请用字符串表示
    @NameInMap("quota_factor")
    @Validation(required = true)
    public String quotaFactor;

    public static SingleDimGroupQuotaInstance build(java.util.Map<String, ?> map) throws Exception {
        SingleDimGroupQuotaInstance self = new SingleDimGroupQuotaInstance();
        return TeaModel.build(map, self);
    }

    public SingleDimGroupQuotaInstance setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public SingleDimGroupQuotaInstance setQuotaInsId(String quotaInsId) {
        this.quotaInsId = quotaInsId;
        return this;
    }
    public String getQuotaInsId() {
        return this.quotaInsId;
    }

    public SingleDimGroupQuotaInstance setDimInsGroupId(String dimInsGroupId) {
        this.dimInsGroupId = dimInsGroupId;
        return this;
    }
    public String getDimInsGroupId() {
        return this.dimInsGroupId;
    }

    public SingleDimGroupQuotaInstance setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public SingleDimGroupQuotaInstance setDimInsValue(String dimInsValue) {
        this.dimInsValue = dimInsValue;
        return this;
    }
    public String getDimInsValue() {
        return this.dimInsValue;
    }

    public SingleDimGroupQuotaInstance setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SingleDimGroupQuotaInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SingleDimGroupQuotaInstance setHardLimit(Long hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }
    public Long getHardLimit() {
        return this.hardLimit;
    }

    public SingleDimGroupQuotaInstance setInUse(Long inUse) {
        this.inUse = inUse;
        return this;
    }
    public Long getInUse() {
        return this.inUse;
    }

    public SingleDimGroupQuotaInstance setReserved(Long reserved) {
        this.reserved = reserved;
        return this;
    }
    public Long getReserved() {
        return this.reserved;
    }

    public SingleDimGroupQuotaInstance setRemain(Long remain) {
        this.remain = remain;
        return this;
    }
    public Long getRemain() {
        return this.remain;
    }

    public SingleDimGroupQuotaInstance setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public SingleDimGroupQuotaInstance setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public SingleDimGroupQuotaInstance setQuotaFactor(String quotaFactor) {
        this.quotaFactor = quotaFactor;
        return this;
    }
    public String getQuotaFactor() {
        return this.quotaFactor;
    }

}
