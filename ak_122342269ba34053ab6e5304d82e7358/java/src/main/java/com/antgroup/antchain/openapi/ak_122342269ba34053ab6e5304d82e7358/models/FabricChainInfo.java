// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class FabricChainInfo extends TeaModel {
    // 区块链id	
    // 
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 描述
    @NameInMap("description")
    public String description;

    // 链域名
    @NameInMap("domain")
    public String domain;

    // 创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 链注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
    @NameInMap("reg_status")
    public String regStatus;

    // 区块链类型：MYCHAIN_010, FABRIC_14
    @NameInMap("type")
    public String type;

    public static FabricChainInfo build(java.util.Map<String, ?> map) throws Exception {
        FabricChainInfo self = new FabricChainInfo();
        return TeaModel.build(map, self);
    }

    public FabricChainInfo setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public FabricChainInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FabricChainInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public FabricChainInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public FabricChainInfo setRegStatus(String regStatus) {
        this.regStatus = regStatus;
        return this;
    }
    public String getRegStatus() {
        return this.regStatus;
    }

    public FabricChainInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
