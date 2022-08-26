// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class OdatsRegisteredBlockChainInfo extends TeaModel {
    // 区块链id
    @NameInMap("blockchain_id")
    @Validation(required = true)
    public String blockchainId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 链域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // 注册时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 链注册状态
    // INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
    @NameInMap("reg_status")
    @Validation(required = true)
    public String regStatus;

    // 链类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static OdatsRegisteredBlockChainInfo build(java.util.Map<String, ?> map) throws Exception {
        OdatsRegisteredBlockChainInfo self = new OdatsRegisteredBlockChainInfo();
        return TeaModel.build(map, self);
    }

    public OdatsRegisteredBlockChainInfo setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public OdatsRegisteredBlockChainInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OdatsRegisteredBlockChainInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public OdatsRegisteredBlockChainInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OdatsRegisteredBlockChainInfo setRegStatus(String regStatus) {
        this.regStatus = regStatus;
        return this;
    }
    public String getRegStatus() {
        return this.regStatus;
    }

    public OdatsRegisteredBlockChainInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
