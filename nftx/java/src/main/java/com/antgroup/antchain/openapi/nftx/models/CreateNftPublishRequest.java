// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class CreateNftPublishRequest extends TeaModel {
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

    // NFT资产类型, 含IMAGE(图片)、VIDEO(视频)、AUDIO(音频)、THREE_DIMENSIONS(3D模型)等
    @NameInMap("sku_type")
    @Validation(required = true)
    public String skuType;

    // 铸造数量，至少为1
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // NFT创作者。中文或手机号和author_type对应
    @NameInMap("author")
    @Validation(required = true)
    public String author;

    // 创作者类型。手机号或中文类型，和author对应
    @NameInMap("author_type")
    @Validation(required = true)
    public String authorType;

    // 发行方名称
    @NameInMap("issuer_name")
    @Validation(required = true)
    public String issuerName;

    // NFT商品的描述
    @NameInMap("sku_descrption")
    @Validation(required = true)
    public String skuDescrption;

    // 监制方。中文名或手机号，和producer_type对应
    @NameInMap("producer")
    @Validation(required = true)
    public String producer;

    // 监制方类型。手机号或中文类型，和producer对应
    @NameInMap("producer_type")
    @Validation(required = true)
    public String producerType;

    // 跳转链接
    @NameInMap("jump_url")
    public String jumpUrl;

    // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，
    @NameInMap("biz_type")
    public String bizType;

    // 渠道租户
    @NameInMap("channel_tenant")
    @Validation(required = true)
    public String channelTenant;

    // 素材文件结构
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<File> files;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static CreateNftPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNftPublishRequest self = new CreateNftPublishRequest();
        return TeaModel.build(map, self);
    }

    public CreateNftPublishRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNftPublishRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNftPublishRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateNftPublishRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public CreateNftPublishRequest setSkuType(String skuType) {
        this.skuType = skuType;
        return this;
    }
    public String getSkuType() {
        return this.skuType;
    }

    public CreateNftPublishRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CreateNftPublishRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public CreateNftPublishRequest setAuthorType(String authorType) {
        this.authorType = authorType;
        return this;
    }
    public String getAuthorType() {
        return this.authorType;
    }

    public CreateNftPublishRequest setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }
    public String getIssuerName() {
        return this.issuerName;
    }

    public CreateNftPublishRequest setSkuDescrption(String skuDescrption) {
        this.skuDescrption = skuDescrption;
        return this;
    }
    public String getSkuDescrption() {
        return this.skuDescrption;
    }

    public CreateNftPublishRequest setProducer(String producer) {
        this.producer = producer;
        return this;
    }
    public String getProducer() {
        return this.producer;
    }

    public CreateNftPublishRequest setProducerType(String producerType) {
        this.producerType = producerType;
        return this;
    }
    public String getProducerType() {
        return this.producerType;
    }

    public CreateNftPublishRequest setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public CreateNftPublishRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateNftPublishRequest setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

    public CreateNftPublishRequest setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public CreateNftPublishRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
