// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBlockchainInfo extends TeaModel {
    // 链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 链的状态
    @NameInMap("blockchain_status")
    @Validation(required = true)
    public String blockchainStatus;

    // 链的类型
    @NameInMap("blockchain_type")
    @Validation(required = true)
    public String blockchainType;

    // 链的名称
    @NameInMap("blockchain_name")
    @Validation(required = true)
    public String blockchainName;

    // 节点数量
    @NameInMap("blockchan_node_num")
    @Validation(required = true)
    public Long blockchanNodeNum;

    // 创建时间
    @NameInMap("blockchain_create_time")
    @Validation(required = true)
    public Long blockchainCreateTime;

    public static CreateBlockchainInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainInfo self = new CreateBlockchainInfo();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainInfo setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateBlockchainInfo setBlockchainStatus(String blockchainStatus) {
        this.blockchainStatus = blockchainStatus;
        return this;
    }
    public String getBlockchainStatus() {
        return this.blockchainStatus;
    }

    public CreateBlockchainInfo setBlockchainType(String blockchainType) {
        this.blockchainType = blockchainType;
        return this;
    }
    public String getBlockchainType() {
        return this.blockchainType;
    }

    public CreateBlockchainInfo setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public CreateBlockchainInfo setBlockchanNodeNum(Long blockchanNodeNum) {
        this.blockchanNodeNum = blockchanNodeNum;
        return this;
    }
    public Long getBlockchanNodeNum() {
        return this.blockchanNodeNum;
    }

    public CreateBlockchainInfo setBlockchainCreateTime(Long blockchainCreateTime) {
        this.blockchainCreateTime = blockchainCreateTime;
        return this;
    }
    public Long getBlockchainCreateTime() {
        return this.blockchainCreateTime;
    }

}
