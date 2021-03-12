// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChain extends TeaModel {
    // notary_blockchain
    @NameInMap("notary_blockchain")
    public ALiYunNotaryBlockchain notaryBlockchain;

    // contract_blockchain
    @NameInMap("contract_blockchain")
    public ALiYunContractBlockchain contractBlockchain;

    // old_contract_blockchain
    @NameInMap("old_contract_blockchain")
    public ALiYunOldContractBlockchain oldContractBlockchain;

    public static ALiYunChain build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChain self = new ALiYunChain();
        return TeaModel.build(map, self);
    }

    public ALiYunChain setNotaryBlockchain(ALiYunNotaryBlockchain notaryBlockchain) {
        this.notaryBlockchain = notaryBlockchain;
        return this;
    }
    public ALiYunNotaryBlockchain getNotaryBlockchain() {
        return this.notaryBlockchain;
    }

    public ALiYunChain setContractBlockchain(ALiYunContractBlockchain contractBlockchain) {
        this.contractBlockchain = contractBlockchain;
        return this;
    }
    public ALiYunContractBlockchain getContractBlockchain() {
        return this.contractBlockchain;
    }

    public ALiYunChain setOldContractBlockchain(ALiYunOldContractBlockchain oldContractBlockchain) {
        this.oldContractBlockchain = oldContractBlockchain;
        return this;
    }
    public ALiYunOldContractBlockchain getOldContractBlockchain() {
        return this.oldContractBlockchain;
    }

}
