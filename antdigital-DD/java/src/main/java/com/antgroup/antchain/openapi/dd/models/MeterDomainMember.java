// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class MeterDomainMember extends TeaModel {
    // 角色
    /**
     * <strong>example:</strong>
     * <p>develooper</p>
     */
    @NameInMap("role")
    public String role;

    // 成员id
    /**
     * <strong>example:</strong>
     * <p>workNo</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 成员昵称
    /**
     * <strong>example:</strong>
     * <p>成员昵称</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    // 成员姓名
    /**
     * <strong>example:</strong>
     * <p>成员姓名</p>
     */
    @NameInMap("name")
    public String name;

    public static MeterDomainMember build(java.util.Map<String, ?> map) throws Exception {
        MeterDomainMember self = new MeterDomainMember();
        return TeaModel.build(map, self);
    }

    public MeterDomainMember setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public MeterDomainMember setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MeterDomainMember setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public MeterDomainMember setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
