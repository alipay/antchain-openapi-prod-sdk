// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListLeagueApplyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请类型【NONE,JOIN,CREATE,ALL】
    @NameInMap("apply_type")
    public String applyType;

    // 申请内容
    @NameInMap("league_apply_info_list")
    public java.util.List<LeagueApplyInfo> leagueApplyInfoList;

    // 总条目
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static ListLeagueApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLeagueApplyResponse self = new ListLeagueApplyResponse();
        return TeaModel.build(map, self);
    }

    public ListLeagueApplyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLeagueApplyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLeagueApplyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLeagueApplyResponse setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public ListLeagueApplyResponse setLeagueApplyInfoList(java.util.List<LeagueApplyInfo> leagueApplyInfoList) {
        this.leagueApplyInfoList = leagueApplyInfoList;
        return this;
    }
    public java.util.List<LeagueApplyInfo> getLeagueApplyInfoList() {
        return this.leagueApplyInfoList;
    }

    public ListLeagueApplyResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListLeagueApplyResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
