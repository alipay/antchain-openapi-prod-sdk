// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class BlockchainBasicInfo extends TeaModel {
    // 链id
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 描述
    @NameInMap("description")
    public String description;

    // 链域名
    @NameInMap("domain")
    public String domain;

    // 创建时间，13位时间戳
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 根据type会返回不通的json格式，表示不同类型的链配置； mychain: { "bizid": "", "tlsCert": "", "tlsCaCert": "", "account": "", "anchoredBlockHeight": 19876, "anchoredBlockHash": "" } fabric: { "channel": "", "userMspId": "", "userCert": "" }
    @NameInMap("info")
    public String info;

    // 注册状态
    // 
    @NameInMap("reg_status")
    public String regStatus;

    // 链类型
    // 
    @NameInMap("type")
    public String type;

    public static BlockchainBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBasicInfo self = new BlockchainBasicInfo();
        return TeaModel.build(map, self);
    }

    public BlockchainBasicInfo setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public BlockchainBasicInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BlockchainBasicInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BlockchainBasicInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public BlockchainBasicInfo setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public BlockchainBasicInfo setRegStatus(String regStatus) {
        this.regStatus = regStatus;
        return this;
    }
    public String getRegStatus() {
        return this.regStatus;
    }

    public BlockchainBasicInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
