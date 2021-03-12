// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidCommonAgentcreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 自定信息
    @NameInMap("extension_info")
    public String extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    @NameInMap("indexs")
    public java.util.List<String> indexs;

    // 名称
    @NameInMap("owner_name")
    @Validation(required = true)
    public String ownerName;

    // 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 携带自己定义的服务类型
    @NameInMap("services")
    public java.util.List<DidDocServicesInfo> services;

    // 指定did的类型
    @NameInMap("entity_type")
    public String entityType;

    public static StartDidCommonAgentcreateRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidCommonAgentcreateRequest self = new StartDidCommonAgentcreateRequest();
        return TeaModel.build(map, self);
    }

    public StartDidCommonAgentcreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidCommonAgentcreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidCommonAgentcreateRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidCommonAgentcreateRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public StartDidCommonAgentcreateRequest setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
        return this;
    }
    public java.util.List<String> getIndexs() {
        return this.indexs;
    }

    public StartDidCommonAgentcreateRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public StartDidCommonAgentcreateRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public StartDidCommonAgentcreateRequest setServices(java.util.List<DidDocServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getServices() {
        return this.services;
    }

    public StartDidCommonAgentcreateRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

}
