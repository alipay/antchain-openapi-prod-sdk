// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class PlayListEntity extends TeaModel {
    // 播放列表名称，可包含多个视频
    /**
     * <strong>example:</strong>
     * <p>播放列表1</p>
     */
    @NameInMap("play_list_name")
    @Validation(required = true)
    public String playListName;

    // 表示授权类型，仅支持EXCLUSIVE，表示独家
    // 默认EXCLUSIVE
    /**
     * <strong>example:</strong>
     * <p>EXCLUSIVE</p>
     */
    @NameInMap("authorize_type")
    public String authorizeType;

    // 授权类型范围，仅支持OVERSEA，表示全海外
    // 默认OVERSEA
    /**
     * <strong>example:</strong>
     * <p>OVERSEA</p>
     */
    @NameInMap("authorize_scope_type")
    public String authorizeScopeType;

    // 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
    // 默认CONTAIN_PROTECT
    /**
     * <strong>example:</strong>
     * <p>CONTAIN_PROTECT</p>
     */
    @NameInMap("protect_rights_type")
    public String protectRightsType;

    // 维权类型范围，仅支持OVERSEA，表示全海外
    // 默认OVERSEA
    /**
     * <strong>example:</strong>
     * <p>OVERSEA</p>
     */
    @NameInMap("protect_rights_scope_type")
    public String protectRightsScopeType;

    // 内容授权开始日期yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2022-09-01</p>
     */
    @NameInMap("authorization_start_date")
    @Validation(required = true)
    public String authorizationStartDate;

    // 内容授权时长,单位：年，目前支持1~3年，
    // 注意结束时间即开始时间 + 授权时长 不能早于当前时间
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("authorization_time_length")
    @Validation(required = true)
    public Long authorizationTimeLength;

    // 内容授权平台列表：
    //        默认授权平台都会进行运营，当前仅支持YOUTUBE
    /**
     * <strong>example:</strong>
     * <p>YOUTUBE</p>
     */
    @NameInMap("auth_platform")
    public java.util.List<String> authPlatform;

    public static PlayListEntity build(java.util.Map<String, ?> map) throws Exception {
        PlayListEntity self = new PlayListEntity();
        return TeaModel.build(map, self);
    }

    public PlayListEntity setPlayListName(String playListName) {
        this.playListName = playListName;
        return this;
    }
    public String getPlayListName() {
        return this.playListName;
    }

    public PlayListEntity setAuthorizeType(String authorizeType) {
        this.authorizeType = authorizeType;
        return this;
    }
    public String getAuthorizeType() {
        return this.authorizeType;
    }

    public PlayListEntity setAuthorizeScopeType(String authorizeScopeType) {
        this.authorizeScopeType = authorizeScopeType;
        return this;
    }
    public String getAuthorizeScopeType() {
        return this.authorizeScopeType;
    }

    public PlayListEntity setProtectRightsType(String protectRightsType) {
        this.protectRightsType = protectRightsType;
        return this;
    }
    public String getProtectRightsType() {
        return this.protectRightsType;
    }

    public PlayListEntity setProtectRightsScopeType(String protectRightsScopeType) {
        this.protectRightsScopeType = protectRightsScopeType;
        return this;
    }
    public String getProtectRightsScopeType() {
        return this.protectRightsScopeType;
    }

    public PlayListEntity setAuthorizationStartDate(String authorizationStartDate) {
        this.authorizationStartDate = authorizationStartDate;
        return this;
    }
    public String getAuthorizationStartDate() {
        return this.authorizationStartDate;
    }

    public PlayListEntity setAuthorizationTimeLength(Long authorizationTimeLength) {
        this.authorizationTimeLength = authorizationTimeLength;
        return this;
    }
    public Long getAuthorizationTimeLength() {
        return this.authorizationTimeLength;
    }

    public PlayListEntity setAuthPlatform(java.util.List<String> authPlatform) {
        this.authPlatform = authPlatform;
        return this;
    }
    public java.util.List<String> getAuthPlatform() {
        return this.authPlatform;
    }

}
