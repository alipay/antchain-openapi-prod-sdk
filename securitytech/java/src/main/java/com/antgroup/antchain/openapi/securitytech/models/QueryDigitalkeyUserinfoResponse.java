// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyUserinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户ID
    @NameInMap("uid")
    public String uid;

    // 个人简介
    @NameInMap("introduction")
    public String introduction;

    // 用户昵称
    @NameInMap("nick_name")
    public String nickName;

    // 用户头像地址
    @NameInMap("avatar_url")
    public String avatarUrl;

    // 品牌ID
    @NameInMap("brand_id")
    public String brandId;

    public static QueryDigitalkeyUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyUserinfoResponse self = new QueryDigitalkeyUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalkeyUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalkeyUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalkeyUserinfoResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public QueryDigitalkeyUserinfoResponse setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public QueryDigitalkeyUserinfoResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public QueryDigitalkeyUserinfoResponse setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public QueryDigitalkeyUserinfoResponse setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

}
