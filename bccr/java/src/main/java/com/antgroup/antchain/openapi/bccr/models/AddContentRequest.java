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

    // 播放列表名称
    @NameInMap("play_list_name")
    @Validation(required = true)
    public String playListName;

    // 授权类型
    @NameInMap("authorize_type")
    public String authorizeType;

    // 授权范围类型
    @NameInMap("authorize_scope_type")
    public String authorizeScopeType;

    // 维权类型
    @NameInMap("protect_rights_type")
    public String protectRightsType;

    // 维权范围类型
    @NameInMap("protect_rights_scope_type")
    public String protectRightsScopeType;

    // 内容授权开始日期
    @NameInMap("authorization_start_date")
    @Validation(required = true)
    public String authorizationStartDate;

    // 内容授权时长
    @NameInMap("authorization_time_length")
    @Validation(required = true)
    public Long authorizationTimeLength;

    // 内容授权平台列表
    @NameInMap("auth_platform")
    public java.util.List<String> authPlatform;

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

    public AddContentRequest setPlayListName(String playListName) {
        this.playListName = playListName;
        return this;
    }
    public String getPlayListName() {
        return this.playListName;
    }

    public AddContentRequest setAuthorizeType(String authorizeType) {
        this.authorizeType = authorizeType;
        return this;
    }
    public String getAuthorizeType() {
        return this.authorizeType;
    }

    public AddContentRequest setAuthorizeScopeType(String authorizeScopeType) {
        this.authorizeScopeType = authorizeScopeType;
        return this;
    }
    public String getAuthorizeScopeType() {
        return this.authorizeScopeType;
    }

    public AddContentRequest setProtectRightsType(String protectRightsType) {
        this.protectRightsType = protectRightsType;
        return this;
    }
    public String getProtectRightsType() {
        return this.protectRightsType;
    }

    public AddContentRequest setProtectRightsScopeType(String protectRightsScopeType) {
        this.protectRightsScopeType = protectRightsScopeType;
        return this;
    }
    public String getProtectRightsScopeType() {
        return this.protectRightsScopeType;
    }

    public AddContentRequest setAuthorizationStartDate(String authorizationStartDate) {
        this.authorizationStartDate = authorizationStartDate;
        return this;
    }
    public String getAuthorizationStartDate() {
        return this.authorizationStartDate;
    }

    public AddContentRequest setAuthorizationTimeLength(Long authorizationTimeLength) {
        this.authorizationTimeLength = authorizationTimeLength;
        return this;
    }
    public Long getAuthorizationTimeLength() {
        return this.authorizationTimeLength;
    }

    public AddContentRequest setAuthPlatform(java.util.List<String> authPlatform) {
        this.authPlatform = authPlatform;
        return this;
    }
    public java.util.List<String> getAuthPlatform() {
        return this.authPlatform;
    }

    public AddContentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
