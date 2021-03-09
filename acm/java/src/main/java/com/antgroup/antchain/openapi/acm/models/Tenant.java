// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class Tenant extends TeaModel {
    // 蚂蚁通行证签约账户
    @NameInMap("ant_account")
    public String antAccount;

    // 蚂蚁通行证uid
    @NameInMap("ant_uid")
    public String antUid;

    // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
    @NameInMap("business_owner_id")
    public String businessOwnerId;

    // 租户创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 租户所在的企业的唯一标识
    @NameInMap("customer")
    public String customer;

    // 租户描述信息
    @NameInMap("description")
    public String description;

    // 租户唯一标识
    @NameInMap("id")
    public String id;

    // 租户内部id
    @NameInMap("internal_id")
    public String internalId;

    // 租户显示名称
    @NameInMap("name")
    public String name;

    // 租户最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static Tenant build(java.util.Map<String, ?> map) throws Exception {
        Tenant self = new Tenant();
        return TeaModel.build(map, self);
    }

    public Tenant setAntAccount(String antAccount) {
        this.antAccount = antAccount;
        return this;
    }
    public String getAntAccount() {
        return this.antAccount;
    }

    public Tenant setAntUid(String antUid) {
        this.antUid = antUid;
        return this;
    }
    public String getAntUid() {
        return this.antUid;
    }

    public Tenant setBusinessOwnerId(String businessOwnerId) {
        this.businessOwnerId = businessOwnerId;
        return this;
    }
    public String getBusinessOwnerId() {
        return this.businessOwnerId;
    }

    public Tenant setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Tenant setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public Tenant setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Tenant setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Tenant setInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }
    public String getInternalId() {
        return this.internalId;
    }

    public Tenant setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Tenant setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
