// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractIdeConfig extends TeaModel {
    // 合约链的一个已创建的测试账户
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 区块链唯一标识
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 合约链的名字
    @NameInMap("chain_name")
    @Validation(required = true)
    public String chainName;

    // 目标合约链的host地址
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    // 说明是否开启wasm合约功能
    @NameInMap("is_wasm")
    public Boolean isWasm;

    // 目标合约链服务公开的端口号
    @NameInMap("port")
    @Validation(required = true)
    public String port;

    // 合约链已创建的测试账户的密钥
    @NameInMap("private_key")
    @Validation(required = true)
    public String privateKey;

    // 如果是TEE硬件隐私合约链，会包含此字段内容
    @NameInMap("rsa_public_key")
    public String rsaPublicKey;

    // 合约链的版本说明
    @NameInMap("version")
    public String version;

    public static ContractIdeConfig build(java.util.Map<String, ?> map) throws Exception {
        ContractIdeConfig self = new ContractIdeConfig();
        return TeaModel.build(map, self);
    }

    public ContractIdeConfig setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ContractIdeConfig setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ContractIdeConfig setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public ContractIdeConfig setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ContractIdeConfig setIsWasm(Boolean isWasm) {
        this.isWasm = isWasm;
        return this;
    }
    public Boolean getIsWasm() {
        return this.isWasm;
    }

    public ContractIdeConfig setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ContractIdeConfig setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ContractIdeConfig setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
        return this;
    }
    public String getRsaPublicKey() {
        return this.rsaPublicKey;
    }

    public ContractIdeConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
