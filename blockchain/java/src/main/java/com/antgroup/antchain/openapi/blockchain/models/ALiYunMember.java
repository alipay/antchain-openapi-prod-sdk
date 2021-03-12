// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunMember extends TeaModel {
    // 加入时间
    @NameInMap("join_time")
    public Long joinTime;

    // 成员id
    @NameInMap("member_id")
    public String memberId;

    // 成员名称
    @NameInMap("member_name")
    public String memberName;

    // 角色
    @NameInMap("role")
    public String role;

    // 状态
    @NameInMap("status")
    public String status;

    public static ALiYunMember build(java.util.Map<String, ?> map) throws Exception {
        ALiYunMember self = new ALiYunMember();
        return TeaModel.build(map, self);
    }

    public ALiYunMember setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
        return this;
    }
    public Long getJoinTime() {
        return this.joinTime;
    }

    public ALiYunMember setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ALiYunMember setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public ALiYunMember setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ALiYunMember setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
