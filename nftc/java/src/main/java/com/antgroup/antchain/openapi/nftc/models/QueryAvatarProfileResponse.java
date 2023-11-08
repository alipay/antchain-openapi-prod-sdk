// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryAvatarProfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数字人整体形象数据
    @NameInMap("avatar_info")
    public AvatarDTO avatarInfo;

    public static QueryAvatarProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarProfileResponse self = new QueryAvatarProfileResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvatarProfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAvatarProfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAvatarProfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAvatarProfileResponse setAvatarInfo(AvatarDTO avatarInfo) {
        this.avatarInfo = avatarInfo;
        return this;
    }
    public AvatarDTO getAvatarInfo() {
        return this.avatarInfo;
    }

}
