// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitDidCorporateDirectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    @NameInMap("extension")
    public String extension;

    // owner名
    @NameInMap("owner_name")
    public String ownerName;

    // 租户自有用户的唯1号，每个owner_uid只能申请一个did
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // did doc service信息列表
    @NameInMap("services")
    public java.util.List<DisServicesInfo> services;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static InitDidCorporateDirectRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDidCorporateDirectRequest self = new InitDidCorporateDirectRequest();
        return TeaModel.build(map, self);
    }

    public InitDidCorporateDirectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDidCorporateDirectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDidCorporateDirectRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public InitDidCorporateDirectRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public InitDidCorporateDirectRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public InitDidCorporateDirectRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public InitDidCorporateDirectRequest setServices(java.util.List<DisServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DisServicesInfo> getServices() {
        return this.services;
    }

    public InitDidCorporateDirectRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
