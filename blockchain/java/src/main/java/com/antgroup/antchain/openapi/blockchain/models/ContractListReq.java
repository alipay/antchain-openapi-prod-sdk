// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractListReq extends TeaModel {
    // 合约服务类别
    @NameInMap("type")
    public String type;

    public static ContractListReq build(java.util.Map<String, ?> map) throws Exception {
        ContractListReq self = new ContractListReq();
        return TeaModel.build(map, self);
    }

    public ContractListReq setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
