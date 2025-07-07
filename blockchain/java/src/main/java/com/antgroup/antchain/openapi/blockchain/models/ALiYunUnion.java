// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunUnion extends TeaModel {
    // 联盟内链的集合
    /**
     * <strong>example:</strong>
     * <p>联盟内链的集合</p>
     */
    @NameInMap("ant_chains")
    public java.util.List<ALiYunAntChain> antChains;

    // 联盟信息
    /**
     * <strong>example:</strong>
     * <p>联盟信息</p>
     */
    @NameInMap("ant_consortiums")
    public java.util.List<ALiYunAntConsortium> antConsortiums;

    // 联盟Id
    /**
     * <strong>example:</strong>
     * <p>联盟Id</p>
     */
    @NameInMap("consortium_id")
    public String consortiumId;

    // 联盟成员信息
    /**
     * <strong>example:</strong>
     * <p>联盟成员信息</p>
     */
    @NameInMap("members")
    public java.util.List<ALiYunMember> members;

    // 阿里云分页属性
    /**
     * <strong>example:</strong>
     * <p>阿里云分页属性</p>
     */
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // is_exist
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_exist")
    public Boolean isExist;

    public static ALiYunUnion build(java.util.Map<String, ?> map) throws Exception {
        ALiYunUnion self = new ALiYunUnion();
        return TeaModel.build(map, self);
    }

    public ALiYunUnion setAntChains(java.util.List<ALiYunAntChain> antChains) {
        this.antChains = antChains;
        return this;
    }
    public java.util.List<ALiYunAntChain> getAntChains() {
        return this.antChains;
    }

    public ALiYunUnion setAntConsortiums(java.util.List<ALiYunAntConsortium> antConsortiums) {
        this.antConsortiums = antConsortiums;
        return this;
    }
    public java.util.List<ALiYunAntConsortium> getAntConsortiums() {
        return this.antConsortiums;
    }

    public ALiYunUnion setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ALiYunUnion setMembers(java.util.List<ALiYunMember> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ALiYunMember> getMembers() {
        return this.members;
    }

    public ALiYunUnion setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

    public ALiYunUnion setIsExist(Boolean isExist) {
        this.isExist = isExist;
        return this;
    }
    public Boolean getIsExist() {
        return this.isExist;
    }

}
