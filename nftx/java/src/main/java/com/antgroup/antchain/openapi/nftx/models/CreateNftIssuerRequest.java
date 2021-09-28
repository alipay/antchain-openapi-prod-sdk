// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class CreateNftIssuerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户发行NFT的唯一编号
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // NFT商品的名称
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // NFT资产类型, 含IMAGE、VIDEO、FILE、AUDIO、THREE_DIMENSIONS等
    @NameInMap("sku_type")
    @Validation(required = true)
    public String skuType;

    // 铸造数量，100起
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // NFT创作者
    @NameInMap("author")
    @Validation(required = true)
    public String author;

    // 发行方名称
    @NameInMap("issuer_name")
    @Validation(required = true)
    public String issuerName;

    // NFT商品的描述
    @NameInMap("sku_descrption")
    @Validation(required = true)
    public String skuDescrption;

    // 跳转链接
    @NameInMap("jump_url")
    public String jumpUrl;

    // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，NFT_CUSTOMIZE（NFT定制）
    @NameInMap("biz_type")
    public String bizType;

    // 素材文件结构
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<File> files;

    public static CreateNftIssuerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNftIssuerRequest self = new CreateNftIssuerRequest();
        return TeaModel.build(map, self);
    }

    public CreateNftIssuerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNftIssuerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNftIssuerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateNftIssuerRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public CreateNftIssuerRequest setSkuType(String skuType) {
        this.skuType = skuType;
        return this;
    }
    public String getSkuType() {
        return this.skuType;
    }

    public CreateNftIssuerRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CreateNftIssuerRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public CreateNftIssuerRequest setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }
    public String getIssuerName() {
        return this.issuerName;
    }

    public CreateNftIssuerRequest setSkuDescrption(String skuDescrption) {
        this.skuDescrption = skuDescrption;
        return this;
    }
    public String getSkuDescrption() {
        return this.skuDescrption;
    }

    public CreateNftIssuerRequest setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public CreateNftIssuerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateNftIssuerRequest setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

}
