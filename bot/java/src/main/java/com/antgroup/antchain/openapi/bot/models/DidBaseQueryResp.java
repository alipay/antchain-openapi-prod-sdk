// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DidBaseQueryResp extends TeaModel {
    // 授权水平，0-默认关联授权
    @NameInMap("auth_level")
    public Long authLevel;

    // 证书公钥，特定实体可查询
    @NameInMap("cert_public_key")
    public String certPublicKey;

    // 证书文本，特定实体可以查询
    @NameInMap("cert_text")
    public String certText;

    // DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
    @NameInMap("did_extension")
    public String didExtension;

    // did公钥，特定w3c did实体可查询
    @NameInMap("did_public_key")
    public String didPublicKey;

    // DID用户名，w3c did实体可查询
    @NameInMap("did_username")
    public String didUsername;

    // 所有者DID
    @NameInMap("owner_did")
    public String ownerDid;

    // 实体附属空间列表，例如仓库下属库位，设备关联库位等
    @NameInMap("spaces_attached")
    public java.util.List<String> spacesAttached;

    // 实体附属实体列表，例如空间关联设备列表
    @NameInMap("things_attached")
    public java.util.List<String> thingsAttached;

    // 实体属性，在阿里云iot设备，对应三元组
    @NameInMap("thing_attribute")
    public String thingAttribute;

    // 原始ID
    @NameInMap("thing_id")
    public String thingId;

    // 实体物模型id
    @NameInMap("thing_model_id")
    public String thingModelId;

    // 服务端点，可实现w3c service endpoint
    @NameInMap("thing_service_endpoint")
    public String thingServiceEndpoint;

    // 设备状态需要是通过 updateStatus api更新，
    // 其他状态通过updateThingsDid api更新
    @NameInMap("thing_status")
    public String thingStatus;

    // 实体类型，注册时候的类型
    // 0: 阿里云设备
    // 1: 链机设备
    // 2: MCU设备
    // 3: INTEL设备
    // 16384:  默认设备
    // 65536: 组织身份
    // 131072: 仓库身份
    // 196608: 空间身份
    @NameInMap("thing_type")
    public Long thingType;

    // 实体版本
    @NameInMap("thing_version")
    public String thingVersion;

    // 使用者DID列表
    @NameInMap("user_did_list")
    public java.util.List<String> userDidList;

    // 查询的did
    @NameInMap("did")
    public String did;

    public static DidBaseQueryResp build(java.util.Map<String, ?> map) throws Exception {
        DidBaseQueryResp self = new DidBaseQueryResp();
        return TeaModel.build(map, self);
    }

    public DidBaseQueryResp setAuthLevel(Long authLevel) {
        this.authLevel = authLevel;
        return this;
    }
    public Long getAuthLevel() {
        return this.authLevel;
    }

    public DidBaseQueryResp setCertPublicKey(String certPublicKey) {
        this.certPublicKey = certPublicKey;
        return this;
    }
    public String getCertPublicKey() {
        return this.certPublicKey;
    }

    public DidBaseQueryResp setCertText(String certText) {
        this.certText = certText;
        return this;
    }
    public String getCertText() {
        return this.certText;
    }

    public DidBaseQueryResp setDidExtension(String didExtension) {
        this.didExtension = didExtension;
        return this;
    }
    public String getDidExtension() {
        return this.didExtension;
    }

    public DidBaseQueryResp setDidPublicKey(String didPublicKey) {
        this.didPublicKey = didPublicKey;
        return this;
    }
    public String getDidPublicKey() {
        return this.didPublicKey;
    }

    public DidBaseQueryResp setDidUsername(String didUsername) {
        this.didUsername = didUsername;
        return this;
    }
    public String getDidUsername() {
        return this.didUsername;
    }

    public DidBaseQueryResp setOwnerDid(String ownerDid) {
        this.ownerDid = ownerDid;
        return this;
    }
    public String getOwnerDid() {
        return this.ownerDid;
    }

    public DidBaseQueryResp setSpacesAttached(java.util.List<String> spacesAttached) {
        this.spacesAttached = spacesAttached;
        return this;
    }
    public java.util.List<String> getSpacesAttached() {
        return this.spacesAttached;
    }

    public DidBaseQueryResp setThingsAttached(java.util.List<String> thingsAttached) {
        this.thingsAttached = thingsAttached;
        return this;
    }
    public java.util.List<String> getThingsAttached() {
        return this.thingsAttached;
    }

    public DidBaseQueryResp setThingAttribute(String thingAttribute) {
        this.thingAttribute = thingAttribute;
        return this;
    }
    public String getThingAttribute() {
        return this.thingAttribute;
    }

    public DidBaseQueryResp setThingId(String thingId) {
        this.thingId = thingId;
        return this;
    }
    public String getThingId() {
        return this.thingId;
    }

    public DidBaseQueryResp setThingModelId(String thingModelId) {
        this.thingModelId = thingModelId;
        return this;
    }
    public String getThingModelId() {
        return this.thingModelId;
    }

    public DidBaseQueryResp setThingServiceEndpoint(String thingServiceEndpoint) {
        this.thingServiceEndpoint = thingServiceEndpoint;
        return this;
    }
    public String getThingServiceEndpoint() {
        return this.thingServiceEndpoint;
    }

    public DidBaseQueryResp setThingStatus(String thingStatus) {
        this.thingStatus = thingStatus;
        return this;
    }
    public String getThingStatus() {
        return this.thingStatus;
    }

    public DidBaseQueryResp setThingType(Long thingType) {
        this.thingType = thingType;
        return this;
    }
    public Long getThingType() {
        return this.thingType;
    }

    public DidBaseQueryResp setThingVersion(String thingVersion) {
        this.thingVersion = thingVersion;
        return this;
    }
    public String getThingVersion() {
        return this.thingVersion;
    }

    public DidBaseQueryResp setUserDidList(java.util.List<String> userDidList) {
        this.userDidList = userDidList;
        return this;
    }
    public java.util.List<String> getUserDidList() {
        return this.userDidList;
    }

    public DidBaseQueryResp setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
