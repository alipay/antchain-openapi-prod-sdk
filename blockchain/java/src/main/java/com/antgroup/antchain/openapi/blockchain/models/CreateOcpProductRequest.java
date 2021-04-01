// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateOcpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟Id
    @NameInMap("baas_alliance")
    @Validation(required = true)
    public String baasAlliance;

    // 意义：链扩容字段，表示在默认空间大小基础上，新增空间大小，单位为G，默认值为0。
    // 仅链版本为企业版（enterpriseVer）时，才发挥作用。
    @NameInMap("baas_capacity")
    public String baasCapacity;

    // 区块链的名称
    @NameInMap("baas_name")
    @Validation(required = true)
    public String baasName;

    // 意义：链新增节点数，表示在默认4个节点基础上，新增节点数，单位为个，默认值为0。
    //  仅链版本为企业版（enterpriseVer）时，才发挥作用。
    @NameInMap("baas_node")
    public String baasNode;

    // 意义：Tee链标志，表示创建Tee区块链，默认值为false。 
    // 注意：仅链版本为企业版（enterpriseVer）时，才发挥作用。
    @NameInMap("baas_tee")
    public Boolean baasTee;

    // 基础版（basicVer）、企业版（enterpriseVer）
    @NameInMap("baas_ver")
    @Validation(required = true)
    public String baasVer;

    // 业务组详细码
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 业务组详细类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务组码
    @NameInMap("group_code")
    @Validation(required = true)
    public String groupCode;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static CreateOcpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOcpProductRequest self = new CreateOcpProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateOcpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOcpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateOcpProductRequest setBaasAlliance(String baasAlliance) {
        this.baasAlliance = baasAlliance;
        return this;
    }
    public String getBaasAlliance() {
        return this.baasAlliance;
    }

    public CreateOcpProductRequest setBaasCapacity(String baasCapacity) {
        this.baasCapacity = baasCapacity;
        return this;
    }
    public String getBaasCapacity() {
        return this.baasCapacity;
    }

    public CreateOcpProductRequest setBaasName(String baasName) {
        this.baasName = baasName;
        return this;
    }
    public String getBaasName() {
        return this.baasName;
    }

    public CreateOcpProductRequest setBaasNode(String baasNode) {
        this.baasNode = baasNode;
        return this;
    }
    public String getBaasNode() {
        return this.baasNode;
    }

    public CreateOcpProductRequest setBaasTee(Boolean baasTee) {
        this.baasTee = baasTee;
        return this;
    }
    public Boolean getBaasTee() {
        return this.baasTee;
    }

    public CreateOcpProductRequest setBaasVer(String baasVer) {
        this.baasVer = baasVer;
        return this;
    }
    public String getBaasVer() {
        return this.baasVer;
    }

    public CreateOcpProductRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateOcpProductRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateOcpProductRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public CreateOcpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
