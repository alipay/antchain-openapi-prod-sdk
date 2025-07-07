// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DataEntity extends TeaModel {
    // 授权状态
    /**
     * <strong>example:</strong>
     * <p>AUTHORIZED</p>
     */
    @NameInMap("auth_status")
    public String authStatus;

    // 业务系统唯一标示
    /**
     * <strong>example:</strong>
     * <p>76a0e716164848168dc726460042ee25</p>
     */
    @NameInMap("biz_uid")
    @Validation(maxLength = 64)
    public String bizUid;

    // 区块链ID
    /**
     * <strong>example:</strong>
     * <p>8c777cf9a71b660233215b6337dca78d</p>
     */
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 数据类别
    /**
     * <strong>example:</strong>
     * <p>TABLE,FILE...</p>
     */
    @NameInMap("category")
    @Validation(required = true, maxLength = 32)
    public String category;

    // 数据ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("data_id")
    @Validation(required = true, maxLength = 100)
    public String dataId;

    // 数据模型ID
    /**
     * <strong>example:</strong>
     * <p>DATA_MODEL_Q23</p>
     */
    @NameInMap("data_model_id")
    public String dataModelId;

    // 扩展信息，标准JSON格式
    /**
     * <strong>example:</strong>
     * <p>{&quot;strategy&quot;:&quot;test”}</p>
     */
    @NameInMap("extension_info")
    public String extensionInfo;

    // 数据名称
    /**
     * <strong>example:</strong>
     * <p>testdata</p>
     */
    @NameInMap("name")
    @Validation(required = true, maxLength = 64)
    public String name;

    // 数据所有者ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("owner_id")
    @Validation(required = true, maxLength = 100)
    public String ownerId;

    // 流程节点信息
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    // 数据状态
    /**
     * <strong>example:</strong>
     * <p>ACTIVE,DELETED...</p>
     */
    @NameInMap("status")
    @Validation(maxLength = 16)
    public String status;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1595574776000</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>1592810480442</p>
     */
    @NameInMap("update_time")
    public Long updateTime;

    // DID doc里的公开信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
