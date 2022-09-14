// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DataEntity extends TeaModel {
    // 授权状态
    @NameInMap("auth_status")
    public String authStatus;

    // 业务系统唯一标示
    @NameInMap("biz_uid")
    @Validation(maxLength = 64)
    public String bizUid;

    // 区块链ID
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 数据类别
    @NameInMap("category")
    @Validation(required = true, maxLength = 32)
    public String category;

    // 数据ID
    @NameInMap("data_id")
    @Validation(required = true, maxLength = 100)
    public String dataId;

    // 数据模型ID
    @NameInMap("data_model_id")
    public String dataModelId;

    // 扩展信息，标准JSON格式
    @NameInMap("extension_info")
    public String extensionInfo;

    // 数据名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 64)
    public String name;

    // 数据所有者ID
    @NameInMap("owner_id")
    @Validation(required = true, maxLength = 100)
    public String ownerId;

    // 流程节点信息
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    // 数据状态
    @NameInMap("status")
    @Validation(maxLength = 16)
    public String status;

    // 创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 修改时间
    @NameInMap("update_time")
    public Long updateTime;

    // DID doc里的公开信息
    @NameInMap("public_info")
    public String publicInfo;

    public static DataEntity build(java.util.Map<String, ?> map) throws Exception {
        DataEntity self = new DataEntity();
        return TeaModel.build(map, self);
    }

    public DataEntity setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public DataEntity setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public DataEntity setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public DataEntity setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataEntity setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DataEntity setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public DataEntity setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public DataEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataEntity setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DataEntity setProcessTemplate(java.util.List<ProcessNode> processTemplate) {
        this.processTemplate = processTemplate;
        return this;
    }
    public java.util.List<ProcessNode> getProcessTemplate() {
        return this.processTemplate;
    }

    public DataEntity setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataEntity setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DataEntity setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public DataEntity setPublicInfo(String publicInfo) {
        this.publicInfo = publicInfo;
        return this;
    }
    public String getPublicInfo() {
        return this.publicInfo;
    }

}
