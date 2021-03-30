// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class GetLeagueAccountinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户信息
    @NameInMap("role")
    public AssetChainUser role;

    public static GetLeagueAccountinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLeagueAccountinfoResponse self = new GetLeagueAccountinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLeagueAccountinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLeagueAccountinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLeagueAccountinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLeagueAccountinfoResponse setRole(AssetChainUser role) {
        this.role = role;
        return this;
    }
    public AssetChainUser getRole() {
        return this.role;
    }

}
