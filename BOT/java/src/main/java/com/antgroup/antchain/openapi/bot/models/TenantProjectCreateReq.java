// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TenantProjectCreateReq extends TeaModel {
    // 业务类型，默认空
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("biz_type")
    public String bizType;

    // 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("blockchain_type")
    public Long blockchainType;

    // 可选的，项目关联的区块链uid
    /**
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("blockchain_uid")
    public String blockchainUid;

    // 租户下唯一项目名称，用以标识项目聚合的存证等信息
    /**
     * <strong>example:</strong>
     * <p>&quot;唯一项目名称&quot;</p>
     */
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    public static TenantProjectCreateReq build(java.util.Map<String, ?> map) throws Exception {
        TenantProjectCreateReq self = new TenantProjectCreateReq();
        return TeaModel.build(map, self);
    }

    public TenantProjectCreateReq setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public TenantProjectCreateReq setBlockchainType(Long blockchainType) {
        this.blockchainType = blockchainType;
        return this;
    }
    public Long getBlockchainType() {
        return this.blockchainType;
    }

    public TenantProjectCreateReq setBlockchainUid(String blockchainUid) {
        this.blockchainUid = blockchainUid;
        return this;
    }
    public String getBlockchainUid() {
        return this.blockchainUid;
    }

    public TenantProjectCreateReq setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
