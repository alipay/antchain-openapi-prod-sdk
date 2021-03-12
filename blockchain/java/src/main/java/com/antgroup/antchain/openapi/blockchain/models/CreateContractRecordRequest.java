// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateContractRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // abi对应oss key
    @NameInMap("abi_oss_key")
    @Validation(required = true)
    public String abiOssKey;

    // 区块链唯一标识
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // bytecode对应oss key
    @NameInMap("bytecode_oss_key")
    @Validation(required = true)
    public String bytecodeOssKey;

    // 16进制表示的合约identity
    @NameInMap("identity")
    @Validation(required = true, maxLength = 64, minLength = 64)
    public String identity;

    // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 合约名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 交易hash
    @NameInMap("tx_hash")
    @Validation(required = true, maxLength = 64, minLength = 64)
    public String txHash;

    // solidity|cpp|go
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CreateContractRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractRecordRequest self = new CreateContractRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractRecordRequest setAbiOssKey(String abiOssKey) {
        this.abiOssKey = abiOssKey;
        return this;
    }
    public String getAbiOssKey() {
        return this.abiOssKey;
    }

    public CreateContractRecordRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateContractRecordRequest setBytecodeOssKey(String bytecodeOssKey) {
        this.bytecodeOssKey = bytecodeOssKey;
        return this;
    }
    public String getBytecodeOssKey() {
        return this.bytecodeOssKey;
    }

    public CreateContractRecordRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateContractRecordRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateContractRecordRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContractRecordRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public CreateContractRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
