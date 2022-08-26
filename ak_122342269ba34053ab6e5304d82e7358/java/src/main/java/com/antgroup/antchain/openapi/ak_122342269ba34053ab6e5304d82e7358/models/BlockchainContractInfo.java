// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class BlockchainContractInfo extends TeaModel {
    // mychain上系统合约“am合约”的地址
    @NameInMap("am_contract_address")
    public String amContractAddress;

    // 区块链id
    @NameInMap("blockchain_id")
    public String blockchainId;

    // fabric合约
    @NameInMap("chain_code")
    public String chainCode;

    // mychain系统合约“oracle合约”地址
    // 
    @NameInMap("oracle_contract_address")
    public String oracleContractAddress;

    // mychain链上系统合约“p2p合约”地址
    // 
    @NameInMap("p2p_contract_address")
    public String p2pContractAddress;

    // mychain上wasm版系统合约“am合约”的链上地址
    @NameInMap("wasm_am_contract_address")
    public String wasmAmContractAddress;

    // mychain wasm版系统合约“orcale合约”地址
    @NameInMap("wasm_oracle_contract_address")
    public String wasmOracleContractAddress;

    // mychain上wasm版系统合约“p2p合约”链上地址
    @NameInMap("wasm_p2p_contract_address")
    public String wasmP2pContractAddress;

    public static BlockchainContractInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockchainContractInfo self = new BlockchainContractInfo();
        return TeaModel.build(map, self);
    }

    public BlockchainContractInfo setAmContractAddress(String amContractAddress) {
        this.amContractAddress = amContractAddress;
        return this;
    }
    public String getAmContractAddress() {
        return this.amContractAddress;
    }

    public BlockchainContractInfo setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public BlockchainContractInfo setChainCode(String chainCode) {
        this.chainCode = chainCode;
        return this;
    }
    public String getChainCode() {
        return this.chainCode;
    }

    public BlockchainContractInfo setOracleContractAddress(String oracleContractAddress) {
        this.oracleContractAddress = oracleContractAddress;
        return this;
    }
    public String getOracleContractAddress() {
        return this.oracleContractAddress;
    }

    public BlockchainContractInfo setP2pContractAddress(String p2pContractAddress) {
        this.p2pContractAddress = p2pContractAddress;
        return this;
    }
    public String getP2pContractAddress() {
        return this.p2pContractAddress;
    }

    public BlockchainContractInfo setWasmAmContractAddress(String wasmAmContractAddress) {
        this.wasmAmContractAddress = wasmAmContractAddress;
        return this;
    }
    public String getWasmAmContractAddress() {
        return this.wasmAmContractAddress;
    }

    public BlockchainContractInfo setWasmOracleContractAddress(String wasmOracleContractAddress) {
        this.wasmOracleContractAddress = wasmOracleContractAddress;
        return this;
    }
    public String getWasmOracleContractAddress() {
        return this.wasmOracleContractAddress;
    }

    public BlockchainContractInfo setWasmP2pContractAddress(String wasmP2pContractAddress) {
        this.wasmP2pContractAddress = wasmP2pContractAddress;
        return this;
    }
    public String getWasmP2pContractAddress() {
        return this.wasmP2pContractAddress;
    }

}
