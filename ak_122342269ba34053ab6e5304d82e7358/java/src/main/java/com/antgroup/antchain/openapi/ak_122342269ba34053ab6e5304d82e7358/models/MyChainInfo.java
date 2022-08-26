// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class MyChainInfo extends TeaModel {
    // 区块链id
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 链域名
    @NameInMap("domain")
    public String domain;

    // 创建日期
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
    @NameInMap("reg_status")
    public String regStatus;

    // 链类型：MYCHAIN_010, FABRIC_14
    // 
    @NameInMap("type")
    public String type;

    public static MyChainInfo build(java.util.Map<String, ?> map) throws Exception {
        MyChainInfo self = new MyChainInfo();
        return TeaModel.build(map, self);
    }

    public MyChainInfo setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public MyChainInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MyChainInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public MyChainInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MyChainInfo setRegStatus(String regStatus) {
        this.regStatus = regStatus;
        return this;
    }
    public String getRegStatus() {
        return this.regStatus;
    }

    public MyChainInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
