// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractIdeConfigResult extends TeaModel {
    // 合约链的配置信息，可包含多个合约链的配置
    @NameInMap("contract_ide_config_list")
    @Validation(required = true)
    public java.util.List<ContractIdeConfig> contractIdeConfigList;

    public static ContractIdeConfigResult build(java.util.Map<String, ?> map) throws Exception {
        ContractIdeConfigResult self = new ContractIdeConfigResult();
        return TeaModel.build(map, self);
    }

    public ContractIdeConfigResult setContractIdeConfigList(java.util.List<ContractIdeConfig> contractIdeConfigList) {
        this.contractIdeConfigList = contractIdeConfigList;
        return this;
    }
    public java.util.List<ContractIdeConfig> getContractIdeConfigList() {
        return this.contractIdeConfigList;
    }

}
