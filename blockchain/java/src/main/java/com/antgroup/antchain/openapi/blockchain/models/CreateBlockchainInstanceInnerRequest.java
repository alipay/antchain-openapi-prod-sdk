// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBlockchainInstanceInnerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链名称
    @NameInMap("blockchain_name")
    @Validation(required = true)
    public String blockchainName;

    // 链打标内容
    @NameInMap("blockchain_tag")
    public String blockchainTag;

    // Tee链/企业版/企业版  enterprise
    @NameInMap("blockchain_type")
    @Validation(required = true)
    public String blockchainType;

    // 待创建联盟的信息
    @NameInMap("create_union_info")
    public BaasUnionInfo createUnionInfo;

    // 节点数
    @NameInMap("node_number")
    @Validation(required = true)
    public Long nodeNumber;

    // 联盟id
    @NameInMap("union_id")
    public Long unionId;

    // 业务线code
    @NameInMap("group_code")
    @Validation(required = true)
    public String groupCode;

    // 业务线子码
    @NameInMap("group_sub_code")
    @Validation(required = true)
    public String groupSubCode;

    // 是否需要创建测试链
    @NameInMap("test_chain")
    @Validation(required = true)
    public Boolean testChain;

    public static CreateBlockchainInstanceInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainInstanceInnerRequest self = new CreateBlockchainInstanceInnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainInstanceInnerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainInstanceInnerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainInstanceInnerRequest setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public CreateBlockchainInstanceInnerRequest setBlockchainTag(String blockchainTag) {
        this.blockchainTag = blockchainTag;
        return this;
    }
    public String getBlockchainTag() {
        return this.blockchainTag;
    }

    public CreateBlockchainInstanceInnerRequest setBlockchainType(String blockchainType) {
        this.blockchainType = blockchainType;
        return this;
    }
    public String getBlockchainType() {
        return this.blockchainType;
    }

    public CreateBlockchainInstanceInnerRequest setCreateUnionInfo(BaasUnionInfo createUnionInfo) {
        this.createUnionInfo = createUnionInfo;
        return this;
    }
    public BaasUnionInfo getCreateUnionInfo() {
        return this.createUnionInfo;
    }

    public CreateBlockchainInstanceInnerRequest setNodeNumber(Long nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Long getNodeNumber() {
        return this.nodeNumber;
    }

    public CreateBlockchainInstanceInnerRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CreateBlockchainInstanceInnerRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public CreateBlockchainInstanceInnerRequest setGroupSubCode(String groupSubCode) {
        this.groupSubCode = groupSubCode;
        return this;
    }
    public String getGroupSubCode() {
        return this.groupSubCode;
    }

    public CreateBlockchainInstanceInnerRequest setTestChain(Boolean testChain) {
        this.testChain = testChain;
        return this;
    }
    public Boolean getTestChain() {
        return this.testChain;
    }

}
