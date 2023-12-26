// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractTypeResp extends TeaModel {
    // 合约服务类型
    @NameInMap("type_list")
    public java.util.List<ContractTypeListResp> typeList;

    public static ContractTypeResp build(java.util.Map<String, ?> map) throws Exception {
        ContractTypeResp self = new ContractTypeResp();
        return TeaModel.build(map, self);
    }

    public ContractTypeResp setTypeList(java.util.List<ContractTypeListResp> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<ContractTypeListResp> getTypeList() {
        return this.typeList;
    }

}
