// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class NoticeInfo extends TeaModel {
    // 通知id
    @NameInMap("notice_id")
    public Long noticeId;

    // 通知标题
    @NameInMap("title")
    public String title;

    // 通知创建时间
    @NameInMap("notice_create_time")
    public String noticeCreateTime;

    // 是否未读
    @NameInMap("unread")
    public Boolean unread;

    public static NoticeInfo build(java.util.Map<String, ?> map) throws Exception {
        NoticeInfo self = new NoticeInfo();
        return TeaModel.build(map, self);
    }

    public NoticeInfo setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
        return this;
    }
    public Long getNoticeId() {
        return this.noticeId;
    }

    public NoticeInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public NoticeInfo setNoticeCreateTime(String noticeCreateTime) {
        this.noticeCreateTime = noticeCreateTime;
        return this;
    }
    public String getNoticeCreateTime() {
        return this.noticeCreateTime;
    }

    public NoticeInfo setUnread(Boolean unread) {
        this.unread = unread;
        return this;
    }
    public Boolean getUnread() {
        return this.unread;
    }

}
