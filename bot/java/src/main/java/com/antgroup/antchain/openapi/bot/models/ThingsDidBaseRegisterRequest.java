// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ThingsDidBaseRegisterRequest extends TeaModel {
    // 信物链实体的所有者的分布式身份
    @NameInMap("owner_tenant_did")
    public String ownerTenantDid;

    // 信物链实体的使用方的分布式身份列表
    @NameInMap("user_did")
    public java.util.List<String> userDid;

    // 信物链实体身份
    // DID_TYPE_DEVICE_ALIYUN: 阿里云设备
    // DID_TYPE_DEVICE_PEGASUS: 链机设备
    // DID_TYPE_DEVICE_MCU: MCU设备
    // DID_TYPE_DEVICE_INTEL: intel设备
    // DID_TYPE_DEVICE_DEVICE: 默认设备
    // ...
    // DID_TYPE_CORPORATE:  组织实体
    // DID_TYPE_WAREHOUSE：仓库实体
    // DID_TYPE_SPACE： 空间实体
    @NameInMap("thing_type")
    @Validation(required = true)
    public String thingType;

    // 原始id，租户内同一类型实体唯一
    @NameInMap("thing_origin_id")
    @Validation(required = true)
    public String thingOriginId;

    // 实体原始名称
    @NameInMap("thing_origin_name")
    @Validation(required = true)
    public String thingOriginName;

    // 实体版本
    @NameInMap("thing_version")
    @Validation(required = true)
    public String thingVersion;

    // 业务编码
    @NameInMap("biz_type")
    public String bizType;

    // 信物链实体附加信息
    // 不同实体身份，有不同的json组织格式，参考另外技术文档
    @NameInMap("thing_extra_params")
    public String thingExtraParams;

    public static ThingsDidBaseRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        ThingsDidBaseRegisterRequest self = new ThingsDidBaseRegisterRequest();
        return TeaModel.build(map, self);
    }

    public ThingsDidBaseRegisterRequest setOwnerTenantDid(String ownerTenantDid) {
        this.ownerTenantDid = ownerTenantDid;
        return this;
    }
    public String getOwnerTenantDid() {
        return this.ownerTenantDid;
    }

    public ThingsDidBaseRegisterRequest setUserDid(java.util.List<String> userDid) {
        this.userDid = userDid;
        return this;
    }
    public java.util.List<String> getUserDid() {
        return this.userDid;
    }

    public ThingsDidBaseRegisterRequest setThingType(String thingType) {
        this.thingType = thingType;
        return this;
    }
    public String getThingType() {
        return this.thingType;
    }

    public ThingsDidBaseRegisterRequest setThingOriginId(String thingOriginId) {
        this.thingOriginId = thingOriginId;
        return this;
    }
    public String getThingOriginId() {
        return this.thingOriginId;
    }

    public ThingsDidBaseRegisterRequest setThingOriginName(String thingOriginName) {
        this.thingOriginName = thingOriginName;
        return this;
    }
    public String getThingOriginName() {
        return this.thingOriginName;
    }

    public ThingsDidBaseRegisterRequest setThingVersion(String thingVersion) {
        this.thingVersion = thingVersion;
        return this;
    }
    public String getThingVersion() {
        return this.thingVersion;
    }

    public ThingsDidBaseRegisterRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ThingsDidBaseRegisterRequest setThingExtraParams(String thingExtraParams) {
        this.thingExtraParams = thingExtraParams;
        return this;
    }
    public String getThingExtraParams() {
        return this.thingExtraParams;
    }

}
