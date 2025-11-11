// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ProjectBaseInfoVo extends TeaModel {
    // 项目id
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 资产项目合约地址
    // （Launch Network/Shares token ）
    /**
     * <strong>example:</strong>
     * <p>0xf7d48f098440a166e9785ced7073baa6964acc80</p>
     */
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目名称
    /**
     * <strong>example:</strong>
     * <p>测试项目</p>
     */
    @NameInMap("projcet_name")
    public String projcetName;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("description")
    public String description;

    // 项目状态
    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("project_status")
    public String projectStatus;

    // 项目所在链（Launch Network）
    /**
     * <strong>example:</strong>
     * <p>ANTCHAIN</p>
     */
    @NameInMap("chain_type")
    public String chainType;

    public static ProjectBaseInfoVo build(java.util.Map<String, ?> map) throws Exception {
        ProjectBaseInfoVo self = new ProjectBaseInfoVo();
        return TeaModel.build(map, self);
    }

    public ProjectBaseInfoVo setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProjectBaseInfoVo setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ProjectBaseInfoVo setProjcetName(String projcetName) {
        this.projcetName = projcetName;
        return this;
    }
    public String getProjcetName() {
        return this.projcetName;
    }

    public ProjectBaseInfoVo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProjectBaseInfoVo setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public ProjectBaseInfoVo setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

}
