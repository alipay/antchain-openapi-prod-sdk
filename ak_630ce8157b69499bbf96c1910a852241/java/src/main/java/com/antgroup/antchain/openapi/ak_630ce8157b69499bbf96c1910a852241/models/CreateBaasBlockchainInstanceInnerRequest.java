// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class CreateBaasBlockchainInstanceInnerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    public static CreateBaasBlockchainInstanceInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasBlockchainInstanceInnerRequest self = new CreateBaasBlockchainInstanceInnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasBlockchainInstanceInnerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasBlockchainInstanceInnerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasBlockchainInstanceInnerRequest setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public CreateBaasBlockchainInstanceInnerRequest setBlockchainTag(String blockchainTag) {
        this.blockchainTag = blockchainTag;
        return this;
    }
    public String getBlockchainTag() {
        return this.blockchainTag;
    }

    public CreateBaasBlockchainInstanceInnerRequest setBlockchainType(String blockchainType) {
        this.blockchainType = blockchainType;
        return this;
    }
    public String getBlockchainType() {
        return this.blockchainType;
    }

    public CreateBaasBlockchainInstanceInnerRequest setCreateUnionInfo(BaasUnionInfo createUnionInfo) {
        this.createUnionInfo = createUnionInfo;
        return this;
    }
    public BaasUnionInfo getCreateUnionInfo() {
        return this.createUnionInfo;
    }

    public CreateBaasBlockchainInstanceInnerRequest setNodeNumber(Long nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Long getNodeNumber() {
        return this.nodeNumber;
    }

    public CreateBaasBlockchainInstanceInnerRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CreateBaasBlockchainInstanceInnerRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public CreateBaasBlockchainInstanceInnerRequest setGroupSubCode(String groupSubCode) {
        this.groupSubCode = groupSubCode;
        return this;
    }
    public String getGroupSubCode() {
        return this.groupSubCode;
    }

    public CreateBaasBlockchainInstanceInnerRequest setTestChain(Boolean testChain) {
        this.testChain = testChain;
        return this;
    }
    public Boolean getTestChain() {
        return this.testChain;
    }

}
