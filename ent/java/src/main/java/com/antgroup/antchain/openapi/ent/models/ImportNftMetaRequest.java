// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ImportNftMetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 在外部渠道的全局唯一id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // nft资产标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 缩略图OSS文件名
    @NameInMap("mini_image_url")
    @Validation(required = true)
    public String miniImageUrl;

    // 原图地址
    @NameInMap("origin_image_url")
    @Validation(required = true)
    public String originImageUrl;

    // 创作者
    @NameInMap("author")
    @Validation(required = true)
    public String author;

    // 作品简介信息文字描述
    @NameInMap("description")
    public String description;

    // 商品详情页url
    @NameInMap("item_url")
    @Validation(required = true)
    public String itemUrl;

    // 资产发行时间
    @NameInMap("publish_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String publishTime;

    public static ImportNftMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNftMetaRequest self = new ImportNftMetaRequest();
        return TeaModel.build(map, self);
    }

    public ImportNftMetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportNftMetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportNftMetaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ImportNftMetaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ImportNftMetaRequest setMiniImageUrl(String miniImageUrl) {
        this.miniImageUrl = miniImageUrl;
        return this;
    }
    public String getMiniImageUrl() {
        return this.miniImageUrl;
    }

    public ImportNftMetaRequest setOriginImageUrl(String originImageUrl) {
        this.originImageUrl = originImageUrl;
        return this;
    }
    public String getOriginImageUrl() {
        return this.originImageUrl;
    }

    public ImportNftMetaRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public ImportNftMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportNftMetaRequest setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
        return this;
    }
    public String getItemUrl() {
        return this.itemUrl;
    }

    public ImportNftMetaRequest setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

}
