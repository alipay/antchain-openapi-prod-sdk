// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractCreateReq extends TeaModel {
    // 链ID
    /**
     * <strong>example:</strong>
     * <p>284f75bc-8069-443f-9d46-4576bb15f210</p>
     */
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 合约模板标识
    /**
     * <strong>example:</strong>
     * <p>cme2023072511571851e2f3</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 合约名称
    /**
     * <strong>example:</strong>
     * <p>资产合约</p>
     */
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
