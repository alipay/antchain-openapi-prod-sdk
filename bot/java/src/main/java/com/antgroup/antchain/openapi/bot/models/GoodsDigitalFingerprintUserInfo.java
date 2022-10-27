// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintUserInfo extends TeaModel {
    // 平台注册用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户角色
    @NameInMap("user_role")
    @Validation(required = true)
    public String userRole;

    // 用户登录id来源
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 作为平台使用方，提供对应的渠道用户id列表
    @NameInMap("relation_user_id_list")
    public java.util.List<String> relationUserIdList;

    public static GoodsDigitalFingerprintUserInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintUserInfo self = new GoodsDigitalFingerprintUserInfo();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GoodsDigitalFingerprintUserInfo setUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }
    public String getUserRole() {
        return this.userRole;
    }

    public GoodsDigitalFingerprintUserInfo setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GoodsDigitalFingerprintUserInfo setRelationUserIdList(java.util.List<String> relationUserIdList) {
        this.relationUserIdList = relationUserIdList;
        return this;
    }
    public java.util.List<String> getRelationUserIdList() {
        return this.relationUserIdList;
    }

}
