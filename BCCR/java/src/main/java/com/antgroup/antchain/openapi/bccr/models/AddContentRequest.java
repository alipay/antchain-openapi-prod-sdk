// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddContentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 内容标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 文件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 内容标签列表
    @NameInMap("keywords")
    public java.util.List<String> keywords;

    // 内容描述
    @NameInMap("description")
    public String description;

    // 内容封面文件id
    @NameInMap("cover_file_id")
    public String coverFileId;

    // 播放列表实体：包括名称和各种授权维权信息
    @NameInMap("play_list_entity")
    @Validation(required = true)
    public PlayListEntity playListEntity;

    // 客户端token，幂等号，用来保证并发请求幂等性
    @NameInMap("client_token")
    public String clientToken;

    public static AddContentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContentRequest self = new AddContentRequest();
        return TeaModel.build(map, self);
    }

    public AddContentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddContentRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddContentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AddContentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddContentRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public AddContentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddContentRequest setCoverFileId(String coverFileId) {
        this.coverFileId = coverFileId;
        return this;
    }
    public String getCoverFileId() {
        return this.coverFileId;
    }

    public AddContentRequest setPlayListEntity(PlayListEntity playListEntity) {
        this.playListEntity = playListEntity;
        return this;
    }
    public PlayListEntity getPlayListEntity() {
        return this.playListEntity;
    }

    public AddContentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
