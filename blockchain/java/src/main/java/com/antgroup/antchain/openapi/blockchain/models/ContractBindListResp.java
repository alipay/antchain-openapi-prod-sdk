// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractBindListResp extends TeaModel {
    // 合约关联列表
    @NameInMap("list")
    public java.util.List<ContractBindResp> list;

    public static ContractBindListResp build(java.util.Map<String, ?> map) throws Exception {
        ContractBindListResp self = new ContractBindListResp();
        return TeaModel.build(map, self);
    }

    public ContractBindListResp setList(java.util.List<ContractBindResp> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ContractBindResp> getList() {
        return this.list;
    }

}
