// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateContractRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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
    @Validation(required = true)
    public String identity;

    public static UpdateContractRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContractRecordRequest self = new UpdateContractRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContractRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContractRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateContractRecordRequest setAbiOssKey(String abiOssKey) {
        this.abiOssKey = abiOssKey;
        return this;
    }
    public String getAbiOssKey() {
        return this.abiOssKey;
    }

    public UpdateContractRecordRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public UpdateContractRecordRequest setBytecodeOssKey(String bytecodeOssKey) {
        this.bytecodeOssKey = bytecodeOssKey;
        return this;
    }
    public String getBytecodeOssKey() {
        return this.bytecodeOssKey;
    }

    public UpdateContractRecordRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
