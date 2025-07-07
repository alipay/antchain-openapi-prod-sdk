// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainSubnetCheck extends TeaModel {
    // 检查结果
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("check_result")
    public String checkResult;

    // 子链成员列表
    @NameInMap("consortium_member_list")
    public java.util.List<String> consortiumMemberList;

    // 节点信息列表
    @NameInMap("chain_node_info_list")
    public java.util.List<ALiYunChainNodeInfo> chainNodeInfoList;

    // 联盟管理员
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("consortium_admin")
    public Boolean consortiumAdmin;

    // 子链成员列表
    @NameInMap("consortium_member_info_list")
    public java.util.List<ALiYunMember> consortiumMemberInfoList;

    // 分页信息
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    public static ALiYunChainSubnetCheck build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainSubnetCheck self = new ALiYunChainSubnetCheck();
        return TeaModel.build(map, self);
    }

    public ALiYunChainSubnetCheck setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public ALiYunChainSubnetCheck setConsortiumMemberList(java.util.List<String> consortiumMemberList) {
        this.consortiumMemberList = consortiumMemberList;
        return this;
    }
    public java.util.List<String> getConsortiumMemberList() {
        return this.consortiumMemberList;
    }

    public ALiYunChainSubnetCheck setChainNodeInfoList(java.util.List<ALiYunChainNodeInfo> chainNodeInfoList) {
        this.chainNodeInfoList = chainNodeInfoList;
        return this;
    }
    public java.util.List<ALiYunChainNodeInfo> getChainNodeInfoList() {
        return this.chainNodeInfoList;
    }

    public ALiYunChainSubnetCheck setConsortiumAdmin(Boolean consortiumAdmin) {
        this.consortiumAdmin = consortiumAdmin;
        return this;
    }
    public Boolean getConsortiumAdmin() {
        return this.consortiumAdmin;
    }

    public ALiYunChainSubnetCheck setConsortiumMemberInfoList(java.util.List<ALiYunMember> consortiumMemberInfoList) {
        this.consortiumMemberInfoList = consortiumMemberInfoList;
        return this;
    }
    public java.util.List<ALiYunMember> getConsortiumMemberInfoList() {
        return this.consortiumMemberInfoList;
    }

    public ALiYunChainSubnetCheck setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

}
