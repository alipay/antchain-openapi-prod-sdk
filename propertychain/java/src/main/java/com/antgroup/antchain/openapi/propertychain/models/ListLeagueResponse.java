// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListLeagueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 联盟详情列表
    @NameInMap("league_info_list")
    public java.util.List<LeagueInfo> leagueInfoList;

    public static ListLeagueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLeagueResponse self = new ListLeagueResponse();
        return TeaModel.build(map, self);
    }

    public ListLeagueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLeagueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLeagueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLeagueResponse setLeagueInfoList(java.util.List<LeagueInfo> leagueInfoList) {
        this.leagueInfoList = leagueInfoList;
        return this;
    }
    public java.util.List<LeagueInfo> getLeagueInfoList() {
        return this.leagueInfoList;
    }

}
