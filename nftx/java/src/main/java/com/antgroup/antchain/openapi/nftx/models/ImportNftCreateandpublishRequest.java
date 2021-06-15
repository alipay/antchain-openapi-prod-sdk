// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class ImportNftCreateandpublishRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对端自己的项目id；用作幂等字段
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // NFT艺术品的名称
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // IMAGE("IMAGE","图片"),
    // VIDEO("VIDEO","视频"),
    // ;
    @NameInMap("sku_type")
    @Validation(required = true)
    public String skuType;

    // 发行数量
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // 是否支持C2C流转：true是可流转，false是不可流转；
    @NameInMap("enable_c2c")
    @Validation(required = true)
    public Boolean enableC2c;

    // 艺术品作者
    @NameInMap("author")
    @Validation(required = true)
    public String author;

    // 艺术品拥有者
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 艺术品创作时间
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
    @NameInMap("biz_type")
    public String bizType;

    // nft简介信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 跳转链接
    @NameInMap("jump_url")
    public String jumpUrl;

    // nft发行的艺术品文件
    @NameInMap("files")
    @Validation(required = true)
    public File files;

    public static ImportNftCreateandpublishRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNftCreateandpublishRequest self = new ImportNftCreateandpublishRequest();
        return TeaModel.build(map, self);
    }

    public ImportNftCreateandpublishRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportNftCreateandpublishRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportNftCreateandpublishRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ImportNftCreateandpublishRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public ImportNftCreateandpublishRequest setSkuType(String skuType) {
        this.skuType = skuType;
        return this;
    }
    public String getSkuType() {
        return this.skuType;
    }

    public ImportNftCreateandpublishRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public ImportNftCreateandpublishRequest setEnableC2c(Boolean enableC2c) {
        this.enableC2c = enableC2c;
        return this;
    }
    public Boolean getEnableC2c() {
        return this.enableC2c;
    }

    public ImportNftCreateandpublishRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public ImportNftCreateandpublishRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ImportNftCreateandpublishRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ImportNftCreateandpublishRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ImportNftCreateandpublishRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportNftCreateandpublishRequest setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public ImportNftCreateandpublishRequest setFiles(File files) {
        this.files = files;
        return this;
    }
    public File getFiles() {
        return this.files;
    }

}
