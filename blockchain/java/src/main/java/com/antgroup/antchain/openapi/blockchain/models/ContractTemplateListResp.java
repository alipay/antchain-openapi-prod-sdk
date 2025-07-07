// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractTemplateListResp extends TeaModel {
    // 合约市场列表
    @NameInMap("list")
    public java.util.List<ContractTemplateResp> list;

    // 总数
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("total")
    public Long total;

    public static ContractTemplateListResp build(java.util.Map<String, ?> map) throws Exception {
        ContractTemplateListResp self = new ContractTemplateListResp();
        return TeaModel.build(map, self);
    }

    public ContractTemplateListResp setList(java.util.List<ContractTemplateResp> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ContractTemplateResp> getList() {
        return this.list;
    }

    public ContractTemplateListResp setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
