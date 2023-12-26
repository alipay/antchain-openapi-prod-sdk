// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractCreateReq extends TeaModel {
    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 合约模板标识
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 合约名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ContractCreateReq build(java.util.Map<String, ?> map) throws Exception {
        ContractCreateReq self = new ContractCreateReq();
        return TeaModel.build(map, self);
    }

    public ContractCreateReq setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ContractCreateReq setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ContractCreateReq setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
