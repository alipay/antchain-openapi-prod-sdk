// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractTypeResp extends TeaModel {
    // 合约服务类型
    @NameInMap("type")
    public String type;

    public static ContractTypeResp build(java.util.Map<String, ?> map) throws Exception {
        ContractTypeResp self = new ContractTypeResp();
        return TeaModel.build(map, self);
    }

    public ContractTypeResp setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
