// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractPageResp extends TeaModel {
    // 合约列表
    @NameInMap("list")
    public java.util.List<ContractPageListResp> list;

    // 总数
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("total")
    public Long total;

    public static ContractPageResp build(java.util.Map<String, ?> map) throws Exception {
        ContractPageResp self = new ContractPageResp();
        return TeaModel.build(map, self);
    }

    public ContractPageResp setList(java.util.List<ContractPageListResp> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ContractPageListResp> getList() {
        return this.list;
    }

    public ContractPageResp setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
