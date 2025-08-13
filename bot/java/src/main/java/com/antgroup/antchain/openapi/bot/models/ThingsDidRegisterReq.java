// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ThingsDidRegisterReq extends TeaModel {
    // 业务编码，暂时保留，不需传入
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("biz_type")
    public String bizType;

    // 信物链实体的所有者的分布式身份
    /**
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxxxx&quot;</p>
     */
    @NameInMap("owner_tenant_did")
    public String ownerTenantDid;

    // 信物链实体附加信息 不同实体身份，有不同的json组织格式...
    // 参考
    // DeviceRegisterReqModel，
    // SpaceRegisterReqModel，
    // CorporateReqModel，
    // WarehouseReqModel，
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;附加信息&quot;</p>
     */
    @NameInMap("thing_extra_params")
    public String thingExtraParams;

    // 原始id，租户内同一类型实体唯一
    /**
     * <strong>example:</strong>
     * <p>&quot;租户下唯一ID&quot;</p>
     */
    @NameInMap("thing_origin_id")
    @Validation(required = true)
    public String thingOriginId;

    // 实体原始名称
    /**
     * <strong>example:</strong>
     * <p>&quot;摄像头a&quot;</p>
     */
    @NameInMap("thing_origin_name")
    @Validation(required = true)
    public String thingOriginName;

    // 信物链实体身份 
    // DID_TYPE_DEVICE_ALIYUN(0): 阿里云设备 
    // DID_TYPE_DEVICE_PEGASUS(1): 链机设备 
    // DID_TYPE_DEVICE_MCU(2): MCU设备 
    // DID_TYPE_DEVICE_INTEL(3): intel设备 
    // DID_TYPE_DEVICE_DEVICE(16384): 默认设备 ... 
    // DID_TYPE_CORPORATE(65536): 组织实体 
    // DID_TYPE_WAREHOUSE(131072)：仓库实体 
    // DID_TYPE_SPACE(196608)： 空间实体
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("thing_type")
    @Validation(required = true)
    public Long thingType;

    // 实体版本
    /**
     * <strong>example:</strong>
     * <p>&quot;1.0.0&quot;</p>
     */
    @NameInMap("thing_version")
    @Validation(required = true)
    public String thingVersion;

    // 信物链实体的使用方的分布式身份列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;did:mychain:xxxx1&quot;,&quot;did:mychain:xxxx2&quot;]</p>
     */
    @NameInMap("user_did")
    public java.util.List<String> userDid;

    public static ThingsDidRegisterReq build(java.util.Map<String, ?> map) throws Exception {
        ThingsDidRegisterReq self = new ThingsDidRegisterReq();
        return TeaModel.build(map, self);
    }

    public ThingsDidRegisterReq setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ThingsDidRegisterReq setOwnerTenantDid(String ownerTenantDid) {
        this.ownerTenantDid = ownerTenantDid;
        return this;
    }
    public String getOwnerTenantDid() {
        return this.ownerTenantDid;
    }

    public ThingsDidRegisterReq setThingExtraParams(String thingExtraParams) {
        this.thingExtraParams = thingExtraParams;
        return this;
    }
    public String getThingExtraParams() {
        return this.thingExtraParams;
    }

    public ThingsDidRegisterReq setThingOriginId(String thingOriginId) {
        this.thingOriginId = thingOriginId;
        return this;
    }
    public String getThingOriginId() {
        return this.thingOriginId;
    }

    public ThingsDidRegisterReq setThingOriginName(String thingOriginName) {
        this.thingOriginName = thingOriginName;
        return this;
    }
    public String getThingOriginName() {
        return this.thingOriginName;
    }

    public ThingsDidRegisterReq setThingType(Long thingType) {
        this.thingType = thingType;
        return this;
    }
    public Long getThingType() {
        return this.thingType;
    }

    public ThingsDidRegisterReq setThingVersion(String thingVersion) {
        this.thingVersion = thingVersion;
        return this;
    }
    public String getThingVersion() {
        return this.thingVersion;
    }

    public ThingsDidRegisterReq setUserDid(java.util.List<String> userDid) {
        this.userDid = userDid;
        return this;
    }
    public java.util.List<String> getUserDid() {
        return this.userDid;
    }

}
