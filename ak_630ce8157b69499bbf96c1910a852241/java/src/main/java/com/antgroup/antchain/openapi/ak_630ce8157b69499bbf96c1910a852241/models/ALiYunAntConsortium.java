// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class ALiYunAntConsortium extends TeaModel {
    // 链的数量
    @NameInMap("chain_num")
    public Long chainNum;

    // 联盟描述
    @NameInMap("consortium_description")
    public String consortiumDescription;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    // 联盟名称
    @NameInMap("consortium_name")
    public String consortiumName;

    // 时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 是否为空联盟
    @NameInMap("is_empty_consortium")
    public Boolean isEmptyConsortium;

    // 成员数量
    @NameInMap("member_num")
    public Long memberNum;

    // 角色
    @NameInMap("role")
    public String role;

    // 状态值
    @NameInMap("status")
    public String status;

    public static ALiYunAntConsortium build(java.util.Map<String, ?> map) throws Exception {
        ALiYunAntConsortium self = new ALiYunAntConsortium();
        return TeaModel.build(map, self);
    }

    public ALiYunAntConsortium setChainNum(Long chainNum) {
        this.chainNum = chainNum;
        return this;
    }
    public Long getChainNum() {
        return this.chainNum;
    }

    public ALiYunAntConsortium setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    public ALiYunAntConsortium setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ALiYunAntConsortium setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public ALiYunAntConsortium setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunAntConsortium setIsEmptyConsortium(Boolean isEmptyConsortium) {
        this.isEmptyConsortium = isEmptyConsortium;
        return this;
    }
    public Boolean getIsEmptyConsortium() {
        return this.isEmptyConsortium;
    }

    public ALiYunAntConsortium setMemberNum(Long memberNum) {
        this.memberNum = memberNum;
        return this;
    }
    public Long getMemberNum() {
        return this.memberNum;
    }

    public ALiYunAntConsortium setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ALiYunAntConsortium setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
