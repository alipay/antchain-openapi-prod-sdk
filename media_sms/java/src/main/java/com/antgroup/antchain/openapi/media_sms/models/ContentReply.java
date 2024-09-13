// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ContentReply extends TeaModel {
    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 用户是否已经退订过
    @NameInMap("reject")
    @Validation(required = true)
    public Boolean reject;

    // 用户最新回复内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 用户回复时间
    @NameInMap("reply_time")
    @Validation(required = true)
    public String replyTime;

    // 拓展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static ContentReply build(java.util.Map<String, ?> map) throws Exception {
        ContentReply self = new ContentReply();
        return TeaModel.build(map, self);
    }

    public ContentReply setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ContentReply setReject(Boolean reject) {
        this.reject = reject;
        return this;
    }
    public Boolean getReject() {
        return this.reject;
    }

    public ContentReply setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContentReply setReplyTime(String replyTime) {
        this.replyTime = replyTime;
        return this;
    }
    public String getReplyTime() {
        return this.replyTime;
    }

    public ContentReply setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
