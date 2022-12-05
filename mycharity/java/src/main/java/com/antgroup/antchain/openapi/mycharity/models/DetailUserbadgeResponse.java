// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class DetailUserbadgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户徽章详情
    @NameInMap("user_badge_vo")
    public UserBadgeVO userBadgeVo;

    public static DetailUserbadgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailUserbadgeResponse self = new DetailUserbadgeResponse();
        return TeaModel.build(map, self);
    }

    public DetailUserbadgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailUserbadgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailUserbadgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailUserbadgeResponse setUserBadgeVo(UserBadgeVO userBadgeVo) {
        this.userBadgeVo = userBadgeVo;
        return this;
    }
    public UserBadgeVO getUserBadgeVo() {
        return this.userBadgeVo;
    }

}
