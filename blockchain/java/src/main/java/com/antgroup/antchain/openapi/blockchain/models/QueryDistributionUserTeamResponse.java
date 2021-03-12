// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionUserTeamResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 一级会员信息
    @NameInMap("members")
    public java.util.List<DistributionUser> members;

    // 下级用户总数
    @NameInMap("member_num")
    public Long memberNum;

    // 一级会员数
    @NameInMap("one_level_member_num")
    public Long oneLevelMemberNum;

    // 分页查询当前页号
    @NameInMap("page_num")
    public Long pageNum;

    // 分页查询当前页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 二级会员数
    @NameInMap("two_level_member_num")
    public Long twoLevelMemberNum;

    public static QueryDistributionUserTeamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionUserTeamResponse self = new QueryDistributionUserTeamResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionUserTeamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionUserTeamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionUserTeamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionUserTeamResponse setMembers(java.util.List<DistributionUser> members) {
        this.members = members;
        return this;
    }
    public java.util.List<DistributionUser> getMembers() {
        return this.members;
    }

    public QueryDistributionUserTeamResponse setMemberNum(Long memberNum) {
        this.memberNum = memberNum;
        return this;
    }
    public Long getMemberNum() {
        return this.memberNum;
    }

    public QueryDistributionUserTeamResponse setOneLevelMemberNum(Long oneLevelMemberNum) {
        this.oneLevelMemberNum = oneLevelMemberNum;
        return this;
    }
    public Long getOneLevelMemberNum() {
        return this.oneLevelMemberNum;
    }

    public QueryDistributionUserTeamResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDistributionUserTeamResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionUserTeamResponse setTwoLevelMemberNum(Long twoLevelMemberNum) {
        this.twoLevelMemberNum = twoLevelMemberNum;
        return this;
    }
    public Long getTwoLevelMemberNum() {
        return this.twoLevelMemberNum;
    }

}
