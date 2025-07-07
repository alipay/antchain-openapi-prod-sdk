// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractIdeConfig extends TeaModel {
    // 合约链的一个已创建的测试账户
    /**
     * <strong>example:</strong>
     * <p>Tester001</p>
     */
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 区块链唯一标识
    /**
     * <strong>example:</strong>
     * <p>0001bcde</p>
     */
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 合约链的名字
    /**
     * <strong>example:</strong>
     * <p>合约体验链</p>
     */
    @NameInMap("chain_name")
    @Validation(required = true)
    public String chainName;

    // 目标合约链的host地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://127.0.0.1">https://127.0.0.1</a></p>
     */
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    // 说明是否开启wasm合约功能
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_wasm")
    public Boolean isWasm;

    // 目标合约链服务公开的端口号
    /**
     * <strong>example:</strong>
     * <p>18131</p>
     */
    @NameInMap("port")
    @Validation(required = true)
    public String port;

    // 合约链已创建的测试账户的密钥
    /**
     * <strong>example:</strong>
     * <p>c8d6079a1ea7e5dba407998fecd89ac0783295c7e1a84d44e304b5314c765e73</p>
     */
    @NameInMap("private_key")
    @Validation(required = true)
    public String privateKey;

    // 如果是TEE硬件隐私合约链，会包含此字段内容
    /**
     * <strong>example:</strong>
     * <p>-----BEGIN PUBLIC KEY----- &lt;RSA公钥&gt; -----END PUBLIC KEY-----</p>
     */
    @NameInMap("rsa_public_key")
    public String rsaPublicKey;

    // 合约链的版本说明
    /**
     * <strong>example:</strong>
     * <p>2.7</p>
     */
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
