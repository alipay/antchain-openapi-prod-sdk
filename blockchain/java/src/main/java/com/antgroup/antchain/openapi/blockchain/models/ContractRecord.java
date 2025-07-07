// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractRecord extends TeaModel {
    // abi对应oss key
    /**
     * <strong>example:</strong>
     * <p>abi-oss-key</p>
     */
    @NameInMap("abi_oss_key")
    @Validation(required = true)
    public String abiOssKey;

    // abi oss 地址
    /**
     * <strong>example:</strong>
     * <p>abi-oss-url</p>
     */
    @NameInMap("abi_oss_url")
    public String abiOssUrl;

    // 区块链唯一标识
    /**
     * <strong>example:</strong>
     * <p>0001bcde</p>
     */
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 区块链名称
    /**
     * <strong>example:</strong>
     * <p>合约体验链</p>
     */
    @NameInMap("blockchain_name")
    @Validation(required = true)
    public String blockchainName;

    // bytecode对应oss key
    /**
     * <strong>example:</strong>
     * <p>bytecode-oss-key</p>
     */
    @NameInMap("bytecode_oss_key")
    @Validation(required = true)
    public String bytecodeOssKey;

    // bytecode oss 地址
    /**
     * <strong>example:</strong>
     * <p>bytecode-oss-url</p>
     */
    @NameInMap("bytecode_oss_url")
    public String bytecodeOssUrl;

    // 16进制表示的合约identity
    /**
     * <strong>example:</strong>
     * <p>e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b</p>
     */
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
    /**
     * <strong>example:</strong>
     * <p>instance-name</p>
     */
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 合约名称
    /**
     * <strong>example:</strong>
     * <p>contract-name</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 发布状态，1未发布，3已发布
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("publish")
    @Validation(required = true)
    public Long publish;

    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>e93372533f323b2f12783aa3a586135cf421486439c2cdcde47411b78f9839ec</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // solidity|cpp|go
    /**
     * <strong>example:</strong>
     * <p>solidity</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ContractRecord build(java.util.Map<String, ?> map) throws Exception {
        ContractRecord self = new ContractRecord();
        return TeaModel.build(map, self);
    }

    public ContractRecord setAbiOssKey(String abiOssKey) {
        this.abiOssKey = abiOssKey;
        return this;
    }
    public String getAbiOssKey() {
        return this.abiOssKey;
    }

    public ContractRecord setAbiOssUrl(String abiOssUrl) {
        this.abiOssUrl = abiOssUrl;
        return this;
    }
    public String getAbiOssUrl() {
        return this.abiOssUrl;
    }

    public ContractRecord setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ContractRecord setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public ContractRecord setBytecodeOssKey(String bytecodeOssKey) {
        this.bytecodeOssKey = bytecodeOssKey;
        return this;
    }
    public String getBytecodeOssKey() {
        return this.bytecodeOssKey;
    }

    public ContractRecord setBytecodeOssUrl(String bytecodeOssUrl) {
        this.bytecodeOssUrl = bytecodeOssUrl;
        return this;
    }
    public String getBytecodeOssUrl() {
        return this.bytecodeOssUrl;
    }

    public ContractRecord setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public ContractRecord setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ContractRecord setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractRecord setPublish(Long publish) {
        this.publish = publish;
        return this;
    }
    public Long getPublish() {
        return this.publish;
    }

    public ContractRecord setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractRecord setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
